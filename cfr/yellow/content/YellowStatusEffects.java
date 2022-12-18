/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Mathf
 *  mindustry.game.Team
 *  mindustry.gen.Unit
 *  mindustry.type.StatusEffect
 */
package yellow.content;

import arc.math.Mathf;
import mindustry.game.Team;
import mindustry.gen.Unit;
import mindustry.type.StatusEffect;

public class YellowStatusEffects {
    public static StatusEffect demise;
    public static StatusEffect karma;

    public static void load() {
        demise = new StatusEffect("demise"){
            {
                this.color = Team.derelict.color;
                this.damage = Float.MAX_VALUE;
                this.show = true;
            }

            public void update(Unit unit, float time) {
                super.update(unit, time);
                unit.kill();
            }
        };
        karma = new StatusEffect("karma"){
            {
                this.color = Team.malis.color;
                this.show = false;
            }

            public void update(Unit unit, float time) {
                if (unit.health <= unit.type.health / 8.0f) {
                    unit.unapply((StatusEffect)this);
                }
                if (Mathf.chanceDelta((double)0.6)) {
                    unit.damage(1.0f);
                }
            }
        };
    }
}

