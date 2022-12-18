/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Angles
 *  mindustry.entities.Effect
 *  mindustry.entities.bullet.BasicBulletType
 *  mindustry.gen.Bullet
 */
package yellow.entities.bullet;

import arc.math.Angles;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Bullet;
import yellow.content.YellowFx;

public class YeetBulletType
extends BasicBulletType {
    public float throwForce = 5.0f;
    public float peakMinSpeed = 0.001f;
    public float throwDelay = 5.0f;
    public Effect throwEffect = YellowFx.ghostDespawnMulti;

    public void init(Bullet b) {
        super.init(b);
        b.fdata = this.throwDelay;
    }

    public void update(Bullet b) {
        super.update(b);
        if ((b.vel().len() <= this.peakMinSpeed || this.speed == this.peakMinSpeed) && b.fdata > 0.0f) {
            b.fdata -= 1.0f;
        }
        if (b.fdata <= 0.0f && b.drag != 0.0f) {
            if (this.throwEffect != null) {
                this.throwEffect.at(b.x, b.y);
            }
            b.vel().trns(Angles.angle((float)b.x, (float)b.y, (float)b.aimX, (float)b.aimY), this.throwForce);
            b.drag = 0.0f;
        }
    }
}

