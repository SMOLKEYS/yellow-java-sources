// 
// Decompiled by Procyon v0.6.0
// 

package yellow.weapons;

import arc.graphics.g2d.TextureRegion;
import mindustry.entities.pattern.ShootPattern;
import yellow.content.YellowUnitTypes;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.ContinuousFlameBulletType;
import yellow.type.DistanceBasedWeapon;
import yellow.entities.bullet.YeetBulletType;
import mindustry.entities.part.FlarePart;
import yellow.entities.bullet.PainfulPierceBulletType;
import yellow.content.YellowBullets;
import mindustry.entities.part.ShapePart;
import arc.graphics.g2d.Draw;
import mindustry.gen.Bullet;
import mindustry.content.Fx;
import arc.Core;
import mindustry.entities.bullet.BasicBulletType;
import yellow.content.YellowFx;
import arc.graphics.Color;
import mindustry.entities.bullet.ContinuousLaserBulletType;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.Sounds;
import yellow.type.DisableableWeapon;
import mindustry.type.Weapon;

public class YellowWeapons
{
    public static Weapon meltdownBurstAttack;
    public static Weapon bullethell;
    public static Weapon antiMothSpray;
    public static Weapon decimation;
    public static Weapon airstrikeFlareLauncher;
    public static Weapon disruptor;
    public static Weapon ghostCall;
    public static Weapon ghostRain;
    public static Weapon speedEngine;
    
    public static void load() {
        YellowWeapons.meltdownBurstAttack = new DisableableWeapon() {
            {
                this.reload = 60.0f;
                this.x = 56.0f;
                this.mirror = false;
                this.shootSound = Sounds.explosionbig;
                this.minWarmup = 0.99f;
                this.shoot = (ShootPattern)new ShootSpread() {
                    {
                        this.shots = 15;
                        this.shotDelay = 5.0f;
                        this.spread = 5.0f;
                    }
                };
                this.bullet = (BulletType)new ContinuousLaserBulletType() {
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
        YellowWeapons.bullethell = new DisableableWeapon() {
            {
                this.reload = 900.0f;
                this.ejectEffect = YellowFx.bullethellShootEffect;
                this.x = 0.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.shoot = (ShootPattern)new ShootSpread() {
                    {
                        this.shots = 690;
                        this.shotDelay = 1.0f;
                        this.spread = 25.0f;
                    }
                };
                this.bullet = (BulletType)new BasicBulletType() {
                    {
                        this.damage = 300.0f;
                        this.width = 12.0f;
                        this.height = 12.0f;
                        this.lifetime = 300.0f;
                        this.speed = 6.0f;
                        this.hitEffect = YellowFx.ghostDespawnMulti;
                        this.despawnEffect = YellowFx.ghostDespawnMulti;
                        this.backRegion = (TextureRegion)Core.atlas.find("flare");
                        this.frontRegion = (TextureRegion)Core.atlas.find("flare");
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
                    
                    public void draw(final Bullet b) {
                        super.draw(b);
                        Draw.z(115.0f);
                    }
                };
            }
        };
        YellowWeapons.antiMothSpray = new DisableableWeapon() {
            {
                this.reload = 2.0f;
                this.x = 3.0f;
                this.mirror = false;
                this.shoot.shots = 25;
                this.inaccuracy = 15.0f;
                this.minWarmup = 0.99f;
                this.bullet = (BulletType)new BasicBulletType() {
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
        YellowWeapons.decimation = new DisableableWeapon() {
            {
                this.reload = 300.0f;
                this.x = 48.0f;
                this.mirror = false;
                this.shoot.shots = 8;
                this.inaccuracy = 35.0f;
                this.minWarmup = 0.99f;
                this.bullet = (BulletType)new BasicBulletType() {
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
                        this.parts.add((Object)new ShapePart() {
                            {
                                this.sides = 6;
                                this.radius = 10.0f;
                                this.layer = 100.0f;
                                this.rotateSpeed = 4.0f;
                                final Color yellow = Color.yellow;
                                this.colorTo = yellow;
                                this.color = yellow;
                            }
                        }, (Object)new ShapePart() {
                            {
                                this.sides = 3;
                                this.radius = 15.0f;
                                this.hollow = true;
                                this.layer = 100.0f;
                                this.rotateSpeed = 3.0f;
                                final Color yellow = Color.yellow;
                                this.colorTo = yellow;
                                this.color = yellow;
                            }
                        });
                    }
                    
                    public void draw(final Bullet b) {
                        super.draw(b);
                    }
                };
            }
        };
        YellowWeapons.airstrikeFlareLauncher = new DisableableWeapon("airstrike-flare-launcher", "Airstrike Flare Launcher") {
            {
                this.reload = 300.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.bullet = YellowBullets.standardMissileCaller;
            }
        };
        YellowWeapons.disruptor = new DisableableWeapon() {
            {
                this.reload = 600.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.inaccuracy = 360.0f;
                this.shoot.shots = 350;
                this.bullet = new PainfulPierceBulletType(15.0f, 30.0f, 10.0f) {
                    {
                        this.lifetime = 600.0f;
                        this.drag = 0.003f;
                        this.weaveMag = 3.0f;
                        this.weaveScale = 300.0f;
                        this.hitSize = 12.0f;
                        this.trailEffect = Fx.trailFade;
                        this.trailLength = 3;
                        this.parts.add((Object)new FlarePart() {
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
        YellowWeapons.ghostCall = new DisableableWeapon("ghost-call", "Ghost Call") {
            {
                this.reload = 240.0f;
                this.x = 24.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.shoot.shots = 35;
            }
        };
        YellowWeapons.ghostRain = new DisableableWeapon() {
            {
                this.reload = 30.0f;
                this.x = 80.0f;
                this.y = 0.0f;
                this.mirror = false;
                this.minWarmup = 0.99f;
                this.inaccuracy = 360.0f;
                this.shoot.shots = 20;
                this.shoot.shotDelay = 5.0f;
                this.bullet = (BulletType)new YeetBulletType() {
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
                        this.backRegion = (TextureRegion)Core.atlas.find("flare");
                        this.frontRegion = (TextureRegion)Core.atlas.find("flare");
                        this.sprite = "flare";
                        this.shrinkX = 0.0f;
                        this.shrinkY = 0.0f;
                    }
                };
            }
        };
        YellowWeapons.speedEngine = new DistanceBasedWeapon() {
            {
                this.enabledDefault = false;
                this.rotate = false;
                this.baseRotation = 180.0f;
                this.shootCone = 360.0f;
                this.mirror = false;
                final float n = 0.0f;
                this.y = n;
                this.x = n;
                this.shootSound = Sounds.pulse;
                this.bullet = (BulletType)new ContinuousFlameBulletType() {
                    {
                        this.recoil = -0.32f;
                        this.damage = 60.0f;
                        this.knockback = 50.0f;
                        this.flareColor = Color.yellow;
                        this.colors = new Color[] { Color.yellow, Color.orange };
                    }
                };
            }
        };
    }
    
    public static void afterLoad() {
        final BulletType bul = new BulletType();
        bul.spawnUnit = YellowUnitTypes.ghostFlare;
        bul.load();
        YellowWeapons.ghostCall.bullet = bul;
    }
}
