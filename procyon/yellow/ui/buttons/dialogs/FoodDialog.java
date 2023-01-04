// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ui.buttons.dialogs;

import arc.scene.ui.layout.Table;
import mindustry.gen.Tex;
import kotlin.jvm.internal.Intrinsics;
import arc.scene.ui.Dialog;
import org.jetbrains.annotations.NotNull;
import mindustry.game.Team;
import yellow.content.YellowItems;
import mindustry.type.Item;
import kotlin.Metadata;
import mindustry.ui.dialogs.BaseDialog;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lyellow/ui/buttons/dialogs/FoodDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "selectedItem", "Lmindustry/type/Item;", "kotlin.jvm.PlatformType", "getSelectedItem", "()Lmindustry/type/Item;", "setSelectedItem", "(Lmindustry/type/Item;)V", "show", "Larc/scene/ui/Dialog;", "team", "Lmindustry/game/Team;", "yellow-java" })
public class FoodDialog extends BaseDialog
{
    private Item selectedItem;
    
    public FoodDialog() {
        super("Food");
        this.selectedItem = YellowItems.stockItem;
        this.addCloseButton();
    }
    
    public final Item getSelectedItem() {
        return this.selectedItem;
    }
    
    public final void setSelectedItem(final Item <set-?>) {
        this.selectedItem = <set-?>;
    }
    
    @NotNull
    public final Dialog show(@NotNull final Team team) {
        Intrinsics.checkNotNullParameter(team, "team");
        this.cont.clear();
        this.cont.table(Tex.pane, FoodDialog::show$lambda$0).grow();
        this.cont.table(Tex.pane, FoodDialog::show$lambda$1).grow();
        this.cont.row();
        this.cont.table(Tex.pane, FoodDialog::show$lambda$2).grow();
        final Dialog show = super.show();
        Intrinsics.checkNotNullExpressionValue(show, "super.show()");
        return show;
    }
    
    private static final void show$lambda$0(final Table it) {
    }
    
    private static final void show$lambda$1(final Table it) {
    }
    
    private static final void show$lambda$2(final Table it) {
    }
}
