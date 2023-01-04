// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ui.buttons.dialogs;

import mindustry.type.Weapon;
import arc.scene.ui.layout.Table;
import yellow.type.NameableWeapon;
import yellow.entities.units.DisableableWeaponMount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import mindustry.entities.units.WeaponMount;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.Metadata;
import mindustry.ui.dialogs.BaseDialog;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b¨\u0006\t" }, d2 = { "Lyellow/ui/buttons/dialogs/YellowWeaponSwitchDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "show", "", "weapon", "", "Lmindustry/entities/units/WeaponMount;", "([Lmindustry/entities/units/WeaponMount;)V", "yellow-java" })
@SourceDebugExtension({ "SMAP\nYellowWeaponSwitchDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YellowWeaponSwitchDialog.kt\nyellow/ui/buttons/dialogs/YellowWeaponSwitchDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n13579#2,2:37\n*S KotlinDebug\n*F\n+ 1 YellowWeaponSwitchDialog.kt\nyellow/ui/buttons/dialogs/YellowWeaponSwitchDialog\n*L\n25#1:37,2\n*E\n" })
public class YellowWeaponSwitchDialog extends BaseDialog
{
    public YellowWeaponSwitchDialog() {
        super("Weapon Switch");
        this.addCloseButton();
    }
    
    public final void show(@NotNull final WeaponMount[] weapon) {
        Intrinsics.checkNotNullParameter(weapon, "weapon");
        this.cont.clear();
        final Object[] $this$forEach$iv = weapon;
        final int $i$f$forEach = 0;
        for (int i = 0; i < $this$forEach$iv.length; ++i) {
            final WeaponMount it;
            final Object element$iv = it = (WeaponMount)$this$forEach$iv[i];
            final int n = 0;
            if (!(it instanceof DisableableWeaponMount)) {
                return;
            }
            final Table cont = this.cont;
            final Weapon weapon2 = it.weapon;
            Intrinsics.checkNotNull(weapon2, "null cannot be cast to non-null type yellow.type.NameableWeapon");
            cont.check(((NameableWeapon)weapon2).displayName, ((DisableableWeaponMount)it).enabled, YellowWeaponSwitchDialog::show$lambda$1$lambda$0).row();
        }
        super.show();
    }
    
    private static final void show$lambda$1$lambda$0(final WeaponMount $it, final boolean a) {
        Intrinsics.checkNotNullParameter($it, "$it");
        ((DisableableWeaponMount)$it).enabled = a;
        if (((DisableableWeaponMount)$it).enabled) {
            ((DisableableWeaponMount)$it).enabled();
        }
        else {
            ((DisableableWeaponMount)$it).disabled();
        }
    }
}
