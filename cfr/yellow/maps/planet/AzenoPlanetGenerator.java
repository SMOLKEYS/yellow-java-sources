/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  arc.math.Mathf
 *  arc.math.geom.Vec3
 *  arc.util.Tmp
 *  arc.util.noise.Simplex
 *  mindustry.content.Blocks
 *  mindustry.maps.generators.PlanetGenerator
 *  mindustry.world.Block
 */
package yellow.maps.planet;

import arc.graphics.Color;
import arc.math.Mathf;
import arc.math.geom.Vec3;
import arc.util.Tmp;
import arc.util.noise.Simplex;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.content.Blocks;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.world.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0015J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0015R0\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013\u00a8\u0006\""}, d2={"Lyellow/maps/planet/AzenoPlanetGenerator;", "Lmindustry/maps/generators/PlanetGenerator;", "()V", "arr", "", "Lmindustry/world/Block;", "kotlin.jvm.PlatformType", "getArr", "()[[Lmindustry/world/Block;", "setArr", "([[Lmindustry/world/Block;)V", "[[Lmindustry/world/Block;", "csus", "Larc/graphics/Color;", "scl", "", "getScl", "()F", "setScl", "(F)V", "v34", "Larc/math/geom/Vec3;", "v35", "waterOffset", "getWaterOffset", "setWaterOffset", "watera", "getWatera", "setWatera", "getBlock", "position", "getColor", "getHeight", "rawHeight", "yellow-java"})
public class AzenoPlanetGenerator
extends PlanetGenerator {
    private float scl = 4.2f;
    private float waterOffset = 0.13f;
    @NotNull
    private Vec3 v34 = new Vec3();
    @NotNull
    private Vec3 v35 = new Vec3();
    @NotNull
    private Color csus = new Color();
    @NotNull
    private Block[][] arr;
    private float watera;

    public AzenoPlanetGenerator() {
        Block[][] blockArrayArray = new Block[1][];
        Block[] blockArray = new Block[]{Blocks.stone, Blocks.dirt, Blocks.sand, Blocks.water, Blocks.sand, Blocks.dirt, Blocks.stone};
        blockArrayArray[0] = blockArray;
        this.arr = blockArrayArray;
        this.watera = 2.0f / (float)this.arr[0].length;
    }

    public final float getScl() {
        return this.scl;
    }

    public final void setScl(float f) {
        this.scl = f;
    }

    public final float getWaterOffset() {
        return this.waterOffset;
    }

    public final void setWaterOffset(float f) {
        this.waterOffset = f;
    }

    @NotNull
    public final Block[][] getArr() {
        return this.arr;
    }

    public final void setArr(@NotNull Block[][] blockArray) {
        Intrinsics.checkNotNullParameter(blockArray, "<set-?>");
        this.arr = blockArray;
    }

    public final float getWatera() {
        return this.watera;
    }

    public final void setWatera(float f) {
        this.watera = f;
    }

    public float getHeight(@NotNull Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return Math.max(this.rawHeight(position), this.watera);
    }

    @NotNull
    public Color getColor(@NotNull Vec3 position) {
        Color color;
        Intrinsics.checkNotNullParameter(position, "position");
        Block block = this.getBlock(position);
        if (block == Blocks.salt) {
            Color color2 = Blocks.sand.mapColor;
            color = color2;
            Intrinsics.checkNotNullExpressionValue(color2, "sand.mapColor");
        } else {
            Block block2 = block;
            Intrinsics.checkNotNull(block2);
            Color color3 = this.csus.set(block2.mapColor).a(1.0f - block.albedo);
            color = color3;
            Intrinsics.checkNotNullExpressionValue(color3, "csus.set(block!!.mapColor).a(1f - block!!.albedo)");
        }
        return color;
    }

    @Nullable
    public final Block getBlock(@NotNull Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        Vec3 tposition = position;
        float height = this.rawHeight(tposition);
        Tmp.v31.set(tposition);
        Vec3 vec3 = this.v35.set(position).scl(this.scl);
        Intrinsics.checkNotNullExpressionValue(vec3, "v35.set(position).scl(scl)");
        tposition = vec3;
        float rad = this.scl;
        float temp = Mathf.clamp((float)(Math.abs(tposition.y * 2.0f) / rad));
        float tnoise = Simplex.noise3d((int)this.seed, (double)6.65, (double)0.58, (double)0.3333333432674408, (double)tposition.x, (double)(tposition.y + 999.0f), (double)tposition.z);
        temp = Mathf.lerp((float)temp, (float)tnoise, (float)0.5f);
        height *= 1.3f;
        height = Mathf.clamp((float)height);
        return this.arr[Mathf.clamp((int)((int)(temp * (float)((Object[])this.arr).length)), (int)0, (int)(this.arr[0].length - 1))][Mathf.clamp((int)((int)(height * (float)this.arr[0].length)), (int)0, (int)(this.arr[0].length - 1))];
    }

    public final float rawHeight(@NotNull Vec3 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        Vec3 tposition = this.v34.set(position).scl(this.scl);
        return (Mathf.pow((float)Simplex.noise3d((int)this.seed, (double)6.65, (double)0.5, (double)0.3333333432674408, (double)tposition.x, (double)tposition.y, (double)tposition.z), (float)2.3f) + this.waterOffset) / (1.0f + this.waterOffset);
    }
}

