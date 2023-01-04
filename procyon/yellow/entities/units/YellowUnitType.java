// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.units;

import yellow.internal.util.YellowUtilsKt;
import arc.scene.ui.layout.Table;
import kotlin.jvm.functions.Function1;
import yellow.entities.units.entity.YellowUnitEntity;
import mindustry.world.meta.StatUnit;
import yellow.world.meta.YellowStats;
import mindustry.world.meta.Stat;
import arc.graphics.g2d.Fill;
import arc.util.Tmp;
import arc.graphics.g2d.Lines;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.math.Mathf;
import arc.util.Time;
import mindustry.gen.Unit;
import mindustry.ai.UnitCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import mindustry.type.UnitType;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011" }, d2 = { "Lyellow/entities/units/YellowUnitType;", "Lmindustry/type/UnitType;", "name", "", "(Ljava/lang/String;)V", "maxLives", "", "getMaxLives", "()I", "setMaxLives", "(I)V", "draw", "", "unit", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "setStats", "yellow-java" })
public class YellowUnitType extends UnitType
{
    private int maxLives;
    
    public YellowUnitType(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super(name);
        this.maxLives = 5;
        this.constructor = YellowUnitType::_init_$lambda$0;
        this.defaultCommand = UnitCommand.assistCommand;
    }
    
    public final int getMaxLives() {
        return this.maxLives;
    }
    
    public final void setMaxLives(final int <set-?>) {
        this.maxLives = <set-?>;
    }
    
    public void draw(@NotNull final Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        super.draw(unit);
        final float s = Mathf.absin(Time.time, 16.0f, 1.0f);
        final float r1 = s * 25.0f;
        final float r2 = s * 20.0f;
        Draw.z(110.0f);
        Draw.color(Color.yellow);
        Lines.circle(unit.x, unit.y, 20.0f + r1);
        Lines.square(unit.x, unit.y, 20.0f + r1, Time.time);
        Lines.square(unit.x, unit.y, 20.0f + r1, -Time.time);
        Tmp.v1.trns(Time.time, r2, r2);
        Fill.circle(unit.x + Tmp.v1.x, unit.y + Tmp.v1.y, 2.0f + s * 8.0f);
        Tmp.v1.trns(Time.time, -r2, -r2);
        Fill.circle(unit.x + Tmp.v1.x, unit.y + Tmp.v1.y, 2.0f + s * 8.0f);
        Tmp.c1.set(Color.white);
        Tmp.c1.a = 0.0f;
        Fill.light(unit.x, unit.y, 5, 50.0f - r1, Color.yellow, Tmp.c1);
    }
    
    public void setStats() {
        super.setStats();
        this.stats.useCategories = true;
        this.stats.remove(Stat.health);
        this.stats.add(Stat.health, Mathf.round(this.health * (float)this.maxLives) + " (" + (int)this.health + " x " + this.maxLives + ')', new Object[0]);
        this.stats.remove(Stat.itemCapacity);
        this.stats.add(YellowStats.itemCapacityAlt, String.valueOf(this.itemCapacity), new Object[0]);
        this.stats.remove(Stat.weapons);
        this.stats.add(YellowStats.weaponsAlt, YellowUnitType::setStats$lambda$2);
        this.stats.remove(Stat.range);
        this.stats.add(YellowStats.rangeAlt, String.valueOf((int)(this.maxRange / 8)), new Object[] { StatUnit.blocks });
        this.stats.add(YellowStats.maxLives, String.valueOf(this.maxLives), new Object[0]);
        this.stats.add(YellowStats.extras, "1000-8000 [cyan]shield health[] on first death\nRandom chance of teleporting frantically on last life\nRandom chance of teleporting frantically AND dropping plasma bombs on last life\nFourth-wall breaker (Pilot/Human Form)", new Object[0]);
        this.stats.add(YellowStats.name, "Nihara", new Object[0]);
        this.stats.add(YellowStats.gender, "Female", new Object[0]);
        this.stats.add(YellowStats.age, "23", new Object[] { YellowStats.yearsOld });
        this.stats.add(YellowStats.personality, "Kind/Friendly", new Object[0]);
        this.stats.add(YellowStats.headpatRating, "High", new Object[0]);
        this.stats.add(YellowStats.generalAura, "Menacing (First Encounter)", new Object[0]);
        this.stats.add(YellowStats.loveInterest, ".....", new Object[0]);
        this.stats.add(YellowStats.likes, "Comfort, Yellow-colored things, etc...", new Object[0]);
        this.stats.add(YellowStats.dislikes, "Anything explosive, especially Thorium Reactors\n[gray](with the exception of her own weapons in Unit form)[]", new Object[0]);
    }
    
    private static final Unit _init_$lambda$0() {
        return (Unit)new YellowUnitEntity();
    }
    
    private static final void setStats$lambda$2$lambda$1(final Function1 $tmp0, final Object p0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke(p0);
    }
    
    private static final void setStats$lambda$2(final YellowUnitType this$0, final Table me) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(me, "me");
        me.add().row();
        YellowUtilsKt.INSTANCE.seperator(me, 290.0f, 4.0f);
        me.row();
        this$0.weapons.each(YellowUnitType::setStats$lambda$2$lambda$1);
    }
}
