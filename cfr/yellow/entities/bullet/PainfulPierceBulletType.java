/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.entities.bullet.BulletType
 *  mindustry.gen.Bullet
 *  mindustry.gen.Hitboxc
 */
package yellow.entities.bullet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Bullet;
import mindustry.gen.Hitboxc;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2={"Lyellow/entities/bullet/PainfulPierceBulletType;", "Lmindustry/entities/bullet/BulletType;", "speed", "", "damage", "damageBenefitPerPierce", "(FFF)V", "getDamageBenefitPerPierce", "()F", "setDamageBenefitPerPierce", "(F)V", "hit", "", "b", "Lmindustry/gen/Bullet;", "hitEntity", "entity", "Lmindustry/gen/Hitboxc;", "health", "yellow-java"})
public class PainfulPierceBulletType
extends BulletType {
    private float damageBenefitPerPierce;

    public PainfulPierceBulletType(float speed, float damage, float damageBenefitPerPierce) {
        super(speed, damage);
        this.damageBenefitPerPierce = damageBenefitPerPierce;
        this.pierce = true;
        this.pierceBuilding = true;
        this.pierceCap = -1;
    }

    public final float getDamageBenefitPerPierce() {
        return this.damageBenefitPerPierce;
    }

    public final void setDamageBenefitPerPierce(float f) {
        this.damageBenefitPerPierce = f;
    }

    public void hit(@NotNull Bullet b) {
        Intrinsics.checkNotNullParameter(b, "b");
        super.hit(b);
        b.damage += this.damageBenefitPerPierce;
    }

    public void hitEntity(@NotNull Bullet b, @NotNull Hitboxc entity, float health) {
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(entity, "entity");
        super.hitEntity(b, entity, health);
        b.damage += this.damageBenefitPerPierce;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }
}

