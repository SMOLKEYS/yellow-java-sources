// 
// Decompiled by Procyon v0.6.0
// 

package yellow.type;

import yellow.internal.util.YellowUtilsKtKt;
import yellow.internal.util.YellowUtils;
import mindustry.gen.Groups;
import mindustry.game.Team;
import yellow.world.meta.YellowStats;
import mindustry.gen.Unit;
import arc.func.Cons;
import mindustry.type.UnitType;
import arc.struct.OrderedMap;
import arc.struct.Seq;
import mindustry.type.Item;

public class FoodItem extends Item
{
    public static Seq<FoodItem> instances;
    public String nameShort;
    public float healing;
    public float healingPercent;
    public boolean healAllAllies;
    public boolean healUsingPercentage;
    public boolean internalFood;
    public final OrderedMap<UnitType, String[]> responses;
    public Cons<Unit> consUnit;
    public Cons<FoodItem> consSelf;
    
    public FoodItem(final String name) {
        super(name);
        this.nameShort = "FoodItem";
        this.healing = 40.0f;
        this.healingPercent = 0.0f;
        this.healAllAllies = false;
        this.healUsingPercentage = false;
        this.internalFood = false;
        this.responses = (OrderedMap<UnitType, String[]>)new OrderedMap();
        this.consUnit = (Cons<Unit>)(u -> {});
        this.consSelf = (Cons<FoodItem>)(i -> {});
        FoodItem.instances.add((Object)this);
    }
    
    public void setStats() {
        if (this.healUsingPercentage) {
            this.stats.addPercent(YellowStats.healingPercent, this.healingPercent);
        }
        else {
            this.stats.add(YellowStats.healing, this.healing, YellowStats.hp);
        }
        this.stats.add(YellowStats.healAllAllies, this.healAllAllies);
    }
    
    public void update() {
    }
    
    private void handle(final Unit unit) {
        if (this.healUsingPercentage) {
            unit.healFract(this.healingPercent);
        }
        else {
            unit.heal(this.healing);
        }
        this.consUnit.get((Object)unit);
        this.consSelf.get((Object)this);
    }
    
    public boolean hasThis(final Team team) {
        return team.items().get((Item)this) >= 1;
    }
    
    public void consume(final Unit unit, final Team team) {
        if (this.healAllAllies && team != null) {
            Groups.unit.each(un -> {
                if (un.team == team) {
                    this.handle(un);
                }
            });
        }
        else if (unit != null) {
            this.handle(unit);
        }
        if (team != null) {
            team.items().remove((Item)this, 1);
        }
        else if (unit != null) {
            unit.team.items().remove((Item)this, 1);
        }
    }
    
    public String response(final Unit unit) {
        if (!this.responses.containsKey((Object)unit.type)) {
            return "...";
        }
        return YellowUtils.random((String[])this.responses.get((Object)unit.type));
    }
    
    static {
        FoodItem.instances = YellowUtilsKtKt.seqOf(new FoodItem[0]);
    }
}
