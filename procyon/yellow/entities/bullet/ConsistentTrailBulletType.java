// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.bullet;

import org.jetbrains.annotations.NotNull;
import arc.math.geom.Position;
import yellow.internal.util.YellowUtilsKtKt;
import arc.util.Time;
import org.jetbrains.annotations.Nullable;
import mindustry.gen.Bullet;
import kotlin.Metadata;
import mindustry.entities.bullet.BulletType;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f" }, d2 = { "Lyellow/entities/bullet/ConsistentTrailBulletType;", "Lmindustry/entities/bullet/BulletType;", "speed", "", "damage", "(FF)V", "effectSpacing", "getEffectSpacing", "()F", "setEffectSpacing", "(F)V", "update", "", "b", "Lmindustry/gen/Bullet;", "yellow-java" })
public class ConsistentTrailBulletType extends BulletType
{
    private float effectSpacing;
    
    public ConsistentTrailBulletType(final float speed, final float damage) {
        super(speed, damage);
        this.effectSpacing = 15.0f;
        this.trailChance = 0.0f;
    }
    
    public final float getEffectSpacing() {
        return this.effectSpacing;
    }
    
    public final void setEffectSpacing(final float <set-?>) {
        this.effectSpacing = <set-?>;
    }
    
    public void update(@Nullable final Bullet b) {
        super.update(b);
        if (b != null && YellowUtilsKtKt.ins(Time.time, this.effectSpacing)) {
            super.trailEffect.at((Position)b, b.rotation());
        }
    }
    
    @NotNull
    public Object clone() {
        return super.clone();
    }
}
