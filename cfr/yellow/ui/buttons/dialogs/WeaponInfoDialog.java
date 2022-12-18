/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.graphics.Color
 *  arc.scene.Element
 *  arc.scene.ui.Dialog
 *  arc.scene.ui.Label
 *  arc.scene.ui.ScrollPane
 *  arc.scene.ui.layout.Table
 *  mindustry.graphics.Pal
 *  mindustry.ui.dialogs.BaseDialog
 */
package yellow.ui.buttons.dialogs;

import arc.Core;
import arc.graphics.Color;
import arc.scene.Element;
import arc.scene.ui.Dialog;
import arc.scene.ui.Label;
import arc.scene.ui.ScrollPane;
import arc.scene.ui.layout.Table;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.graphics.Pal;
import mindustry.ui.dialogs.BaseDialog;
import org.jetbrains.annotations.NotNull;
import yellow.internal.util.YellowUtilsKtKt;
import yellow.type.NameableWeapon;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lyellow/ui/buttons/dialogs/WeaponInfoDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "show", "Larc/scene/ui/Dialog;", "weapon", "Lyellow/type/NameableWeapon;", "yellow-java"})
public class WeaponInfoDialog
extends BaseDialog {
    public WeaponInfoDialog() {
        super("Weapon Info");
        this.addCloseButton();
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Dialog show(@NotNull NameableWeapon weapon) {
        void $this$show_u24lambda_u241;
        StringBuilder stringBuilder;
        Intrinsics.checkNotNullParameter((Object)weapon, "weapon");
        this.cont.clear();
        Table info = new Table();
        info.margin(10.0f);
        info.table(arg_0 -> WeaponInfoDialog.show$lambda$0(weapon, arg_0)).row();
        info.add((CharSequence)"Description").color(Pal.accent).fillX().padTop(10.0f).row();
        ((Label)info.add((CharSequence)weapon.description).color(Color.lightGray).get()).setWrap(true);
        info.row();
        info.add((CharSequence)"General Stats").color(Pal.accent).fillX().padTop(3.0f).row();
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        Table table = info;
        boolean bl = false;
        $this$show_u24lambda_u241.append("[lightgray]Reload:[] " + weapon.reload / 60.0f + " seconds\n");
        $this$show_u24lambda_u241.append("[lightgray]X, Y:[] " + weapon.x + ", " + weapon.y + '\n');
        $this$show_u24lambda_u241.append("[lightgray]Rotate:[] " + YellowUtilsKtKt.yesNo(weapon.rotate) + '\n');
        $this$show_u24lambda_u241.append("[lightgray]Shoot Cone:[] " + weapon.shootCone + " degrees\n");
        $this$show_u24lambda_u241.append("[lightgray]Rotate Speed:[] " + weapon.rotateSpeed + " degrees\n");
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        table.add((CharSequence)string);
        ScrollPane paenu = new ScrollPane((Element)info);
        this.cont.add((Element)paenu);
        Dialog dialog = super.show();
        Intrinsics.checkNotNullExpressionValue(dialog, "super.show()");
        return dialog;
    }

    private static final void show$lambda$0(NameableWeapon $weapon, Table it) {
        Intrinsics.checkNotNullParameter((Object)$weapon, "$weapon");
        it.image(Core.atlas.drawable("status-disarmed")).size(50.0f);
        it.add((CharSequence)("[accent]" + $weapon.displayName + "[]"));
    }
}

