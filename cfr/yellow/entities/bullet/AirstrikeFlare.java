/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Mathf
 *  arc.util.Time
 *  mindustry.entities.bullet.ArtilleryBulletType
 *  mindustry.entities.bullet.BulletType
 *  mindustry.game.Team
 *  mindustry.gen.Bullet
 */
package yellow.entities.bullet;

import arc.math.Mathf;
import arc.util.Time;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.game.Team;
import mindustry.gen.Bullet;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0006\u0010-\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%\u00a8\u0006."}, d2={"Lyellow/entities/bullet/AirstrikeFlare;", "Lmindustry/entities/bullet/ArtilleryBulletType;", "missileBullet", "Lmindustry/entities/bullet/BulletType;", "(Lmindustry/entities/bullet/BulletType;)V", "arrivalDelay", "", "getArrivalDelay", "()F", "setArrivalDelay", "(F)V", "minArrivalDelay", "getMinArrivalDelay", "setMinArrivalDelay", "minMissileCount", "", "getMinMissileCount", "()I", "setMinMissileCount", "(I)V", "getMissileBullet", "()Lmindustry/entities/bullet/BulletType;", "setMissileBullet", "missileCount", "getMissileCount", "setMissileCount", "missileLifetimeRandomization", "getMissileLifetimeRandomization", "setMissileLifetimeRandomization", "posRandomization", "getPosRandomization", "setPosRandomization", "randomizeArrivalDelays", "", "getRandomizeArrivalDelays", "()Z", "setRandomizeArrivalDelays", "(Z)V", "randomizeMissileCount", "getRandomizeMissileCount", "setRandomizeMissileCount", "despawned", "", "b", "Lmindustry/gen/Bullet;", "misRng", "yellow-java"})
public class AirstrikeFlare
extends ArtilleryBulletType {
    @NotNull
    private BulletType missileBullet;
    private int missileCount;
    private int minMissileCount;
    private float arrivalDelay;
    private float minArrivalDelay;
    private float missileLifetimeRandomization;
    private float posRandomization;
    private boolean randomizeMissileCount;
    private boolean randomizeArrivalDelays;

    public AirstrikeFlare(@NotNull BulletType missileBullet) {
        Intrinsics.checkNotNullParameter(missileBullet, "missileBullet");
        this.missileBullet = missileBullet;
        this.shrinkX = 0.0f;
        this.shrinkY = 0.0f;
        this.lifetime = 20.0f;
        this.speed = 15.0f;
        this.collides = true;
        this.collidesAir = true;
        this.collidesGround = true;
        this.missileCount = 8;
        this.minMissileCount = 4;
        this.arrivalDelay = 240.0f;
        this.minArrivalDelay = 60.0f;
        this.missileLifetimeRandomization = 3.0f;
        this.posRandomization = 120.0f;
        this.randomizeMissileCount = true;
        this.randomizeArrivalDelays = true;
    }

    @NotNull
    public final BulletType getMissileBullet() {
        return this.missileBullet;
    }

    public final void setMissileBullet(@NotNull BulletType bulletType) {
        Intrinsics.checkNotNullParameter(bulletType, "<set-?>");
        this.missileBullet = bulletType;
    }

    public final int getMissileCount() {
        return this.missileCount;
    }

    public final void setMissileCount(int n) {
        this.missileCount = n;
    }

    public final int getMinMissileCount() {
        return this.minMissileCount;
    }

    public final void setMinMissileCount(int n) {
        this.minMissileCount = n;
    }

    public final float getArrivalDelay() {
        return this.arrivalDelay;
    }

    public final void setArrivalDelay(float f) {
        this.arrivalDelay = f;
    }

    public final float getMinArrivalDelay() {
        return this.minArrivalDelay;
    }

    public final void setMinArrivalDelay(float f) {
        this.minArrivalDelay = f;
    }

    public final float getMissileLifetimeRandomization() {
        return this.missileLifetimeRandomization;
    }

    public final void setMissileLifetimeRandomization(float f) {
        this.missileLifetimeRandomization = f;
    }

    public final float getPosRandomization() {
        return this.posRandomization;
    }

    public final void setPosRandomization(float f) {
        this.posRandomization = f;
    }

    public final boolean getRandomizeMissileCount() {
        return this.randomizeMissileCount;
    }

    public final void setRandomizeMissileCount(boolean bl) {
        this.randomizeMissileCount = bl;
    }

    public final boolean getRandomizeArrivalDelays() {
        return this.randomizeArrivalDelays;
    }

    public final void setRandomizeArrivalDelays(boolean bl) {
        this.randomizeArrivalDelays = bl;
    }

    public final int misRng() {
        int yes = 0;
        if (!this.randomizeMissileCount) {
            return this.missileCount;
        }
        yes = Mathf.random((int)this.minMissileCount, (int)this.missileCount);
        return yes;
    }

    public void despawned(@NotNull Bullet b) {
        Intrinsics.checkNotNullParameter(b, "b");
        super.despawned(b);
        Ref.FloatRef x = new Ref.FloatRef();
        x.element = b.x;
        Ref.FloatRef y = new Ref.FloatRef();
        y.element = b.y;
        int i2 = 0;
        int n = this.misRng();
        if (i2 <= n) {
            while (true) {
                Time.run((float)Mathf.random((float)this.minArrivalDelay, (float)this.arrivalDelay), () -> AirstrikeFlare.despawned$lambda$0(this, b, x, y));
                if (i2 == n) break;
                ++i2;
            }
        }
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    private static final void despawned$lambda$0(AirstrikeFlare this$0, Bullet $b, Ref.FloatRef $x, Ref.FloatRef $y) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter($b, "$b");
        Intrinsics.checkNotNullParameter($x, "$x");
        Intrinsics.checkNotNullParameter($y, "$y");
        BulletType.createBullet((BulletType)this$0.missileBullet, (Team)$b.team, (float)($x.element + Mathf.range((float)this$0.posRandomization)), (float)($y.element + Mathf.range((float)this$0.posRandomization)), (float)0.0f, (float)350.0f, (float)0.0f, (float)(1.0f + Mathf.random((float)this$0.missileLifetimeRandomization)));
    }
}

