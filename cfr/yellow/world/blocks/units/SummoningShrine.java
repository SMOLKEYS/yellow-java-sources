/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  arc.graphics.g2d.Draw
 *  arc.graphics.g2d.Fill
 *  arc.graphics.g2d.Lines
 *  arc.graphics.g2d.TextureRegion
 *  arc.math.Mathf
 *  arc.math.geom.Position
 *  arc.scene.event.Touchable
 *  arc.scene.ui.TextButton
 *  arc.scene.ui.layout.Table
 *  arc.util.Time
 *  arc.util.Tmp
 *  arc.util.io.Reads
 *  arc.util.io.Writes
 *  mindustry.content.Fx
 *  mindustry.entities.Effect
 *  mindustry.gen.Building
 *  mindustry.graphics.Drawf
 *  mindustry.type.UnitType
 *  mindustry.world.Block
 *  mindustry.world.meta.BuildVisibility
 *  mindustry.world.meta.Stat
 */
package yellow.world.blocks.units;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.graphics.g2d.TextureRegion;
import arc.math.Mathf;
import arc.math.geom.Position;
import arc.scene.event.Touchable;
import arc.scene.ui.TextButton;
import arc.scene.ui.layout.Table;
import arc.util.Time;
import arc.util.Tmp;
import arc.util.io.Reads;
import arc.util.io.Writes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.content.Fx;
import mindustry.entities.Effect;
import mindustry.gen.Building;
import mindustry.graphics.Drawf;
import mindustry.type.UnitType;
import mindustry.world.Block;
import mindustry.world.meta.BuildVisibility;
import mindustry.world.meta.Stat;
import org.jetbrains.annotations.NotNull;
import yellow.internal.util.YellowUtils;
import yellow.internal.util.YellowUtilsKtKt;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004\u00a8\u0006 "}, d2={"Lyellow/world/blocks/units/SummoningShrine;", "Lmindustry/world/Block;", "unit", "Lmindustry/type/UnitType;", "(Lmindustry/type/UnitType;)V", "drawBlock", "", "getDrawBlock", "()Z", "setDrawBlock", "(Z)V", "requestEffect", "Lmindustry/entities/Effect;", "getRequestEffect", "()Lmindustry/entities/Effect;", "setRequestEffect", "(Lmindustry/entities/Effect;)V", "summonEffect", "getSummonEffect", "setSummonEffect", "summonTime", "", "getSummonTime", "()F", "setSummonTime", "(F)V", "getUnit", "()Lmindustry/type/UnitType;", "setUnit", "setStats", "", "SummoningShrineBuild", "yellow-java"})
public class SummoningShrine
extends Block {
    @NotNull
    private UnitType unit;
    private float summonTime;
    private boolean drawBlock;
    @NotNull
    private Effect requestEffect;
    @NotNull
    private Effect summonEffect;

    public SummoningShrine(@NotNull UnitType unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        super(unit.name + "-shrine");
        this.unit = unit;
        this.summonTime = 60.0f;
        Effect effect = Fx.none;
        Intrinsics.checkNotNullExpressionValue(effect, "none");
        this.requestEffect = effect;
        Effect effect2 = Fx.none;
        Intrinsics.checkNotNullExpressionValue(effect2, "none");
        this.summonEffect = effect2;
        this.configurable = true;
        this.solid = true;
        this.update = true;
        this.rotate = false;
        this.buildVisibility = BuildVisibility.sandboxOnly;
    }

    @NotNull
    public final UnitType getUnit() {
        return this.unit;
    }

    public final void setUnit(@NotNull UnitType unitType) {
        Intrinsics.checkNotNullParameter(unitType, "<set-?>");
        this.unit = unitType;
    }

    public final float getSummonTime() {
        return this.summonTime;
    }

    public final void setSummonTime(float f) {
        this.summonTime = f;
    }

    public final boolean getDrawBlock() {
        return this.drawBlock;
    }

    public final void setDrawBlock(boolean bl) {
        this.drawBlock = bl;
    }

    @NotNull
    public final Effect getRequestEffect() {
        return this.requestEffect;
    }

    public final void setRequestEffect(@NotNull Effect effect) {
        Intrinsics.checkNotNullParameter(effect, "<set-?>");
        this.requestEffect = effect;
    }

    @NotNull
    public final Effect getSummonEffect() {
        return this.summonEffect;
    }

    public final void setSummonEffect(@NotNull Effect effect) {
        Intrinsics.checkNotNullParameter(effect, "<set-?>");
        this.summonEffect = effect;
    }

    public void setStats() {
        super.setStats();
        this.stats.add(Stat.output, arg_0 -> SummoningShrine.setStats$lambda$0(this, arg_0));
    }

    private static final void setStats$lambda$0(SummoningShrine this$0, Table it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        it.row();
        YellowUtils.unitBar(it, this$0.unit, "Summon Time: [accent]" + Mathf.round((float)(this$0.summonTime / 60.0f)) + " Seconds[]");
    }

    @Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0007\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lyellow/world/blocks/units/SummoningShrine$SummoningShrineBuild;", "Lmindustry/gen/Building;", "(Lyellow/world/blocks/units/SummoningShrine;)V", "a", "", "currentlySummoning", "", "placed", "size", "buildConfiguration", "", "table", "Larc/scene/ui/layout/Table;", "draw", "read", "Larc/util/io/Reads;", "revision", "", "write", "Larc/util/io/Writes;", "yellow-java"})
    public final class SummoningShrineBuild
    extends Building {
        private boolean currentlySummoning;
        private boolean placed;
        private float a;
        private float size;

        public void buildConfiguration(@NotNull Table table) {
            Intrinsics.checkNotNullParameter(table, "table");
            table.table(arg_0 -> SummoningShrineBuild.buildConfiguration$lambda$2(SummoningShrine.this, this, arg_0));
        }

        public void placed() {
            super.placed();
            this.placed = true;
        }

        public void draw() {
            if (SummoningShrine.this.getDrawBlock()) {
                Drawf.shadow((TextureRegion)SummoningShrine.this.region, (float)this.x, (float)this.y, (float)0.0f);
                Draw.rect((TextureRegion)SummoningShrine.this.region, (float)this.x, (float)this.y, (float)0.0f);
            }
            float lerpA = this.currentlySummoning ? 1.0f : 0.0f;
            float sus = Mathf.absin((float)10.0f, (float)10.0f);
            this.a = Mathf.lerp((float)this.a, (float)lerpA, (float)0.04f);
            float lerpSize = this.placed ? 20.0f : 0.0f;
            this.size = Mathf.lerp((float)this.size, (float)lerpSize, (float)0.043f);
            Draw.z((float)110.0f);
            Draw.color((Color)Tmp.c1.set(Color.yellow).lerp(Color.cyan, Mathf.absin((float)10.0f, (float)1.0f)));
            Fill.circle((float)this.x, (float)this.y, (float)(this.size - 15.0f + Mathf.absin((float)10.0f, (float)2.0f)));
            Lines.circle((float)this.x, (float)this.y, (float)this.size);
            Lines.square((float)this.x, (float)this.y, (float)(this.size - 1.0f), (float)Time.time);
            Lines.square((float)this.x, (float)this.y, (float)(this.size - 1.0f), (float)(-Time.time));
            Draw.alpha((float)this.a);
            Lines.circle((float)this.x, (float)this.y, (float)(25.0f + sus));
            Lines.square((float)this.x, (float)this.y, (float)(25.0f + sus), (float)Time.time);
            Lines.square((float)this.x, (float)this.y, (float)(25.0f + sus), (float)(-Time.time));
        }

        public void write(@NotNull Writes write) {
            Intrinsics.checkNotNullParameter(write, "write");
            super.write(write);
            write.bool(this.placed);
        }

        public void read(@NotNull Reads read, byte revision) {
            Intrinsics.checkNotNullParameter(read, "read");
            super.read(read, revision);
            this.placed = read.bool();
        }

        private static final void buildConfiguration$lambda$2$lambda$1$lambda$0(SummoningShrine this$0, SummoningShrineBuild this$1, Table $t) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)this$1, "this$1");
            Intrinsics.checkNotNullParameter($t, "$t");
            if (!this$0.getUnit().flying && !this$0.getUnit().canBoost) {
                this$0.getUnit().spawn(this$1.team, this$1.x + 40.0f, this$1.y);
                this$0.getSummonEffect().at(this$1.x + 40.0f, this$1.y);
            } else {
                this$0.getUnit().spawn(this$1.team, (Position)this$1);
                this$0.getSummonEffect().at((Position)this$1);
            }
            this$1.currentlySummoning = false;
            YellowUtilsKtKt.touchableOf($t, 1, Touchable.enabled);
        }

        private static final void buildConfiguration$lambda$2$lambda$1(Table $t, SummoningShrine this$0, SummoningShrineBuild this$1) {
            Intrinsics.checkNotNullParameter($t, "$t");
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)this$1, "this$1");
            YellowUtilsKtKt.touchableOf($t, 1, Touchable.disabled);
            this$0.getRequestEffect().at((Position)this$1);
            this$1.currentlySummoning = true;
            Time.run((float)this$0.getSummonTime(), () -> SummoningShrineBuild.buildConfiguration$lambda$2$lambda$1$lambda$0(this$0, this$1, $t));
        }

        private static final void buildConfiguration$lambda$2(SummoningShrine this$0, SummoningShrineBuild this$1, Table t) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)this$1, "this$1");
            Intrinsics.checkNotNullParameter(t, "t");
            t.add((CharSequence)("Summoning Shrine (" + this$0.getUnit().localizedName + ')')).row();
            ((TextButton)t.button("Summon Unit", () -> SummoningShrineBuild.buildConfiguration$lambda$2$lambda$1(t, this$0, this$1)).get()).getLabel().setWrap(false);
            if (this$1.currentlySummoning) {
                YellowUtilsKtKt.touchableOf(t, 1, Touchable.enabled);
            }
        }
    }
}

