// 
// Decompiled by Procyon v0.6.0
// 

package yellow.type;

import yellow.internal.util.YellowUtils;
import arc.math.Mathf;
import arc.Core;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.Unit;
import yellow.entities.units.DistanceBasedWeaponMount;

public class DistanceBasedWeapon extends DisableableWeapon
{
    public int distance;
    public float holdTime;
    
    public DistanceBasedWeapon(final String name, final String displayName) {
        super(name, displayName);
        this.distance = 176;
        this.holdTime = 0.0f;
        this.alwaysContinuous = true;
        this.mountType = DistanceBasedWeaponMount::new;
    }
    
    @Override
    public void update(final Unit unit, final WeaponMount mount) {
        super.update(unit, mount);
        final DistanceBasedWeaponMount mount2 = (DistanceBasedWeaponMount)mount;
        final boolean shooter = unit.isPlayer() && Mathf.round(Mathf.dst(unit.x, unit.y, Core.camera.position.x, Core.camera.position.y)) >= this.distance && mount2.enabled;
        if (shooter) {
            final DistanceBasedWeaponMount distanceBasedWeaponMount = mount2;
            ++distanceBasedWeaponMount.shootTime;
        }
        else {
            mount2.shootTime = 0.0f;
        }
        if (mount2.bullet != null && mount2.shootTime >= this.holdTime) {
            mount2.bullet.keepAlive = shooter;
            if (shooter) {
                mount2.bullet.time = 8.0f;
            }
        }
        else if (shooter && mount2.shootTime >= this.holdTime) {
            this.shoot(unit, (WeaponMount)mount2, unit.x, unit.y, unit.rotation - 90.0f + this.baseRotation);
        }
        YellowUtils.internalLog(Boolean.valueOf(shooter));
    }
}
