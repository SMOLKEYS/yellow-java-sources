// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import yellow.entities.bullet.AirstrikeFlare;
import mindustry.entities.bullet.BombBulletType;
import mindustry.entities.bullet.BulletType;

public class YellowBullets
{
    public static BulletType standardMissile;
    public static BulletType standardMissileCaller;
    public static BulletType placeholderYeetBullet;
    
    public static void load() {
        YellowBullets.standardMissile = (BulletType)new BombBulletType() {
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
        YellowBullets.standardMissileCaller = (BulletType)new AirstrikeFlare(YellowBullets.standardMissile);
    }
}
