/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  mindustry.type.Weapon
 */
package yellow.type;

import arc.Core;
import mindustry.type.Weapon;

public class NameableWeapon
extends Weapon {
    public String displayName = "displayed weapon name";
    public String description;

    public NameableWeapon(String name, String displayName) {
        super(name);
        if (displayName == null) {
            throw new NullPointerException("displayName of weapon " + name + " cannot be null.");
        }
        this.displayName = displayName;
        if (this.description == null) {
            this.description = this.descriptionLocalized();
        }
    }

    public String descriptionLocalized() {
        return Core.bundle.get("weapon." + this.name + ".description");
    }
}

