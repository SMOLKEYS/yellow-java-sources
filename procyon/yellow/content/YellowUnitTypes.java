// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import arc.graphics.g2d.TextureRegion;
import yellow.ai.YellowFollowerAI;
import mindustry.entities.units.UnitController;
import mindustry.gen.Unit;
import yellow.entities.units.GhostUnitType;
import yellow.weapons.YellowWeapons;
import mindustry.type.Weapon;
import arc.Core;
import mindustry.ai.types.FlyingAI;
import yellow.entities.units.YellowUnitType;
import mindustry.type.UnitType;

public class YellowUnitTypes
{
    public static UnitType yellow;
    public static UnitType ghostFlare;
    
    public static void load() {
        YellowUnitTypes.yellow = new YellowUnitType("yellow") {
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
                this.region = (TextureRegion)Core.atlas.find("yellow");
                this.weapons.addAll((Object[])new Weapon[] { YellowWeapons.meltdownBurstAttack, YellowWeapons.bullethell, YellowWeapons.airstrikeFlareLauncher, YellowWeapons.antiMothSpray, YellowWeapons.decimation, YellowWeapons.disruptor, YellowWeapons.ghostCall, YellowWeapons.ghostRain, YellowWeapons.speedEngine });
            }
        };
        YellowUnitTypes.ghostFlare = new GhostUnitType("ghost-flare") {
            {
                this.flying = true;
                this.health = 37.5f;
                this.armor = 5.0f;
                this.speed = 5.5f;
                this.accel = 0.08f;
                this.drag = 0.01f;
                this.lifetime = 960.0f;
                this.controller = (u -> new YellowFollowerAI());
                this.region = (TextureRegion)Core.atlas.find("flare");
            }
        };
    }
}
