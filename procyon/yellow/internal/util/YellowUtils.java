// 
// Decompiled by Procyon v0.6.0
// 

package yellow.internal.util;

import arc.util.io.Streams;
import arc.util.serialization.JsonValue;
import arc.scene.event.Touchable;
import arc.scene.Element;
import arc.scene.ui.Label;
import mindustry.gen.Tex;
import mindustry.ui.Styles;
import arc.graphics.Color;
import arc.scene.style.Drawable;
import mindustry.gen.Unit;
import arc.scene.ui.Dialog;
import arc.scene.ui.layout.Cell;
import arc.scene.ui.layout.Table;
import arc.math.Interp;
import arc.util.Log;
import yellow.YellowPermVars;
import mindustry.Vars;
import arc.math.Mathf;
import arc.util.Http;
import arc.func.Cons;
import arc.files.Fi;
import yellow.type.NameableWeapon;
import yellow.type.DisableableWeapon;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import arc.util.Timer;
import arc.Core;
import arc.util.serialization.JsonReader;

public class YellowUtils
{
    private static final JsonReader jsr;
    private static String strd;
    private static final int requestLimit = 5;
    private static int requestsSent;
    private static float requestLimitResetTime;
    private static boolean statusRequestRunning;
    private static final String[][] choices;
    private static int currentButtons;
    private static boolean once;
    
    public static boolean isEnabled(final String modName) {
        return Core.settings.getBool("mod-" + modName + "-enabled");
    }
    
    public static Timer.Task loop(final float delay, final Runnable run) {
        return Timer.schedule(run, delay, delay, -1);
    }
    
    public static void mirror(final Weapon[] in, final boolean nameable, final boolean disableable, final boolean alternate, final UnitType unit) {
        for (final Weapon weapon : in) {
            final Weapon mog = weapon.copy();
            mog.x = weapon.x - weapon.x * 2.0f;
            mog.baseRotation = weapon.baseRotation * -1.0f;
            if (alternate) {
                mog.reload = weapon.reload * 2.0f;
            }
            mog.name = weapon.name + "-m";
            mog.load();
            if (disableable) {
                ((DisableableWeapon)mog).mirroredVersion = true;
            }
            if (nameable) {
                ((NameableWeapon)mog).displayName = ((NameableWeapon)weapon).displayName + " (Inv)";
            }
            unit.weapons.add((Object)mog);
        }
    }
    
    public static void getAndWrite(final String link, final Fi file, final boolean overwrite, final Cons<Fi> cons) {
        Http.get(link, a -> {
            try {
                if (overwrite && file.exists() && file.readString().isEmpty()) {
                    return;
                }
                Streams.copyProgress(a.getResultAsStream(), file.write(), a.getContentLength(), 4096, l -> {});
                cons.get((Object)file);
            }
            catch (final Exception e) {
                Vars.ui.showException("Http Get Error", (Throwable)e);
            }
        }, err -> Core.app.post(() -> {
            err.printStackTrace();
            Vars.ui.showException("Mod update error", err);
        }));
    }
    
    public static <T> T random(final T[] arr) {
        return arr[Mathf.random(arr.length)];
    }
    
    public static void getWorkflowStatus() {
        if (YellowUtils.requestsSent >= 5) {
            Vars.ui.showInfo("@internal.request-limit-hit");
            return;
        }
        if (YellowUtils.statusRequestRunning) {
            Vars.ui.showInfo("@internal.waiting-for-request");
            return;
        }
        YellowUtils.statusRequestRunning = true;
        Http.get("https://api.github.com/repos/SMOLKEYS/yellow-java/actions/runs", req -> {
            final String res = req.getResultAsString();
            try {
                final JsonValue pros = YellowUtils.jsr.parse(res).get("workflow_runs").get(0);
                final JsonValue cons = YellowUtils.jsr.parse(res).get("workflow_runs").get(1);
                YellowUtils.strd = YellowUtilsKt.INSTANCE.getValues(pros, "name", "display_title", "run_number", "status", "conclusion", "id") + "----------\n" + YellowUtilsKt.INSTANCE.getValues(cons, "name", "display_title", "run_number", "status", "conclusion", "id");
                YellowUtils.statusRequestRunning = false;
                Vars.ui.showMenu("RESULT", YellowUtils.strd, YellowUtils.choices, sel -> {
                    switch (sel) {
                        case 1: {
                            getWorkflowStatus();
                            break;
                        }
                        case 2: {
                            Core.app.openURI("https://github.com/SMOLKEYS/yellow-java");
                            break;
                        }
                    }
                });
            }
            catch (final Exception e) {
                e.printStackTrace();
                Vars.ui.showException("Workflow Status GET Error", (Throwable)e);
                YellowUtils.statusRequestRunning = false;
            }
        }, err -> Core.app.post(() -> {
            err.printStackTrace();
            Vars.ui.showException("Workflow Status GET Error", err);
            YellowUtils.statusRequestRunning = false;
        }));
        ++YellowUtils.requestsSent;
    }
    
    public static void startRequestLimitHandler() {
        loop(YellowUtils.requestLimitResetTime, () -> YellowUtils.requestsSent = 0);
    }
    
    public static void controlledLog(final Object log) {
        if (YellowPermVars.INSTANCE.getVerboseLoggering()) {
            Log.info(log);
        }
    }
    
    public static void internalLog(final Object log) {
        if (YellowPermVars.INSTANCE.getInternalLoggering()) {
            Log.info(log);
        }
    }
    
    public static float combineInterp(final Interp main, final Interp other, final float base) {
        return main.apply(other.apply(base));
    }
    
    public static void table(final Table parent, final Cons<Cell<Table>> child, final Cons<Table> childContents) {
        child.get((Object)parent.table((Cons)childContents));
    }
    
    public static void dialogTable(final Dialog parent, final Cons<Cell<Table>> tableParent, final Cons<Table> tableContents) {
        tableParent.get((Object)parent.cont.table((Cons)tableContents));
    }
    
    public static void unitBar(final Table parent, final UnitType type, final String rightHandText) {
        unitBar(parent, type, rightHandText, -1.0f);
    }
    
    public static void unitBar(final Table parent, final UnitType type, final String rightHandText, final float width) {
        table(parent, (Cons<Cell<Table>>)(c -> {
            if (width < 0.0f) {
                c.growX();
            }
            else {
                c.width(width);
            }
            c.height(65.0f);
        }), (Cons<Table>)(cc -> {
            cc.setBackground(Styles.grayPanel);
            cc.image(type.uiIcon).size(40.0f).padLeft(20.0f);
            cc.add((CharSequence)type.localizedName).grow().left().pad(10.0f);
            cc.add((CharSequence)rightHandText).pad(25.0f);
        }));
    }
    
    public static void foodOpts(final Table parent, final Unit unit, final Cons<Cell<Table>> table, final Cons<Table> tableChildren) {
        table(parent, (Cons<Cell<Table>>)(c -> {
            c.width((float)Core.graphics.getWidth());
            c.height(115.0f);
            table.get((Object)c);
        }), (Cons<Table>)(cc -> {
            cc.setBackground(Tex.pane);
            cc.image(unit.type.uiIcon).size(50.0f).padLeft(20.0f);
            final Cell<Label> suse = (Cell<Label>)cc.add((CharSequence)(unit.type.localizedName + "\n" + Mathf.round(unit.health) + "/" + Mathf.round(unit.maxHealth))).grow().left().pad(15.0f);
            suse.update(up -> {
                if (unit.dead || !unit.isValid()) {
                    up.setText((CharSequence)"[red]DEAD/INVALID[]");
                    cc.getChildren().each(el -> el.touchable = Touchable.disabled);
                }
                else {
                    up.setText((CharSequence)(unit.type.localizedName + "\n" + Mathf.round(unit.health) + "/" + Mathf.round(unit.maxHealth)));
                }
            });
            tableChildren.get((Object)cc);
        }));
    }
    
    public static void mobileHudButton(final Drawable icon, final Runnable listener) {
        if (!Vars.mobile) {
            return;
        }
        final Table but = (Table)Vars.ui.hudGroup.find("mobile buttons");
        if (!YellowUtils.once) {
            YellowUtils.once = true;
            but.row();
        }
        if (YellowUtils.currentButtons == 5) {
            YellowUtils.currentButtons = 0;
            but.image().height(65.0f).width(4.0f).color(Color.darkGray);
            but.row();
        }
        but.table(Styles.none, a -> a.button(icon, Styles.cleari, listener).grow());
        ++YellowUtils.currentButtons;
    }
    
    static {
        jsr = new JsonReader();
        YellowUtils.requestsSent = 0;
        YellowUtils.requestLimitResetTime = 10.0f;
        YellowUtils.statusRequestRunning = false;
        choices = new String[][] { { "@ok", "@internal.checkagain" }, { "@internal.openrepo" } };
        YellowUtils.currentButtons = 0;
        YellowUtils.once = false;
    }
}
