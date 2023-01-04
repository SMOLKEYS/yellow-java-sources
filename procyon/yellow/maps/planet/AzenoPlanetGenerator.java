// 
// Decompiled by Procyon v0.6.0
// 

package yellow.maps.planet;

import org.jetbrains.annotations.Nullable;
import arc.util.noise.Simplex;
import arc.math.Mathf;
import arc.util.Tmp;
import kotlin.jvm.internal.Intrinsics;
import mindustry.content.Blocks;
import mindustry.world.Block;
import arc.graphics.Color;
import org.jetbrains.annotations.NotNull;
import arc.math.geom.Vec3;
import kotlin.Metadata;
import mindustry.maps.generators.PlanetGenerator;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0015J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0015R0\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013¨\u0006\"" }, d2 = { "Lyellow/maps/planet/AzenoPlanetGenerator;", "Lmindustry/maps/generators/PlanetGenerator;", "()V", "arr", "", "Lmindustry/world/Block;", "kotlin.jvm.PlatformType", "getArr", "()[[Lmindustry/world/Block;", "setArr", "([[Lmindustry/world/Block;)V", "[[Lmindustry/world/Block;", "csus", "Larc/graphics/Color;", "scl", "", "getScl", "()F", "setScl", "(F)V", "v34", "Larc/math/geom/Vec3;", "v35", "waterOffset", "getWaterOffset", "setWaterOffset", "watera", "getWatera", "setWatera", "getBlock", "position", "getColor", "getHeight", "rawHeight", "yellow-java" })
public class AzenoPlanetGenerator extends PlanetGenerator
{
    private float scl;
    private float waterOffset;
    @NotNull
    private Vec3 v34;
    @NotNull
    private Vec3 v35;
    @NotNull
    private Color csus;
    @NotNull
    private Block[][] arr;
    private float watera;
    
    public AzenoPlanetGenerator() {
        this.scl = 4.2f;
        this.waterOffset = 0.13f;
        this.v34 = new Vec3();
        this.v35 = new Vec3();
        this.csus = new Color();
        this.arr = new Block[][] { { Blocks.stone, Blocks.dirt, Blocks.sand, Blocks.water, Blocks.sand, Blocks.dirt, Blocks.stone } };
        this.watera = 2.0f / this.arr[0].length;
    }
    
    public final float getScl() {
        return this.scl;
    }
    
    public final void setScl(final float <set-?>) {
        this.scl = <set-?>;
    }
    
    public final float getWaterOffset() {
        return this.waterOffset;
    }
    
    public final void setWaterOffset(final float <set-?>) {
        this.waterOffset = <set-?>;
    }
    
    @NotNull
    public final Block[][] getArr() {
        return this.arr;
    }
    
    public final void setArr(@NotNull final Block[][] <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.arr = <set-?>;
    }
    
    public final float getWatera() {
        return this.watera;
    }
    
    public final void setWatera(final float <set-?>) {
        this.watera = <set-?>;
    }
    
    public float getHeight(@NotNull final Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return RangesKt___RangesKt.coerceAtLeast(this.rawHeight(position), this.watera);
    }
    
    @NotNull
    public Color getColor(@NotNull final Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        final Block block = this.getBlock(position);
        Color color;
        if (block == Blocks.salt) {
            Intrinsics.checkNotNullExpressionValue(color = Blocks.sand.mapColor, "sand.mapColor");
        }
        else {
            final Color csus = this.csus;
            final Block object = block;
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullExpressionValue(color = csus.set(object.mapColor).a(1.0f - block.albedo), "csus.set(block!!.mapColor).a(1f - block!!.albedo)");
        }
        return color;
    }
    
    @Nullable
    public final Block getBlock(@NotNull final Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        Vec3 tposition = position;
        float height = this.rawHeight(tposition);
        Tmp.v31.set(tposition);
        final Vec3 scl = this.v35.set(position).scl(this.scl);
        Intrinsics.checkNotNullExpressionValue(scl, "v35.set(position).scl(scl)");
        tposition = scl;
        final float rad = this.scl;
        float temp = Mathf.clamp(Math.abs(tposition.y * 2.0f) / rad);
        final float tnoise = Simplex.noise3d(this.seed, 6.65, 0.58, 0.3333333432674408, (double)tposition.x, (double)(tposition.y + 999.0f), (double)tposition.z);
        temp = Mathf.lerp(temp, tnoise, 0.5f);
        height *= 1.3f;
        height = Mathf.clamp(height);
        return this.arr[Mathf.clamp((int)(temp * ((Object[])this.arr).length), 0, this.arr[0].length - 1)][Mathf.clamp((int)(height * this.arr[0].length), 0, this.arr[0].length - 1)];
    }
    
    public final float rawHeight(@NotNull final Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        final Vec3 tposition = this.v34.set(position).scl(this.scl);
        return (Mathf.pow(Simplex.noise3d(this.seed, 6.65, 0.5, 0.3333333432674408, (double)tposition.x, (double)tposition.y, (double)tposition.z), 2.3f) + this.waterOffset) / (1.0f + this.waterOffset);
    }
}
