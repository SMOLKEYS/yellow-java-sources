// 
// Decompiled by Procyon v0.6.0
// 

package yellow.game;

import arc.graphics.Color;
import mindustry.game.Team;

public class YellowTeam extends Team
{
    public static YellowTeam azmar;
    
    protected YellowTeam(final int id, final String name, final Color color) {
        super(id, name, color);
    }
    
    public static void load() {
        YellowTeam.azmar = new YellowTeam(7, "azmar", Color.yellow);
    }
    
    public boolean isEnemy(final Team other) {
        return this != other && other != Team.sharded;
    }
}
