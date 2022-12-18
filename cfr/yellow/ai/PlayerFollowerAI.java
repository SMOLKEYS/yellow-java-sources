/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Mathf
 *  arc.math.geom.Position
 *  arc.util.Tmp
 *  mindustry.entities.units.AIController
 *  mindustry.entities.units.WeaponMount
 *  mindustry.gen.Building
 *  mindustry.gen.Groups
 *  mindustry.gen.Unit
 */
package yellow.ai;

import arc.math.Mathf;
import arc.math.geom.Position;
import arc.util.Tmp;
import mindustry.entities.units.AIController;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.Building;
import mindustry.gen.Groups;
import mindustry.gen.Unit;

public class PlayerFollowerAI
extends AIController {
    protected Unit target;
    protected Building noTarget;
    protected boolean followingUnit = false;
    protected float targetXR;
    protected float targetYR;
    protected int time;

    public void updateMovement() {
        ++this.time;
        Groups.unit.each(unor -> {
            if (unor.isPlayer() && unor.team == this.unit.team && !this.followingUnit) {
                this.target = unor;
                this.followingUnit = true;
            } else {
                this.followingUnit = false;
            }
        });
        if (this.target != null) {
            if (this.time % 180 == 0) {
                this.targetXR = Mathf.range((float)120.0f);
                this.targetYR = Mathf.range((float)120.0f);
            }
            if (this.target.isShooting) {
                this.moveTo((Position)Tmp.v1.set(this.target.aimX + this.targetXR, this.target.aimY + this.targetYR), 5.0f);
                this.unit.lookAt(this.target.aimX, this.target.aimY);
                for (WeaponMount mount : this.unit.mounts) {
                    mount.shoot = true;
                }
            } else if (!this.target.dead) {
                this.circle((Position)this.target, this.target.hitSize * 5.0f);
            } else {
                this.followingUnit = false;
                this.target = null;
            }
        }
    }
}

