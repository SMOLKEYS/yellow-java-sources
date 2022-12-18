/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.geom.Vec2
 *  mindustry.entities.Effect
 *  mindustry.type.UnitType
 */
package yellow.entities.units;

import arc.math.geom.Vec2;
import mindustry.entities.Effect;
import mindustry.type.UnitType;
import yellow.content.YellowFx;
import yellow.entities.units.entity.GhostUnitEntity;

public class GhostUnitType
extends UnitType {
    public float ghostLifetime = 900.0f;
    public Effect despawnEffect = YellowFx.ghostDespawnMulti;
    public Vec2 despawnEffectOffset = new Vec2();

    public GhostUnitType(String name) {
        super(name);
        this.constructor = GhostUnitEntity::new;
    }
}

