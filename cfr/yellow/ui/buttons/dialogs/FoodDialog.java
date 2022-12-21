/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.scene.ui.Dialog
 *  arc.scene.ui.layout.Table
 *  mindustry.game.Team
 *  mindustry.gen.Tex
 *  mindustry.type.Item
 *  mindustry.ui.dialogs.BaseDialog
 */
package yellow.ui.buttons.dialogs;

import arc.scene.ui.Dialog;
import arc.scene.ui.layout.Table;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.game.Team;
import mindustry.gen.Tex;
import mindustry.type.Item;
import mindustry.ui.dialogs.BaseDialog;
import org.jetbrains.annotations.NotNull;
import yellow.content.YellowItems;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2={"Lyellow/ui/buttons/dialogs/FoodDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "selectedItem", "Lmindustry/type/Item;", "kotlin.jvm.PlatformType", "getSelectedItem", "()Lmindustry/type/Item;", "setSelectedItem", "(Lmindustry/type/Item;)V", "show", "Larc/scene/ui/Dialog;", "team", "Lmindustry/game/Team;", "yellow-java"})
public class FoodDialog
extends BaseDialog {
    private Item selectedItem = YellowItems.stockItem;

    public FoodDialog() {
        super("Food");
        this.addCloseButton();
    }

    public final Item getSelectedItem() {
        return this.selectedItem;
    }

    public final void setSelectedItem(Item item) {
        this.selectedItem = item;
    }

    @NotNull
    public final Dialog show(@NotNull Team team) {
        Intrinsics.checkNotNullParameter(team, "team");
        this.cont.clear();
        this.cont.table(Tex.pane, FoodDialog::show$lambda$0).grow();
        this.cont.table(Tex.pane, FoodDialog::show$lambda$1).grow();
        this.cont.row();
        this.cont.table(Tex.pane, FoodDialog::show$lambda$2).grow();
        Dialog dialog = super.show();
        Intrinsics.checkNotNullExpressionValue(dialog, "super.show()");
        return dialog;
    }

    private static final void show$lambda$0(Table it) {
    }

    private static final void show$lambda$1(Table it) {
    }

    private static final void show$lambda$2(Table it) {
    }
}

