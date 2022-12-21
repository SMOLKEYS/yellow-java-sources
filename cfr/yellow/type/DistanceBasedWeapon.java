/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.math.Mathf
 *  mindustry.entities.units.WeaponMount
 *  mindustry.gen.Unit
 */
package yellow.type;

import arc.Core;
import arc.math.Mathf;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.Unit;
import yellow.entities.units.DistanceBasedWeaponMount;
import yellow.internal.util.YellowUtils;
import yellow.type.DisableableWeapon;

public class DistanceBasedWeapon
extends DisableableWeapon {
    public int distance = 176;
    public float holdTime = 0.0f;

    public DistanceBasedWeapon(String name, String displayName) {
        super(name, displayName);
        this.alwaysContinuous = true;
        this.mountType = DistanceBasedWeaponMount::new;
    }

    @Override
    public void update(Unit unit, WeaponMount mount) {
        boolean shooter;
        super.update(unit, mount);
        DistanceBasedWeaponMount mount1 = (DistanceBasedWeaponMount)mount;
        boolean bl = shooter = unit.isPlayer() && Mathf.round((float)Mathf.dst((float)unit.x, (float)unit.y, (float)Core.camera.position.x, (float)Core.camera.position.y)) >= this.distance && mount1.enabled;
        mount1.shootTime = shooter ? (mount1.shootTime += 1.0f) : 0.0f;
        if (mount1.bullet != null && mount1.shootTime >= this.holdTime) {
            mount1.bullet.keepAlive = shooter;
            if (shooter) {
                mount1.bullet.time = 8.0f;
            }
        } else if (shooter && mount1.shootTime >= this.holdTime) {
            this.shoot(unit, mount1, unit.x, unit.y, unit.rotation - 90.0f + this.baseRotation);
        }
        YellowUtils.internalLog(shooter);
    }
}

