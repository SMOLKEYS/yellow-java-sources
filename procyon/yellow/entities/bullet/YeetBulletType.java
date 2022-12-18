// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.bullet;

import arc.math.Angles;
import mindustry.gen.Bullet;
import yellow.content.YellowFx;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BasicBulletType;

public class YeetBulletType extends BasicBulletType
{
    public float throwForce;
    public float peakMinSpeed;
    public float throwDelay;
    public Effect throwEffect;
    
    public YeetBulletType() {
        this.throwForce = 5.0f;
        this.peakMinSpeed = 0.001f;
        this.throwDelay = 5.0f;
        this.throwEffect = YellowFx.ghostDespawnMulti;
    }
    
    public void init(final Bullet b) {
        super.init(b);
        b.fdata = this.throwDelay;
    }
    
    public void update(final Bullet b) {
        super.update(b);
        if ((b.vel().len() <= this.peakMinSpeed || this.speed == this.peakMinSpeed) && b.fdata > 0.0f) {
            --b.fdata;
        }
        if (b.fdata <= 0.0f && b.drag != 0.0f) {
            if (this.throwEffect != null) {
                this.throwEffect.at(b.x, b.y);
            }
            b.vel().trns(Angles.angle(b.x, b.y, b.aimX, b.aimY), this.throwForce);
            b.drag = 0.0f;
        }
    }
}
