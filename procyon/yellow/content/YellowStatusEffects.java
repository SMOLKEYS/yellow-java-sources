// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import arc.math.Mathf;
import mindustry.gen.Unit;
import mindustry.game.Team;
import mindustry.type.StatusEffect;

public class YellowStatusEffects
{
    public static StatusEffect demise;
    public static StatusEffect karma;
    
    public static void load() {
        YellowStatusEffects.demise = new StatusEffect("demise") {
            {
                this.color = Team.derelict.color;
                this.damage = Float.MAX_VALUE;
                this.show = true;
            }
            
            public void update(final Unit unit, final float time) {
                super.update(unit, time);
                unit.kill();
            }
        };
        YellowStatusEffects.karma = new StatusEffect("karma") {
            {
                this.color = Team.malis.color;
                this.show = false;
            }
            
            public void update(final Unit unit, final float time) {
                if (unit.health <= unit.type.health / 8.0f) {
                    unit.unapply((StatusEffect)this);
                }
                if (Mathf.chanceDelta(0.6)) {
                    unit.damage(1.0f);
                }
            }
        };
    }
}
