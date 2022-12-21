// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.units;

import mindustry.type.Weapon;

public class DistanceBasedWeaponMount extends DisableableWeaponMount
{
    public float shootTime;
    
    public DistanceBasedWeaponMount(final Weapon weapon) {
        super(weapon);
        this.shootTime = 0.0f;
    }
}
