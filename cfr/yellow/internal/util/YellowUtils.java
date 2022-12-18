/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.files.Fi
 *  arc.func.Cons
 *  arc.graphics.Color
 *  arc.math.Interp
 *  arc.math.Mathf
 *  arc.scene.event.Touchable
 *  arc.scene.style.Drawable
 *  arc.scene.ui.Dialog
 *  arc.scene.ui.layout.Cell
 *  arc.scene.ui.layout.Table
 *  arc.util.Http
 *  arc.util.Log
 *  arc.util.Timer
 *  arc.util.Timer$Task
 *  arc.util.io.Streams
 *  arc.util.serialization.JsonReader
 *  arc.util.serialization.JsonValue
 *  mindustry.Vars
 *  mindustry.gen.Tex
 *  mindustry.gen.Unit
 *  mindustry.type.UnitType
 *  mindustry.type.Weapon
 *  mindustry.ui.Styles
 */
package yellow.internal.util;

import arc.Core;
import arc.files.Fi;
import arc.func.Cons;
import arc.graphics.Color;
import arc.math.Interp;
import arc.math.Mathf;
import arc.scene.event.Touchable;
import arc.scene.style.Drawable;
import arc.scene.ui.Dialog;
import arc.scene.ui.layout.Cell;
import arc.scene.ui.layout.Table;
import arc.util.Http;
import arc.util.Log;
import arc.util.Timer;
import arc.util.io.Streams;
import arc.util.serialization.JsonReader;
import arc.util.serialization.JsonValue;
import java.io.InputStream;
import java.io.OutputStream;
import mindustry.Vars;
import mindustry.gen.Tex;
import mindustry.gen.Unit;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.ui.Styles;
import yellow.YellowPermVars;
import yellow.internal.util.YellowUtilsKt;
import yellow.type.DisableableWeapon;
import yellow.type.NameableWeapon;

public class YellowUtils {
    private static final JsonReader jsr = new JsonReader();
    private static String strd;
    private static final int requestLimit = 5;
    private static int requestsSent;
    private static float requestLimitResetTime;
    private static boolean statusRequestRunning;
    private static final String[][] choices;
    private static int currentButtons;
    private static boolean once;

    public static boolean isEnabled(String modName) {
        return Core.settings.getBool("mod-" + modName + "-enabled");
    }

    public static Timer.Task loop(float delay, Runnable run) {
        return Timer.schedule((Runnable)run, (float)delay, (float)delay, (int)-1);
    }

    public static void mirror(Weapon[] in, boolean nameable, boolean disableable, boolean alternate, UnitType unit) {
        for (Weapon weapon : in) {
            Weapon mog = weapon.copy();
            mog.x = weapon.x - weapon.x * 2.0f;
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

    public static void getAndWrite(String link, Fi file, boolean overwrite, Cons<Fi> cons) {
        Http.get((String)link, a -> {
            try {
                if (overwrite && file.exists() && file.readString().isEmpty()) {
                    return;
                }
                Streams.copyProgress((InputStream)a.getResultAsStream(), (OutputStream)file.write(), (long)a.getContentLength(), (int)4096, l -> {});
                cons.get((Object)file);
            }
            catch (Exception e) {
                Vars.ui.showException("Http Get Error", (Throwable)e);
            }
        }, err -> Core.app.post(() -> {
            err.printStackTrace();
            Vars.ui.showException("Mod update error", err);
        }));
    }

    public static <T> T random(T[] arr) {
        return arr[Mathf.random((int)arr.length)];
    }

    public static void getWorkflowStatus() {
        if (requestsSent >= 5) {
            Vars.ui.showInfo("@internal.request-limit-hit");
            return;
        }
        if (statusRequestRunning) {
            Vars.ui.showInfo("@internal.waiting-for-request");
            return;
        }
        statusRequestRunning = true;
        Http.get((String)"https://api.github.com/repos/SMOLKEYS/yellow-java/actions/runs", req -> {
            String res = req.getResultAsString();
            try {
                JsonValue pros = jsr.parse(res).get("workflow_runs").get(0);
                JsonValue cons = jsr.parse(res).get("workflow_runs").get(1);
                strd = YellowUtilsKt.INSTANCE.getValues(pros, "name", "display_title", "run_number", "status", "conclusion", "id") + "----------\n" + YellowUtilsKt.INSTANCE.getValues(cons, "name", "display_title", "run_number", "status", "conclusion", "id");
                statusRequestRunning = false;
                Vars.ui.showMenu("RESULT", strd, choices, sel -> {
                    switch (sel) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            YellowUtils.getWorkflowStatus();
                            break;
                        }
                        case 2: {
                            Core.app.openURI("https://github.com/SMOLKEYS/yellow-java");
                        }
                    }
                });
            }
            catch (Exception e) {
                e.printStackTrace();
                Vars.ui.showException("Workflow Status GET Error", (Throwable)e);
                statusRequestRunning = false;
            }
        }, err -> Core.app.post(() -> {
            err.printStackTrace();
            Vars.ui.showException("Workflow Status GET Error", err);
            statusRequestRunning = false;
        }));
        ++requestsSent;
    }

    public static void startRequestLimitHandler() {
        YellowUtils.loop(requestLimitResetTime, () -> {
            requestsSent = 0;
        });
    }

    public static void controlledLog(Object log) {
        if (YellowPermVars.INSTANCE.getVerboseLoggering()) {
            Log.info((Object)log);
        }
    }

    public static void internalLog(Object log) {
        if (YellowPermVars.INSTANCE.getInternalLoggering()) {
            Log.info((Object)log);
        }
    }

    public static float combineInterp(Interp main, Interp other, float base) {
        return main.apply(other.apply(base));
    }

    public static void table(Table parent, Cons<Cell<Table>> child, Cons<Table> childContents) {
        child.get((Object)parent.table(childContents));
    }

    public static void dialogTable(Dialog parent, Cons<Cell<Table>> tableParent, Cons<Table> tableContents) {
        tableParent.get((Object)parent.cont.table(tableContents));
    }

    public static void unitBar(Table parent, UnitType type, String rightHandText) {
        YellowUtils.unitBar(parent, type, rightHandText, -1.0f);
    }

    public static void unitBar(Table parent, UnitType type, String rightHandText, float width) {
        YellowUtils.table(parent, (Cons<Cell<Table>>)((Cons)c -> {
            if (width < 0.0f) {
                c.growX();
            } else {
                c.width(width);
            }
            c.height(65.0f);
        }), (Cons<Table>)((Cons)cc -> {
            cc.setBackground(Styles.grayPanel);
            cc.image(type.uiIcon).size(40.0f).padLeft(20.0f);
            cc.add((CharSequence)type.localizedName).grow().left().pad(10.0f);
            cc.add((CharSequence)rightHandText).pad(25.0f);
        }));
    }

    public static void foodOpts(Table parent, Unit unit, Cons<Cell<Table>> table, Cons<Table> tableChildren) {
        YellowUtils.table(parent, (Cons<Cell<Table>>)((Cons)c -> {
            c.width((float)Core.graphics.getWidth());
            c.height(115.0f);
            table.get(c);
        }), (Cons<Table>)((Cons)cc -> {
            cc.setBackground(Tex.pane);
            cc.image(unit.type.uiIcon).size(50.0f).padLeft(20.0f);
            Cell suse = cc.add((CharSequence)(unit.type.localizedName + "\n" + Mathf.round((float)unit.health) + "/" + Mathf.round((float)unit.maxHealth))).grow().left().pad(15.0f);
            suse.update(up -> {
                if (unit.dead || !unit.isValid()) {
                    up.setText((CharSequence)"[red]DEAD/INVALID[]");
                    cc.getChildren().each(el -> {
                        el.touchable = Touchable.disabled;
                    });
                } else {
                    up.setText((CharSequence)(unit.type.localizedName + "\n" + Mathf.round((float)unit.health) + "/" + Mathf.round((float)unit.maxHealth)));
                }
            });
            tableChildren.get(cc);
        }));
    }

    public static void mobileHudButton(Drawable icon, Runnable listener) {
        if (!Vars.mobile) {
            return;
        }
        Table but = (Table)Vars.ui.hudGroup.find("mobile buttons");
        if (!once) {
            once = true;
            but.row();
        }
        if (currentButtons == 5) {
            currentButtons = 0;
            but.image().height(65.0f).width(4.0f).color(Color.darkGray);
            but.row();
        }
        but.table(Styles.none, a -> a.button(icon, Styles.cleari, listener).grow());
        ++currentButtons;
    }

    static {
        requestsSent = 0;
        requestLimitResetTime = 10.0f;
        statusRequestRunning = false;
        choices = new String[][]{{"@ok", "@internal.checkagain"}, {"@internal.openrepo"}};
        currentButtons = 0;
        once = false;
    }
}

