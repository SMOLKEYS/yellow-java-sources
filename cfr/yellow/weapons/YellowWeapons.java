/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.graphics.Color
 *  arc.graphics.g2d.Draw
 *  mindustry.content.Fx
 *  mindustry.entities.bullet.BasicBulletType
 *  mindustry.entities.bullet.BulletType
 *  mindustry.entities.bullet.ContinuousFlameBulletType
 *  mindustry.entities.bullet.ContinuousLaserBulletType
 *  mindustry.entities.part.FlarePart
 *  mindustry.entities.part.ShapePart
 *  mindustry.entities.pattern.ShootSpread
 *  mindustry.gen.Bullet
 *  mindustry.gen.Sounds
 *  mindustry.type.Weapon
 */
package yellow.weapons;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.ContinuousFlameBulletType;
import mindustry.entities.bullet.ContinuousLaserBulletType;
import mindustry.entities.part.FlarePart;
import mindustry.entities.part.ShapePart;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.Bullet;
import mindustry.gen.Sounds;
import mindustry.type.Weapon;
import yellow.content.YellowBullets;
import yellow.content.YellowFx;
import yellow.content.YellowUnitTypes;
import yellow.entities.bullet.PainfulPierceBulletType;
import yellow.entities.bullet.YeetBulletType;
import yellow.type.DisableableWeapon;
import yellow.type.DistanceBasedWeapon;

public class YellowWeapons {
    public static Weapon meltdownBurstAttack;
    public static Weapon bullethell;
    public static Weapon antiMothSpray;
    public static Weapon decimation;
    public static Weapon airstrikeFlareLauncher;
    public static Weapon disruptor;
    public static Weapon ghostCall;
    public static Weapon ghostRain;
    public static Weapon speedEngine;
    public static Weapon dualSpeedEngine;

    public static void load() {
        meltdownBurstAttack = new DisableableWeapon("meltdown-burst", "Meltdown Burst"){
            {
                this.reload = 60.0f;
                this.x = 56.0f;
                this.mirror = false;
                this.shootSound = Sounds.explosionbig;
                this.minWarmup = 0.99f;
                this.shoot = new ShootSpread(){
                    {
                        this.shots = 15;
                        this.shotDelay = 5.0f;
                        this.spread = 5.0f;
                    }
                };
                this.bullet = new ContinuousLaserBulletType(){
                    {
                        this.damage = 150.0f;
                        this.width = 8.0f;
                        this.length = 240.0f;
                        this.lifetime = 60.0f;
                        this.lightColor = Color.yellow;
                    }
                };
            }
        };
        bullethell = new DisableableWeapon("bullethell", "Bullethell"){
            {
                this.reload = 900.0f;
                this.ejectEffect = YellowFx.bullethellShootEffect;
                this.x = 0.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.shoot = new ShootSpread(){
                    {
                        this.shots = 690;
                        this.shotDelay = 1.0f;
                        this.spread = 25.0f;
                    }
                };
                this.bullet = new BasicBulletType(){
                    {
                        this.damage = 300.0f;
                        this.width = 12.0f;
                        this.height = 12.0f;
                        this.lifetime = 300.0f;
                        this.speed = 6.0f;
                        this.hitEffect = YellowFx.ghostDespawnMulti;
                        this.despawnEffect = YellowFx.ghostDespawnMulti;
                        this.backRegion = Core.atlas.find("flare");
                        this.frontRegion = Core.atlas.find("flare");
                        this.sprite = "flare";
                        this.trailEffect = Fx.trailFade;
                        this.trailLength = 3;
                        this.shrinkX = 0.0f;
                        this.shrinkY = 0.0f;
                        this.weaveMag = 1.205f;
                        this.weaveScale = 4000.0f;
                        this.pierce = true;
                        this.pierceBuilding = true;
                        this.pierceCap = 35;
                    }

                    public void draw(Bullet b) {
                        super.draw(b);
                        Draw.z((float)115.0f);
                    }
                };
            }
        };
        antiMothSpray = new DisableableWeapon("anti-moth-spray", "Anti Moth Spray"){
            {
                this.reload = 2.0f;
                this.x = 3.0f;
                this.mirror = false;
                this.shoot.shots = 25;
                this.inaccuracy = 15.0f;
                this.minWarmup = 0.99f;
                this.bullet = new BasicBulletType(){
                    {
                        this.damage = 20.0f;
                        this.lifetime = 60.0f;
                        this.speed = 4.0f;
                        this.width = 8.0f;
                        this.height = 8.0f;
                        this.knockback = 5.0f;
                    }
                };
            }
        };
        decimation = new DisableableWeapon("decimation", "Decimation"){
            {
                this.reload = 300.0f;
                this.x = 48.0f;
                this.mirror = false;
                this.shoot.shots = 8;
                this.inaccuracy = 35.0f;
                this.minWarmup = 0.99f;
                this.bullet = new BasicBulletType(){
                    {
                        this.damage = 8500.0f;
                        this.splashDamage = 7000.0f;
                        this.splashDamageRadius = 192.0f;
                        this.lifetime = 420.0f;
                        this.speed = 2.0f;
                        this.width = 8.0f;
                        this.height = 8.0f;
                        this.hitEffect = YellowFx.yellowExplosionOut;
                        this.despawnEffect = YellowFx.yellowExplosionOut;
                        this.parts.add((Object)new ShapePart(){
                            {
                                this.sides = 6;
                                this.radius = 10.0f;
                                this.layer = 100.0f;
                                this.rotateSpeed = 4.0f;
                                this.color = this.colorTo = Color.yellow;
                            }
                        }, (Object)new ShapePart(){
                            {
                                this.sides = 3;
                                this.radius = 15.0f;
                                this.hollow = true;
                                this.layer = 100.0f;
                                this.rotateSpeed = 3.0f;
                                this.color = this.colorTo = Color.yellow;
                            }
                        });
                    }

                    public void draw(Bullet b) {
                        super.draw(b);
                    }
                };
            }
        };
        airstrikeFlareLauncher = new DisableableWeapon("airstrike-flare-launcher", "Airstrike Flare Launcher"){
            {
                this.reload = 300.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.bullet = YellowBullets.standardMissileCaller;
            }
        };
        disruptor = new DisableableWeapon("disruptor", "Disruptor"){
            {
                this.reload = 600.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.inaccuracy = 360.0f;
                this.shoot.shots = 350;
                this.bullet = new PainfulPierceBulletType(15.0f, 30.0f, 10.0f){
                    {
                        super(arg0, arg1, arg2);
                        this.lifetime = 600.0f;
                        this.drag = 0.003f;
                        this.weaveMag = 3.0f;
                        this.weaveScale = 300.0f;
                        this.hitSize = 12.0f;
                        this.trailEffect = Fx.trailFade;
                        this.trailLength = 3;
                        this.parts.add((Object)new FlarePart(){
                            {
                                this.followRotation = true;
                                this.radius = 50.0f;
                                this.sides = 8;
                            }
                        });
                    }
                };
            }
        };
        ghostCall = new DisableableWeapon("ghost-call", "Ghost Call"){
            {
                this.reload = 240.0f;
                this.x = 24.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.shoot.shots = 35;
            }
        };
        ghostRain = new DisableableWeapon("ghost-rain", "Ghost Rain"){
            {
                this.reload = 30.0f;
                this.x = 80.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.inaccuracy = 360.0f;
                this.shoot.shots = 20;
                this.shoot.shotDelay = 5.0f;
                this.bullet = new YeetBulletType(){
                    {
                        this.speed = 10.0f;
                        this.drag = 0.1f;
                        this.lifetime = 240.0f;
                        this.damage = 40.0f;
                        this.width = 12.0f;
                        this.height = 12.0f;
                        this.homingRange = 80.0f;
                        this.homingPower = 0.1f;
                        this.hitEffect = YellowFx.ghostDespawnMulti;
                        this.despawnEffect = YellowFx.ghostDespawnMulti;
                        this.backRegion = Core.atlas.find("flare");
                        this.frontRegion = Core.atlas.find("flare");
                        this.sprite = "flare";
                        this.shrinkX = 0.0f;
                        this.shrinkY = 0.0f;
                    }
                };
            }
        };
        speedEngine = new DistanceBasedWeapon("speed-engine", "Speed Engine"){
            {
                this.enabledDefault = false;
                this.rotate = false;
                this.baseRotation = 180.0f;
                this.shootCone = 360.0f;
                this.mirror = false;
                this.y = 0.0f;
                this.x = 0.0f;
                this.shootSound = Sounds.pulse;
                this.bullet = new ContinuousFlameBulletType(){
                    {
                        this.recoil = -0.32f;
                        this.damage = 60.0f;
                        this.knockback = 50.0f;
                        this.flareColor = Color.yellow;
                        this.colors = new Color[]{Color.yellow, Color.orange};
                    }
                };
            }
        };
        dualSpeedEngine = new DistanceBasedWeapon("dual-speed-engine", "Dual Speed Engine"){
            {
                this.enabledDefault = false;
                this.rotate = false;
                this.holdTime = 120.0f;
                this.baseRotation = 215.0f;
                this.shootCone = 360.0f;
                this.mirror = false;
                this.y = 0.0f;
                this.x = 0.0f;
                this.shootSound = Sounds.none;
                this.bullet = new ContinuousFlameBulletType(){
                    {
                        this.recoil = -0.32f;
                        this.damage = 60.0f;
                        this.knockback = 50.0f;
                        this.length = 45.0f;
                        this.flareColor = Color.yellow;
                        this.colors = new Color[]{Color.yellow, Color.orange};
                    }
                };
            }
        };
    }

    public static void afterLoad() {
        BulletType bul = new BulletType();
        bul.spawnUnit = YellowUnitTypes.ghostFlare;
        bul.load();
        YellowWeapons.ghostCall.bullet = bul;
    }
}

