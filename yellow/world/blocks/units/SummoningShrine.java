// 
// Decompiled by Procyon v0.6.0
// 

package yellow.world.blocks.units;

import arc.scene.ui.TextButton;
import yellow.internal.util.YellowUtilsKtKt;
import arc.scene.event.Touchable;
import arc.math.geom.Position;
import arc.util.io.Reads;
import arc.util.io.Writes;
import arc.util.Time;
import arc.graphics.g2d.Lines;
import arc.graphics.g2d.Fill;
import arc.graphics.Color;
import arc.util.Tmp;
import arc.graphics.g2d.Draw;
import mindustry.graphics.Drawf;
import mindustry.gen.Building;
import yellow.internal.util.YellowUtils;
import arc.math.Mathf;
import arc.scene.ui.layout.Table;
import mindustry.world.meta.Stat;
import mindustry.world.meta.BuildVisibility;
import mindustry.content.Fx;
import kotlin.jvm.internal.Intrinsics;
import mindustry.entities.Effect;
import org.jetbrains.annotations.NotNull;
import mindustry.type.UnitType;
import kotlin.Metadata;
import mindustry.world.Block;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004¨\u0006 " }, d2 = { "Lyellow/world/blocks/units/SummoningShrine;", "Lmindustry/world/Block;", "unit", "Lmindustry/type/UnitType;", "(Lmindustry/type/UnitType;)V", "drawBlock", "", "getDrawBlock", "()Z", "setDrawBlock", "(Z)V", "requestEffect", "Lmindustry/entities/Effect;", "getRequestEffect", "()Lmindustry/entities/Effect;", "setRequestEffect", "(Lmindustry/entities/Effect;)V", "summonEffect", "getSummonEffect", "setSummonEffect", "summonTime", "", "getSummonTime", "()F", "setSummonTime", "(F)V", "getUnit", "()Lmindustry/type/UnitType;", "setUnit", "setStats", "", "SummoningShrineBuild", "yellow-java" })
public class SummoningShrine extends Block
{
    @NotNull
    private UnitType unit;
    private float summonTime;
    private boolean drawBlock;
    @NotNull
    private Effect requestEffect;
    @NotNull
    private Effect summonEffect;
    
    public SummoningShrine(@NotNull final UnitType unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        super(unit.name + "-shrine");
        this.unit = unit;
        this.summonTime = 60.0f;
        final Effect none = Fx.none;
        Intrinsics.checkNotNullExpressionValue(none, "none");
        this.requestEffect = none;
        final Effect none2 = Fx.none;
        Intrinsics.checkNotNullExpressionValue(none2, "none");
        this.summonEffect = none2;
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
    
    public final void setUnit(@NotNull final UnitType <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.unit = <set-?>;
    }
    
    public final float getSummonTime() {
        return this.summonTime;
    }
    
    public final void setSummonTime(final float <set-?>) {
        this.summonTime = <set-?>;
    }
    
    public final boolean getDrawBlock() {
        return this.drawBlock;
    }
    
    public final void setDrawBlock(final boolean <set-?>) {
        this.drawBlock = <set-?>;
    }
    
    @NotNull
    public final Effect getRequestEffect() {
        return this.requestEffect;
    }
    
    public final void setRequestEffect(@NotNull final Effect <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.requestEffect = <set-?>;
    }
    
    @NotNull
    public final Effect getSummonEffect() {
        return this.summonEffect;
    }
    
    public final void setSummonEffect(@NotNull final Effect <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.summonEffect = <set-?>;
    }
    
    public void setStats() {
        super.setStats();
        super.stats.add(Stat.output, SummoningShrine::setStats$lambda$0);
    }
    
    private static final void setStats$lambda$0(final SummoningShrine this$0, final Table it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        it.row();
        YellowUtils.unitBar(it, this$0.unit, "Summon Time: [accent]" + Mathf.round(this$0.summonTime / 60.0f) + " Seconds[]");
    }
    
    @Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0007\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lyellow/world/blocks/units/SummoningShrine$SummoningShrineBuild;", "Lmindustry/gen/Building;", "(Lyellow/world/blocks/units/SummoningShrine;)V", "a", "", "currentlySummoning", "", "placed", "size", "buildConfiguration", "", "table", "Larc/scene/ui/layout/Table;", "draw", "read", "Larc/util/io/Reads;", "revision", "", "write", "Larc/util/io/Writes;", "yellow-java" })
    public final class SummoningShrineBuild extends Building
    {
        private boolean currentlySummoning;
        private boolean placed;
        private float a;
        private float size;
        
        public void buildConfiguration(@NotNull final Table table) {
            Intrinsics.checkNotNullParameter(table, "table");
            table.table(SummoningShrineBuild::buildConfiguration$lambda$2);
        }
        
        public void placed() {
            super.placed();
            this.placed = true;
        }
        
        public void draw() {
            if (SummoningShrine.this.getDrawBlock()) {
                Drawf.shadow(SummoningShrine.this.region, super.x, super.y, 0.0f);
                Draw.rect(SummoningShrine.this.region, super.x, super.y, 0.0f);
            }
            final float lerpA = this.currentlySummoning ? 1.0f : 0.0f;
            final float sus = Mathf.absin(10.0f, 10.0f);
            this.a = Mathf.lerp(this.a, lerpA, 0.04f);
            final float lerpSize = this.placed ? 20.0f : 0.0f;
            this.size = Mathf.lerp(this.size, lerpSize, 0.043f);
            Draw.z(110.0f);
            Draw.color(Tmp.c1.set(Color.yellow).lerp(Color.cyan, Mathf.absin(10.0f, 1.0f)));
            Fill.circle(super.x, super.y, this.size - 15.0f + Mathf.absin(10.0f, 2.0f));
            Lines.circle(super.x, super.y, this.size);
            Lines.square(super.x, super.y, this.size - 1.0f, Time.time);
            Lines.square(super.x, super.y, this.size - 1.0f, -Time.time);
            Draw.alpha(this.a);
            Lines.circle(super.x, super.y, 25.0f + sus);
            Lines.square(super.x, super.y, 25.0f + sus, Time.time);
            Lines.square(super.x, super.y, 25.0f + sus, -Time.time);
        }
        
        public void write(@NotNull final Writes write) {
            Intrinsics.checkNotNullParameter(write, "write");
            super.write(write);
            write.bool(this.placed);
        }
        
        public void read(@NotNull final Reads read, final byte revision) {
            Intrinsics.checkNotNullParameter(read, "read");
            super.read(read, revision);
            this.placed = read.bool();
        }
        
        private static final void buildConfiguration$lambda$2$lambda$1$lambda$0(final SummoningShrine this$0, final SummoningShrineBuild this$1, final Table $t) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter($t, "$t");
            if (!this$0.getUnit().flying && !this$0.getUnit().canBoost) {
                this$0.getUnit().spawn(this$1.team, this$1.x + 40.0f, this$1.y);
                this$0.getSummonEffect().at(this$1.x + 40.0f, this$1.y);
            }
            else {
                this$0.getUnit().spawn(this$1.team, (Position)this$1);
                this$0.getSummonEffect().at((Position)this$1);
            }
            this$1.currentlySummoning = false;
            YellowUtilsKtKt.touchableOf($t, 1, Touchable.enabled);
        }
        
        private static final void buildConfiguration$lambda$2$lambda$1(final Table $t, final SummoningShrine this$0, final SummoningShrineBuild this$1) {
            Intrinsics.checkNotNullParameter($t, "$t");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            YellowUtilsKtKt.touchableOf($t, 1, Touchable.disabled);
            this$0.getRequestEffect().at((Position)this$1);
            this$1.currentlySummoning = true;
            Time.run(this$0.getSummonTime(), SummoningShrineBuild::buildConfiguration$lambda$2$lambda$1$lambda$0);
        }
        
        private static final void buildConfiguration$lambda$2(final SummoningShrine this$0, final SummoningShrineBuild this$1, final Table t) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(t, "t");
            t.add((CharSequence)("Summoning Shrine (" + this$0.getUnit().localizedName + ')')).row();
            ((TextButton)t.button("Summon Unit", SummoningShrineBuild::buildConfiguration$lambda$2$lambda$1).get()).getLabel().setWrap(false);
            if (this$1.currentlySummoning) {
                YellowUtilsKtKt.touchableOf(t, 1, Touchable.enabled);
            }
        }
    }
}
