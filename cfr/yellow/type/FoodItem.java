/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.func.Cons
 *  arc.struct.OrderedMap
 *  arc.struct.Seq
 *  mindustry.game.Team
 *  mindustry.gen.Groups
 *  mindustry.gen.Unit
 *  mindustry.type.Item
 *  mindustry.type.UnitType
 */
package yellow.type;

import arc.func.Cons;
import arc.struct.OrderedMap;
import arc.struct.Seq;
import mindustry.game.Team;
import mindustry.gen.Groups;
import mindustry.gen.Unit;
import mindustry.type.Item;
import mindustry.type.UnitType;
import yellow.internal.util.YellowUtils;
import yellow.internal.util.YellowUtilsKtKt;
import yellow.world.meta.YellowStats;

public class FoodItem
extends Item {
    public static Seq<FoodItem> instances = YellowUtilsKtKt.seqOf(new FoodItem[0]);
    public String nameShort = "FoodItem";
    public float healing = 40.0f;
    public float healingPercent = 0.0f;
    public boolean healAllAllies = false;
    public boolean healUsingPercentage = false;
    public boolean internalFood = false;
    public final OrderedMap<UnitType, String[]> responses = new OrderedMap();
    public Cons<Unit> consUnit = u -> {};
    public Cons<FoodItem> consSelf = i2 -> {};

    public FoodItem(String name) {
        super(name);
        instances.add((Object)this);
    }

    public void setStats() {
        if (this.healUsingPercentage) {
            this.stats.addPercent(YellowStats.healingPercent, this.healingPercent);
        } else {
            this.stats.add(YellowStats.healing, this.healing, YellowStats.hp);
        }
        this.stats.add(YellowStats.healAllAllies, this.healAllAllies);
    }

    public void update() {
    }

    private void handle(Unit unit) {
        if (this.healUsingPercentage) {
            unit.healFract(this.healingPercent);
        } else {
            unit.heal(this.healing);
        }
        this.consUnit.get((Object)unit);
        this.consSelf.get((Object)this);
    }

    public boolean hasThis(Team team) {
        return team.items().get((Item)this) >= 1;
    }

    public void consume(Unit unit, Team team) {
        if (this.healAllAllies && team != null) {
            Groups.unit.each(un -> {
                if (un.team == team) {
                    this.handle((Unit)un);
                }
            });
        } else if (unit != null) {
            this.handle(unit);
        }
        if (team != null) {
            team.items().remove((Item)this, 1);
        } else if (unit != null) {
            unit.team.items().remove((Item)this, 1);
        }
    }

    public String response(Unit unit) {
        if (!this.responses.containsKey((Object)unit.type)) {
            return "...";
        }
        return YellowUtils.random((String[])this.responses.get((Object)unit.type));
    }
}

