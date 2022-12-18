/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  arc.graphics.g2d.Draw
 *  arc.graphics.g2d.Fill
 *  arc.graphics.g2d.Lines
 *  arc.math.Mathf
 *  arc.scene.ui.layout.Table
 *  arc.util.Time
 *  arc.util.Tmp
 *  mindustry.ai.UnitCommand
 *  mindustry.gen.Unit
 *  mindustry.type.UnitType
 *  mindustry.type.Weapon
 *  mindustry.world.meta.Stat
 *  mindustry.world.meta.StatUnit
 */
package yellow.entities.units;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.math.Mathf;
import arc.scene.ui.layout.Table;
import arc.util.Time;
import arc.util.Tmp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.ai.UnitCommand;
import mindustry.gen.Unit;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;
import org.jetbrains.annotations.NotNull;
import yellow.entities.units.entity.YellowUnitEntity;
import yellow.internal.util.YellowUtilsKt;
import yellow.type.DisableableWeapon;
import yellow.world.meta.YellowStats;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2={"Lyellow/entities/units/YellowUnitType;", "Lmindustry/type/UnitType;", "name", "", "(Ljava/lang/String;)V", "maxLives", "", "getMaxLives", "()I", "setMaxLives", "(I)V", "draw", "", "unit", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "setStats", "yellow-java"})
public class YellowUnitType
extends UnitType {
    private int maxLives;

    public YellowUnitType(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super(name);
        this.maxLives = 5;
        this.constructor = YellowUnitType::_init_$lambda$0;
        this.defaultCommand = UnitCommand.assistCommand;
    }

    public final int getMaxLives() {
        return this.maxLives;
    }

    public final void setMaxLives(int n) {
        this.maxLives = n;
    }

    public void draw(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        super.draw(unit);
        float s = Mathf.absin((float)Time.time, (float)16.0f, (float)1.0f);
        float r1 = s * 25.0f;
        float r2 = s * 20.0f;
        Draw.z((float)110.0f);
        Draw.color((Color)Color.yellow);
        Lines.circle((float)unit.x, (float)unit.y, (float)(20.0f + r1));
        Lines.square((float)unit.x, (float)unit.y, (float)(20.0f + r1), (float)Time.time);
        Lines.square((float)unit.x, (float)unit.y, (float)(20.0f + r1), (float)(-Time.time));
        Tmp.v1.trns(Time.time, r2, r2);
        Fill.circle((float)(unit.x + Tmp.v1.x), (float)(unit.y + Tmp.v1.y), (float)(2.0f + s * 8.0f));
        Tmp.v1.trns(Time.time, -r2, -r2);
        Fill.circle((float)(unit.x + Tmp.v1.x), (float)(unit.y + Tmp.v1.y), (float)(2.0f + s * 8.0f));
        Tmp.c1.set(Color.white);
        Tmp.c1.a = 0.0f;
        Fill.light((float)unit.x, (float)unit.y, (int)5, (float)(50.0f - r1), (Color)Color.yellow, (Color)Tmp.c1);
    }

    public void setStats() {
        super.setStats();
        this.stats.useCategories = true;
        this.stats.remove(Stat.health);
        this.stats.add(Stat.health, Mathf.round((float)(this.health * (float)this.maxLives)) + " (" + (int)this.health + " x " + this.maxLives + ')', new Object[0]);
        this.stats.remove(Stat.itemCapacity);
        this.stats.add(YellowStats.itemCapacityAlt, String.valueOf(this.itemCapacity), new Object[0]);
        this.stats.remove(Stat.weapons);
        this.stats.add(YellowStats.weaponsAlt, arg_0 -> YellowUnitType.setStats$lambda$3(this, arg_0));
        this.stats.remove(Stat.range);
        Object[] objectArray = new Object[]{StatUnit.blocks};
        this.stats.add(YellowStats.rangeAlt, String.valueOf((int)(this.maxRange / (float)8)), objectArray);
        this.stats.add(YellowStats.maxLives, String.valueOf(this.maxLives), new Object[0]);
        this.stats.add(YellowStats.extras, "1000-8000 [cyan]shield health[] on first death\nRandom chance of teleporting frantically on last life\nRandom chance of teleporting frantically AND dropping plasma bombs on last life\nFourth-wall breaker (Pilot/Human Form)", new Object[0]);
        this.stats.add(YellowStats.name, "Nihara", new Object[0]);
        this.stats.add(YellowStats.gender, "Female", new Object[0]);
        objectArray = new Object[]{YellowStats.yearsOld};
        this.stats.add(YellowStats.age, "23", objectArray);
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

    private static final void setStats$lambda$3$lambda$2$lambda$1() {
    }

    private static final void setStats$lambda$3$lambda$2(Table $me, Weapon it) {
        Intrinsics.checkNotNullParameter($me, "$me");
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type yellow.type.DisableableWeapon");
        DisableableWeapon suse = (DisableableWeapon)it;
        if (!suse.mirroredVersion) {
            $me.add((CharSequence)suse.displayName);
            $me.button("?", YellowUnitType::setStats$lambda$3$lambda$2$lambda$1).size(35.0f);
            $me.row();
            YellowUtilsKt.INSTANCE.seperator($me, 290.0f, 4.0f);
            $me.row();
        }
    }

    private static final void setStats$lambda$3(YellowUnitType this$0, Table me) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter(me, "me");
        me.add().row();
        YellowUtilsKt.INSTANCE.seperator(me, 290.0f, 4.0f);
        me.row();
        this$0.weapons.each(arg_0 -> YellowUnitType.setStats$lambda$3$lambda$2(me, arg_0));
    }
}

