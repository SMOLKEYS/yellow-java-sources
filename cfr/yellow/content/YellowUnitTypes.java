/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  mindustry.ai.types.FlyingAI
 *  mindustry.type.UnitType
 *  mindustry.type.Weapon
 */
package yellow.content;

import arc.Core;
import mindustry.ai.types.FlyingAI;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import yellow.ai.YellowFollowerAI;
import yellow.content.YellowFx;
import yellow.entities.units.GhostUnitType;
import yellow.entities.units.YellowUnitType;
import yellow.weapons.YellowWeapons;

public class YellowUnitTypes {
    public static UnitType yellow;
    public static UnitType ghostFlare;

    public static void load() {
        yellow = new YellowUnitType("yellow"){
            {
                this.flying = true;
                this.hideDetails = false;
                this.health = 23000.0f;
                this.armor = 5.0f;
                this.speed = 3.0f;
                this.accel = 0.08f;
                this.drag = 0.01f;
                this.range = 1250.0f;
                this.maxRange = 1250.0f;
                this.mineSpeed = 5000.0f;
                this.mineTier = 5000;
                this.itemCapacity = 8500;
                this.buildSpeed = 95000.0f;
                this.deathExplosionEffect = YellowFx.yellowDeathEffect;
                this.alwaysShootWhenMoving = true;
                this.allowedInPayloads = false;
                this.createScorch = false;
                this.createWreck = false;
                this.aiController = FlyingAI::new;
                this.region = Core.atlas.find("yellow");
                this.weapons.addAll((Object[])new Weapon[]{YellowWeapons.meltdownBurstAttack, YellowWeapons.bullethell, YellowWeapons.airstrikeFlareLauncher, YellowWeapons.antiMothSpray, YellowWeapons.decimation, YellowWeapons.disruptor, YellowWeapons.ghostCall, YellowWeapons.ghostRain, YellowWeapons.speedEngine});
            }
        };
        ghostFlare = new GhostUnitType("ghost-flare"){
            {
                this.flying = true;
                this.health = 37.5f;
                this.armor = 5.0f;
                this.speed = 5.5f;
                this.accel = 0.08f;
                this.drag = 0.01f;
                this.lifetime = 960.0f;
                this.controller = u -> new YellowFollowerAI();
                this.region = Core.atlas.find("flare");
            }
        };
    }
}

