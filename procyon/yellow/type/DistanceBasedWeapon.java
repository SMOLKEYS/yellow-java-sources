// 
// Decompiled by Procyon v0.6.0
// 

package yellow.type;

import yellow.internal.util.YellowUtils;
import yellow.entities.units.DisableableWeaponMount;
import arc.math.Mathf;
import arc.Core;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.Unit;

public class DistanceBasedWeapon extends DisableableWeapon
{
    public int distance;
    
    public DistanceBasedWeapon(final String name, final String displayName) {
        super(name, displayName);
        this.distance = 176;
        this.alwaysContinuous = true;
    }
    
    @Override
    public void update(final Unit unit, final WeaponMount mount) {
        super.update(unit, mount);
        final boolean shooter = unit.isPlayer() && Mathf.round(Mathf.dst(unit.x, unit.y, Core.camera.position.x, Core.camera.position.y)) >= this.distance && ((DisableableWeaponMount)mount).enabled;
        if (mount.bullet != null) {
            mount.bullet.keepAlive = shooter;
            if (shooter) {
                mount.bullet.time = 8.0f;
            }
        }
        else if (shooter) {
            this.shoot(unit, mount, unit.x, unit.y, unit.rotation - 90.0f + this.baseRotation);
        }
        YellowUtils.internalLog(Boolean.valueOf(shooter));
    }
}
