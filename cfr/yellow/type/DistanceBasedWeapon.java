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
import yellow.entities.units.DisableableWeaponMount;
import yellow.internal.util.YellowUtils;
import yellow.type.DisableableWeapon;

public class DistanceBasedWeapon
extends DisableableWeapon {
    public int distance = 176;

    public DistanceBasedWeapon(String name, String displayName) {
        super(name, displayName);
        this.alwaysContinuous = true;
    }

    @Override
    public void update(Unit unit, WeaponMount mount) {
        boolean shooter;
        super.update(unit, mount);
        boolean bl = shooter = unit.isPlayer() && Mathf.round((float)Mathf.dst((float)unit.x, (float)unit.y, (float)Core.camera.position.x, (float)Core.camera.position.y)) >= this.distance && ((DisableableWeaponMount)mount).enabled;
        if (mount.bullet != null) {
            mount.bullet.keepAlive = shooter;
            if (shooter) {
                mount.bullet.time = 8.0f;
            }
        } else if (shooter) {
            this.shoot(unit, mount, unit.x, unit.y, unit.rotation - 90.0f + this.baseRotation);
        }
        YellowUtils.internalLog(shooter);
    }
}

