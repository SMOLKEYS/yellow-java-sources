/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.entities.units.WeaponMount
 *  mindustry.gen.Unit
 */
package yellow.type;

import mindustry.entities.units.WeaponMount;
import mindustry.gen.Unit;
import yellow.entities.units.DisableableWeaponMount;
import yellow.type.NameableWeapon;

public class DisableableWeapon
extends NameableWeapon {
    public boolean mirroredVersion = false;
    public boolean enabledDefault = true;

    public DisableableWeapon(String name, String displayName) {
        super(name, displayName);
        this.mountType = DisableableWeaponMount::new;
    }

    public void update(Unit unit, WeaponMount mount) {
        if (!((DisableableWeaponMount)mount).enabled) {
            return;
        }
        super.update(unit, mount);
    }

    public void draw(Unit unit, WeaponMount mount) {
        if (!((DisableableWeaponMount)mount).enabled) {
            return;
        }
        super.draw(unit, mount);
    }
}

