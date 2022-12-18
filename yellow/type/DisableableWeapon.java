// 
// Decompiled by Procyon v0.6.0
// 

package yellow.type;

import mindustry.entities.units.WeaponMount;
import mindustry.gen.Unit;
import yellow.entities.units.DisableableWeaponMount;

public class DisableableWeapon extends NameableWeapon
{
    public boolean mirroredVersion;
    public boolean enabledDefault;
    
    public DisableableWeapon(final String name, final String displayName) {
        super(name, displayName);
        this.mirroredVersion = false;
        this.enabledDefault = true;
        this.mountType = DisableableWeaponMount::new;
    }
    
    public void update(final Unit unit, final WeaponMount mount) {
        if (!((DisableableWeaponMount)mount).enabled) {
            return;
        }
        super.update(unit, mount);
    }
    
    public void draw(final Unit unit, final WeaponMount mount) {
        if (!((DisableableWeaponMount)mount).enabled) {
            return;
        }
        super.draw(unit, mount);
    }
}
