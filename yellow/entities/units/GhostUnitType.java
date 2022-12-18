// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.units;

import yellow.entities.units.entity.GhostUnitEntity;
import yellow.content.YellowFx;
import arc.math.geom.Vec2;
import mindustry.entities.Effect;
import mindustry.type.UnitType;

public class GhostUnitType extends UnitType
{
    public float ghostLifetime;
    public Effect despawnEffect;
    public Vec2 despawnEffectOffset;
    
    public GhostUnitType(final String name) {
        super(name);
        this.ghostLifetime = 900.0f;
        this.despawnEffect = YellowFx.ghostDespawnMulti;
        this.despawnEffectOffset = new Vec2();
        this.constructor = GhostUnitEntity::new;
    }
}
