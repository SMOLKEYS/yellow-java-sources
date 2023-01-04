/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.geom.Position
 *  arc.util.Time
 *  mindustry.entities.bullet.BulletType
 *  mindustry.gen.Bullet
 */
package yellow.entities.bullet;

import arc.math.geom.Position;
import arc.util.Time;
import kotlin.Metadata;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Bullet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yellow.internal.util.YellowUtilsKtKt;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2={"Lyellow/entities/bullet/ConsistentTrailBulletType;", "Lmindustry/entities/bullet/BulletType;", "speed", "", "damage", "(FF)V", "effectSpacing", "getEffectSpacing", "()F", "setEffectSpacing", "(F)V", "update", "", "b", "Lmindustry/gen/Bullet;", "yellow-java"})
public class ConsistentTrailBulletType
extends BulletType {
    private float effectSpacing = 15.0f;

    public ConsistentTrailBulletType(float speed, float damage) {
        super(speed, damage);
        this.trailChance = 0.0f;
    }

    public final float getEffectSpacing() {
        return this.effectSpacing;
    }

    public final void setEffectSpacing(float f) {
        this.effectSpacing = f;
    }

    public void update(@Nullable Bullet b) {
        super.update(b);
        if (b != null && YellowUtilsKtKt.ins(Time.time, this.effectSpacing)) {
            this.trailEffect.at((Position)b, b.rotation());
        }
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }
}

