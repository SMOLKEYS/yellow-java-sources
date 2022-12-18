// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.units;

import arc.util.io.Reads;
import arc.util.io.Writes;
import yellow.type.DisableableWeapon;
import mindustry.type.Weapon;
import mindustry.entities.units.WeaponMount;

public class DisableableWeaponMount extends WeaponMount
{
    public boolean enabled;
    
    public DisableableWeaponMount(final Weapon weapon) {
        super(weapon);
        this.enabled = true;
        this.enabled = ((DisableableWeapon)weapon).enabledDefault;
    }
    
    public void write(final Writes write) {
        write.bool(this.enabled);
    }
    
    public void read(final Reads read) {
        try {
            this.enabled = read.bool();
        }
        catch (final Exception e) {
            this.enabled = ((DisableableWeapon)this.weapon).enabledDefault;
        }
    }
    
    public void enabled() {
    }
    
    public void disabled() {
    }
}
