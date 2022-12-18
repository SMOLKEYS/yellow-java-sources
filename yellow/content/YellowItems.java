// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import arc.math.Mathf;
import yellow.type.FoodItem;
import mindustry.type.Item;

public class YellowItems
{
    public static Item surgeCandy;
    public static Item megaCopperPack;
    public static Item lesserMegaCopperPack;
    public static Item carbideChips;
    public static Item trueCarbideChips;
    public static Item stockItem;
    
    public static void load() {
        YellowItems.surgeCandy = new FoodItem("surge-candy") {
            {
                this.nameShort = "SurgCndy";
                this.healing = 170.0f;
            }
        };
        YellowItems.megaCopperPack = new FoodItem("mega-copper-pack") {
            {
                this.nameShort = "MCoprPck";
                this.healAllAllies = true;
                this.healUsingPercentage = true;
                this.healingPercent = 0.05f;
            }
        };
        YellowItems.lesserMegaCopperPack = new FoodItem("lesser-mega-copper-pack") {
            {
                this.nameShort = "LCoprPck";
                this.healUsingPercentage = true;
                this.healingPercent = 0.05f;
            }
        };
        YellowItems.carbideChips = new FoodItem("carbide-chips") {
            {
                this.nameShort = "CarbChps";
                this.healUsingPercentage = true;
                this.healingPercent = 1.01f;
            }
            
            @Override
            public void update() {
                if (Mathf.chance(0.07)) {
                    this.healingPercent = Mathf.random(1.01f, 200000.0f);
                }
            }
        };
        YellowItems.stockItem = new FoodItem("stock-item") {
            {
                this.nameShort = "StckItem";
                final float n = 0.0f;
                this.healing = n;
                this.healingPercent = n;
                this.internalFood = true;
                this.hidden = true;
            }
        };
    }
}
