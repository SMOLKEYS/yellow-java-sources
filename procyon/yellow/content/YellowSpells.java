// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import yellow.type.Spell;

public class YellowSpells
{
    public static Spell heal;
    
    public static void load() {
        YellowSpells.heal = new Spell() {
            {
                this.setCost(15.0f);
            }
        };
    }
}
