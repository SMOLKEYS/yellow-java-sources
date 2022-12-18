/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.world.Block
 */
package yellow.content;

import mindustry.world.Block;
import yellow.content.YellowUnitTypes;
import yellow.world.blocks.units.SummoningShrine;

public class YellowBlocks {
    public static Block yellowPropBlock;
    public static Block yellowShrine;

    public static void load() {
        yellowPropBlock = new Block("yellow-prop-block"){
            {
                this.size = 1;
                this.solid = false;
            }
        };
        yellowShrine = new SummoningShrine(YellowUnitTypes.yellow){
            {
                this.health = 1685;
                this.size = 1;
                this.setSummonTime(180.0f);
            }
        };
    }
}

