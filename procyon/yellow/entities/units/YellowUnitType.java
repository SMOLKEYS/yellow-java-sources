// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.units;

import yellow.internal.util.YellowUtilsKt;
import yellow.type.DisableableWeapon;
import arc.scene.ui.layout.Table;
import yellow.ui.buttons.dialogs.WeaponInfoDialog;
import yellow.type.NameableWeapon;
import yellow.Yellow;
import mindustry.type.Weapon;
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

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011" }, d2 = { "Lyellow/entities/units/YellowUnitType;", "Lmindustry/type/UnitType;", "name", "", "(Ljava/lang/String;)V", "maxLives", "", "getMaxLives", "()I", "setMaxLives", "(I)V", "draw", "", "unit", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "setStats", "yellow-java" })
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
        super.stats.useCategories = true;
        super.stats.remove(Stat.health);
        super.stats.add(Stat.health, Mathf.round(super.health * (float)this.maxLives) + " (" + (int)super.health + " x " + this.maxLives + ')', new Object[0]);
        super.stats.remove(Stat.itemCapacity);
        super.stats.add(YellowStats.itemCapacityAlt, String.valueOf(super.itemCapacity), new Object[0]);
        super.stats.remove(Stat.weapons);
        super.stats.add(YellowStats.weaponsAlt, YellowUnitType::setStats$lambda$3);
        super.stats.remove(Stat.range);
        super.stats.add(YellowStats.rangeAlt, String.valueOf((int)(super.maxRange / 8)), new Object[] { StatUnit.blocks });
        super.stats.add(YellowStats.maxLives, String.valueOf(this.maxLives), new Object[0]);
        super.stats.add(YellowStats.extras, "1000-8000 [cyan]shield health[] on first death\nRandom chance of teleporting frantically on last life\nRandom chance of teleporting frantically AND dropping plasma bombs on last life\nFourth-wall breaker (Pilot/Human Form)", new Object[0]);
        super.stats.add(YellowStats.name, "Nihara", new Object[0]);
        super.stats.add(YellowStats.gender, "Female", new Object[0]);
        super.stats.add(YellowStats.age, "23", new Object[] { YellowStats.yearsOld });
        super.stats.add(YellowStats.personality, "Kind/Friendly", new Object[0]);
        super.stats.add(YellowStats.headpatRating, "High", new Object[0]);
        super.stats.add(YellowStats.generalAura, "Menacing (First Encounter)", new Object[0]);
        super.stats.add(YellowStats.loveInterest, ".....", new Object[0]);
        super.stats.add(YellowStats.likes, "Comfort, Yellow-colored things, etc...", new Object[0]);
        super.stats.add(YellowStats.dislikes, "Anything explosive, especially Thorium Reactors\n[gray](with the exception of her own weapons in Unit form)[]", new Object[0]);
    }
    
    private static final Unit _init_$lambda$0() {
        return (Unit)new YellowUnitEntity();
    }
    
    private static final void setStats$lambda$3$lambda$2$lambda$1(final Weapon $it) {
        final WeaponInfoDialog weaponInfo = Yellow.weaponInfo;
        Intrinsics.checkNotNullExpressionValue($it, "it");
        weaponInfo.show((NameableWeapon)$it);
    }
    
    private static final void setStats$lambda$3$lambda$2(final Table $me, final Weapon it) {
        Intrinsics.checkNotNullParameter($me, "$me");
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type yellow.type.DisableableWeapon");
        final DisableableWeapon suse = (DisableableWeapon)it;
        if (!suse.mirroredVersion) {
            $me.add((CharSequence)suse.displayName);
            $me.button("?", YellowUnitType::setStats$lambda$3$lambda$2$lambda$1).size(35.0f);
            $me.row();
            YellowUtilsKt.INSTANCE.seperator($me, 290.0f, 4.0f);
            $me.row();
        }
    }
    
    private static final void setStats$lambda$3(final YellowUnitType this$0, final Table me) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(me, "me");
        me.add().row();
        YellowUtilsKt.INSTANCE.seperator(me, 290.0f, 4.0f);
        me.row();
        this$0.weapons.each(YellowUnitType::setStats$lambda$3$lambda$2);
    }
}
