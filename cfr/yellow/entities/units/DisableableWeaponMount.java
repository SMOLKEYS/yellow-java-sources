/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.util.io.Reads
 *  arc.util.io.Writes
 *  mindustry.entities.units.WeaponMount
 *  mindustry.type.Weapon
 */
package yellow.entities.units;

import arc.util.io.Reads;
import arc.util.io.Writes;
import mindustry.entities.units.WeaponMount;
import mindustry.type.Weapon;
import yellow.type.DisableableWeapon;

public class DisableableWeaponMount
extends WeaponMount {
    public boolean enabled = true;

    public DisableableWeaponMount(Weapon weapon) {
        super(weapon);
        this.enabled = ((DisableableWeapon)weapon).enabledDefault;
    }

    public void write(Writes write) {
    }

    public void read(Reads read) {
    }

    public void enabled() {
    }

    public void disabled() {
    }
}

