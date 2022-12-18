// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import mindustry.type.UnitType;
import yellow.world.blocks.units.SummoningShrine;
import mindustry.world.Block;

public class YellowBlocks
{
    public static Block yellowPropBlock;
    public static Block yellowShrine;
    
    public static void load() {
        YellowBlocks.yellowPropBlock = new Block("yellow-prop-block") {
            {
                this.size = 1;
                this.solid = false;
            }
        };
        YellowBlocks.yellowShrine = new SummoningShrine(YellowUnitTypes.yellow) {
            {
                this.health = 1685;
                this.size = 1;
                this.setSummonTime(180.0f);
            }
        };
    }
}
