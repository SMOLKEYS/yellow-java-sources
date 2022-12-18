// 
// Decompiled by Procyon v0.6.0
// 

package yellow.type;

import arc.Core;
import mindustry.type.Weapon;

public class NameableWeapon extends Weapon
{
    public String displayName;
    public String description;
    
    public NameableWeapon(final String name, final String displayName) {
        super(name);
        this.displayName = "displayed weapon name";
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
