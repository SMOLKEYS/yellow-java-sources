/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.files.Fi
 *  arc.func.Cons
 *  arc.scene.Element
 *  arc.scene.style.Drawable
 *  arc.scene.ui.TextButton
 *  arc.scene.ui.TextButton$TextButtonStyle
 *  arc.scene.ui.layout.Table
 *  mindustry.Vars
 *  mindustry.gen.Icon
 *  mindustry.ui.Styles
 *  mindustry.ui.dialogs.SettingsMenuDialog$SettingsTable
 */
package yellow.ui;

import arc.Core;
import arc.files.Fi;
import arc.func.Cons;
import arc.scene.Element;
import arc.scene.style.Drawable;
import arc.scene.ui.TextButton;
import arc.scene.ui.layout.Table;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mindustry.Vars;
import mindustry.gen.Icon;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.SettingsMenuDialog;
import org.jetbrains.annotations.NotNull;
import yellow.YellowPermVars;
import yellow.internal.util.YellowUtils;
import yellow.ui.YellowSettings;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lyellow/ui/YellowSettings;", "", "()V", "tmpDir", "Larc/files/Fi;", "getTmpDir", "()Larc/files/Fi;", "load", "", "yellow-java"})
@SourceDebugExtension(value={"SMAP\nYellowSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YellowSettings.kt\nyellow/ui/YellowSettings\n+ 2 ButtonDsl.kt\ncom/github/mnemotechnician/mkui/extensions/dsl/ButtonDslKt\n*L\n1#1,66:1\n30#2,10:67\n30#2,10:77\n*S KotlinDebug\n*F\n+ 1 YellowSettings.kt\nyellow/ui/YellowSettings\n*L\n50#1:67,10\n60#1:77,10\n*E\n"})
public final class YellowSettings {
    @NotNull
    public static final YellowSettings INSTANCE = new YellowSettings();
    @NotNull
    private static final Fi tmpDir;

    private YellowSettings() {
    }

    @NotNull
    public final Fi getTmpDir() {
        return tmpDir;
    }

    @JvmStatic
    public static final void load() {
        Vars.ui.settings.addCategory("Yellow (Java)", (Drawable)Icon.right, YellowSettings::load$lambda$7);
    }

    private static final void load$lambda$7$lambda$0(boolean it) {
        YellowPermVars.INSTANCE.setVerboseLoggering(it);
    }

    private static final void load$lambda$7$lambda$1(boolean it) {
        YellowPermVars.INSTANCE.setInternalLoggering(it);
    }

    private static final void load$lambda$7$lambda$2(boolean it) {
        YellowPermVars.INSTANCE.setWeaponSanityCheck(it);
    }

    private static final void load$lambda$7$lambda$3(String it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (StringsKt.isBlank(it)) {
            YellowPermVars.INSTANCE.setSourceBERepo("https://github.com/SMOLKEYS/yellow-java-builds/releases/latest/download/yellow-java.jar");
        } else {
            YellowPermVars.INSTANCE.setSourceBERepo(it);
        }
    }

    private static final void load$lambda$7$lambda$4(String it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (StringsKt.isBlank(it)) {
            YellowPermVars.INSTANCE.setSourceReleaseRepo("https://github.com/SMOLKEYS/yellow-java/releases/latest/download/yellow-java.jar");
        } else {
            YellowPermVars.INSTANCE.setSourceReleaseRepo(it);
        }
    }

    private static final void load$lambda$7(SettingsMenuDialog.SettingsTable table) {
        TextButton it$iv;
        Table $this$textButton_u24default$iv;
        String text$iv;
        TextButton textButton2;
        table.checkPref("Verbose Logging", false, YellowSettings::load$lambda$7$lambda$0);
        table.checkPref("Internal Logging", false, YellowSettings::load$lambda$7$lambda$1);
        table.checkPref("Disable Allied Yellow Unit Weapons On World Reload", true, YellowSettings::load$lambda$7$lambda$2);
        table.textPref("Source BE Repo", YellowPermVars.INSTANCE.getSourceBERepo(), YellowSettings::load$lambda$7$lambda$3);
        table.textPref("Source Repo", YellowPermVars.INSTANCE.getSourceReleaseRepo(), YellowSettings::load$lambda$7$lambda$4);
        table.row();
        Intrinsics.checkNotNullExpressionValue(table, "table");
        Table table2 = (Table)table;
        String string = "Update\n(Do not spam!)";
        boolean wrap$iv = false;
        TextButton.TextButtonStyle textButtonStyle = Styles.defaultt;
        Intrinsics.checkNotNullExpressionValue(textButtonStyle, "defaultt");
        TextButton.TextButtonStyle style$iv = textButtonStyle;
        boolean $i$f$textButton = false;
        TextButton textButton3 = textButton2 = new TextButton(text$iv, style$iv);
        Table table3 = $this$textButton_u24default$iv;
        boolean bl = false;
        it$iv.clicked(new Runnable(it$iv){
            final /* synthetic */ TextButton $it;
            {
                this.$it = $it;
            }

            public final void run() {
                TextButton $this$load_u24lambda_u247_u24lambda_u245 = this.$it;
                boolean bl = false;
                YellowUtils.getAndWrite(YellowPermVars.INSTANCE.getSourceBERepo(), YellowSettings.INSTANCE.getTmpDir(), true, (Cons<Fi>)load.1.6.1.INSTANCE);
            }
        });
        it$iv.getLabel().setWrap(wrap$iv);
        Intrinsics.checkNotNullExpressionValue(table3.add((Element)textButton2), "add(TextButton(text, sty\u2026t.label.setWrap(wrap)\n\t})");
        table.row();
        $this$textButton_u24default$iv = (Table)table;
        text$iv = "Check Status";
        wrap$iv = false;
        TextButton.TextButtonStyle textButtonStyle2 = Styles.defaultt;
        Intrinsics.checkNotNullExpressionValue(textButtonStyle2, "defaultt");
        style$iv = textButtonStyle2;
        $i$f$textButton = false;
        it$iv = textButton2 = new TextButton(text$iv, style$iv);
        table3 = $this$textButton_u24default$iv;
        bl = false;
        it$iv.clicked(new Runnable(it$iv){
            final /* synthetic */ TextButton $it;
            {
                this.$it = $it;
            }

            public final void run() {
                TextButton $this$load_u24lambda_u247_u24lambda_u246 = this.$it;
                boolean bl = false;
                YellowUtils.getWorkflowStatus();
            }
        });
        it$iv.getLabel().setWrap(wrap$iv);
        Intrinsics.checkNotNullExpressionValue(table3.add((Element)textButton2), "add(TextButton(text, sty\u2026t.label.setWrap(wrap)\n\t})");
    }

    static {
        Fi fi = Core.settings.getDataDirectory().child("yellow.jar");
        Intrinsics.checkNotNullExpressionValue(fi, "settings.dataDirectory.child(\"yellow.jar\")");
        tmpDir = fi;
    }
}

