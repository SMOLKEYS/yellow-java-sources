/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  mindustry.game.Team
 */
package yellow.game;

import arc.graphics.Color;
import mindustry.game.Team;

public class YellowTeam
extends Team {
    public static final YellowTeam azmar = new YellowTeam(1000, "azmar", Color.yellow);

    protected YellowTeam(int id, String name, Color color) {
        super(id, name, color);
    }
}

