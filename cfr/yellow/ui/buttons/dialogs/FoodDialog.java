/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.scene.Element
 *  arc.scene.style.Drawable
 *  arc.scene.ui.Dialog
 *  arc.scene.ui.layout.Cell
 *  arc.scene.ui.layout.Table
 *  mindustry.game.Team
 *  mindustry.gen.Tex
 *  mindustry.type.Item
 *  mindustry.ui.dialogs.BaseDialog
 */
package yellow.ui.buttons.dialogs;

import arc.scene.Element;
import arc.scene.style.Drawable;
import arc.scene.ui.Dialog;
import arc.scene.ui.layout.Cell;
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
        Table it$iv;
        Table $this$addTable$iv;
        Table table;
        Intrinsics.checkNotNullParameter(team, "team");
        this.cont.clear();
        Table table2 = this.cont;
        Intrinsics.checkNotNullExpressionValue(table2, "cont");
        Table table3 = table2;
        Drawable drawable = Tex.pane;
        Intrinsics.checkNotNullExpressionValue(drawable, "pane");
        Drawable background$iv = drawable;
        boolean $i$f$addTable = false;
        Table table4 = table = new Table(background$iv);
        Table table5 = $this$addTable$iv;
        boolean bl = false;
        void $this$show_u24lambda_u240 = it$iv;
        boolean bl2 = false;
        Cell cell = table5.add((Element)table);
        Intrinsics.checkNotNullExpressionValue(cell, "add(Table(background).al\u2026 {\n\t\tit.constructor()\n\t})");
        cell.grow();
        Table table6 = this.cont;
        Intrinsics.checkNotNullExpressionValue(table6, "cont");
        $this$addTable$iv = table6;
        Drawable drawable2 = Tex.pane;
        Intrinsics.checkNotNullExpressionValue(drawable2, "pane");
        background$iv = drawable2;
        $i$f$addTable = false;
        it$iv = table = new Table(background$iv);
        table5 = $this$addTable$iv;
        bl = false;
        Table $this$show_u24lambda_u241 = it$iv;
        boolean bl3 = false;
        Cell cell2 = table5.add((Element)table);
        Intrinsics.checkNotNullExpressionValue(cell2, "add(Table(background).al\u2026 {\n\t\tit.constructor()\n\t})");
        cell2.grow();
        this.cont.row();
        Table table7 = this.cont;
        Intrinsics.checkNotNullExpressionValue(table7, "cont");
        $this$addTable$iv = table7;
        Drawable drawable3 = Tex.pane;
        Intrinsics.checkNotNullExpressionValue(drawable3, "pane");
        background$iv = drawable3;
        $i$f$addTable = false;
        it$iv = table = new Table(background$iv);
        table5 = $this$addTable$iv;
        bl = false;
        Table $this$show_u24lambda_u242 = it$iv;
        boolean bl4 = false;
        Cell cell3 = table5.add((Element)table);
        Intrinsics.checkNotNullExpressionValue(cell3, "add(Table(background).al\u2026 {\n\t\tit.constructor()\n\t})");
        cell3.grow();
        Dialog dialog = super.show();
        Intrinsics.checkNotNullExpressionValue(dialog, "super.show()");
        return dialog;
    }
}

