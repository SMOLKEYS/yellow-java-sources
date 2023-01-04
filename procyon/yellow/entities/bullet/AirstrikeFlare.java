// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.bullet;

import arc.util.Time;
import kotlin.jvm.internal.Ref;
import mindustry.gen.Bullet;
import arc.math.Mathf;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import mindustry.entities.bullet.BulletType;
import kotlin.Metadata;
import mindustry.entities.bullet.ArtilleryBulletType;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0006\u0010-\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u0006." }, d2 = { "Lyellow/entities/bullet/AirstrikeFlare;", "Lmindustry/entities/bullet/ArtilleryBulletType;", "missileBullet", "Lmindustry/entities/bullet/BulletType;", "(Lmindustry/entities/bullet/BulletType;)V", "arrivalDelay", "", "getArrivalDelay", "()F", "setArrivalDelay", "(F)V", "minArrivalDelay", "getMinArrivalDelay", "setMinArrivalDelay", "minMissileCount", "", "getMinMissileCount", "()I", "setMinMissileCount", "(I)V", "getMissileBullet", "()Lmindustry/entities/bullet/BulletType;", "setMissileBullet", "missileCount", "getMissileCount", "setMissileCount", "missileLifetimeRandomization", "getMissileLifetimeRandomization", "setMissileLifetimeRandomization", "posRandomization", "getPosRandomization", "setPosRandomization", "randomizeArrivalDelays", "", "getRandomizeArrivalDelays", "()Z", "setRandomizeArrivalDelays", "(Z)V", "randomizeMissileCount", "getRandomizeMissileCount", "setRandomizeMissileCount", "despawned", "", "b", "Lmindustry/gen/Bullet;", "misRng", "yellow-java" })
public class AirstrikeFlare extends ArtilleryBulletType
{
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
    
    public AirstrikeFlare(@NotNull final BulletType missileBullet) {
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
    
    public final void setMissileBullet(@NotNull final BulletType <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.missileBullet = <set-?>;
    }
    
    public final int getMissileCount() {
        return this.missileCount;
    }
    
    public final void setMissileCount(final int <set-?>) {
        this.missileCount = <set-?>;
    }
    
    public final int getMinMissileCount() {
        return this.minMissileCount;
    }
    
    public final void setMinMissileCount(final int <set-?>) {
        this.minMissileCount = <set-?>;
    }
    
    public final float getArrivalDelay() {
        return this.arrivalDelay;
    }
    
    public final void setArrivalDelay(final float <set-?>) {
        this.arrivalDelay = <set-?>;
    }
    
    public final float getMinArrivalDelay() {
        return this.minArrivalDelay;
    }
    
    public final void setMinArrivalDelay(final float <set-?>) {
        this.minArrivalDelay = <set-?>;
    }
    
    public final float getMissileLifetimeRandomization() {
        return this.missileLifetimeRandomization;
    }
    
    public final void setMissileLifetimeRandomization(final float <set-?>) {
        this.missileLifetimeRandomization = <set-?>;
    }
    
    public final float getPosRandomization() {
        return this.posRandomization;
    }
    
    public final void setPosRandomization(final float <set-?>) {
        this.posRandomization = <set-?>;
    }
    
    public final boolean getRandomizeMissileCount() {
        return this.randomizeMissileCount;
    }
    
    public final void setRandomizeMissileCount(final boolean <set-?>) {
        this.randomizeMissileCount = <set-?>;
    }
    
    public final boolean getRandomizeArrivalDelays() {
        return this.randomizeArrivalDelays;
    }
    
    public final void setRandomizeArrivalDelays(final boolean <set-?>) {
        this.randomizeArrivalDelays = <set-?>;
    }
    
    public final int misRng() {
        int yes = 0;
        if (this.randomizeMissileCount) {
            yes = Mathf.random(this.minMissileCount, this.missileCount);
            return yes;
        }
        return this.missileCount;
    }
    
    public void despawned(@NotNull final Bullet b) {
        Intrinsics.checkNotNullParameter(b, "b");
        super.despawned(b);
        final Ref.FloatRef x = new Ref.FloatRef();
        x.element = b.x;
        final Ref.FloatRef y = new Ref.FloatRef();
        y.element = b.y;
        int i = 0;
        final int misRng = this.misRng();
        if (i <= misRng) {
            while (true) {
                Time.run(Mathf.random(this.minArrivalDelay, this.arrivalDelay), AirstrikeFlare::despawned$lambda$0);
                if (i == misRng) {
                    break;
                }
                ++i;
            }
        }
    }
    
    @NotNull
    public Object clone() {
        return super.clone();
    }
    
    private static final void despawned$lambda$0(final AirstrikeFlare this$0, final Bullet $b, final Ref.FloatRef $x, final Ref.FloatRef $y) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($b, "$b");
        Intrinsics.checkNotNullParameter($x, "$x");
        Intrinsics.checkNotNullParameter($y, "$y");
        BulletType.createBullet(this$0.missileBullet, $b.team, $x.element + Mathf.range(this$0.posRandomization), $y.element + Mathf.range(this$0.posRandomization), 0.0f, 350.0f, 0.0f, 1.0f + Mathf.random(this$0.missileLifetimeRandomization));
    }
}
