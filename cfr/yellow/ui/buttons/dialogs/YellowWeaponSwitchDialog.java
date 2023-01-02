/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.entities.units.WeaponMount
 *  mindustry.type.Weapon
 *  mindustry.ui.dialogs.BaseDialog
 */
package yellow.ui.buttons.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.entities.units.WeaponMount;
import mindustry.type.Weapon;
import mindustry.ui.dialogs.BaseDialog;
import org.jetbrains.annotations.NotNull;
import yellow.entities.units.DisableableWeaponMount;
import yellow.type.NameableWeapon;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2={"Lyellow/ui/buttons/dialogs/YellowWeaponSwitchDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "show", "", "weapon", "", "Lmindustry/entities/units/WeaponMount;", "([Lmindustry/entities/units/WeaponMount;)V", "yellow-java"})
public class YellowWeaponSwitchDialog
extends BaseDialog {
    public YellowWeaponSwitchDialog() {
        super("Weapon Switch");
        this.addCloseButton();
    }

    public final void show(@NotNull WeaponMount[] weapon) {
        Intrinsics.checkNotNullParameter(weapon, "weapon");
        this.cont.clear();
        WeaponMount[] $this$forEach$iv = weapon;
        boolean $i$f$forEach = false;
        int n = $this$forEach$iv.length;
        for (int j = 0; j < n; ++j) {
            WeaponMount element$iv;
            WeaponMount it = element$iv = $this$forEach$iv[j];
            boolean bl = false;
            if (!(it instanceof DisableableWeaponMount)) {
                return;
            }
            Weapon weapon2 = it.weapon;
            Intrinsics.checkNotNull(weapon2, "null cannot be cast to non-null type yellow.type.NameableWeapon");
            this.cont.check(((NameableWeapon)weapon2).displayName, ((DisableableWeaponMount)it).enabled, arg_0 -> YellowWeaponSwitchDialog.show$lambda$1$lambda$0(it, arg_0)).row();
        }
        super.show();
    }

    private static final void show$lambda$1$lambda$0(WeaponMount $it, boolean a) {
        Intrinsics.checkNotNullParameter($it, "$it");
        ((DisableableWeaponMount)$it).enabled = a;
        if (((DisableableWeaponMount)$it).enabled) {
            ((DisableableWeaponMount)$it).enabled();
        } else {
            ((DisableableWeaponMount)$it).disabled();
        }
    }
}

