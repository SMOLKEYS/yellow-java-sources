/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.entities.bullet.BombBulletType
 *  mindustry.entities.bullet.BulletType
 */
package yellow.content;

import mindustry.entities.bullet.BombBulletType;
import mindustry.entities.bullet.BulletType;
import yellow.entities.bullet.AirstrikeFlare;

public class YellowBullets {
    public static BulletType standardMissile;
    public static BulletType standardMissileCaller;
    public static BulletType placeholderYeetBullet;

    public static void load() {
        standardMissile = new BombBulletType(){
            {
                this.lifetime = 60.0f;
                this.speed = 0.0f;
                this.width = 32.0f;
                this.height = 32.0f;
                this.shrinkX = 0.6f;
                this.shrinkY = 0.6f;
                this.damage = 350.0f;
                this.splashDamage = 310.0f;
                this.splashDamageRadius = 88.0f;
                this.spin = 7.0f;
                this.sprite = "yellow-java-standard-missile";
            }
        };
        standardMissileCaller = new AirstrikeFlare(standardMissile);
    }
}

