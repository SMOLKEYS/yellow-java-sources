/*
 * Decompiled with CFR 0.152.
 */
package yellow.content;

import yellow.type.Spell;

public class YellowSpells {
    public static Spell heal;

    public static void load() {
        heal = new Spell(){
            {
                this.setCost(15.0f);
            }
        };
    }
}

