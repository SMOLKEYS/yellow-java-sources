/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Mathf
 *  mindustry.type.Item
 */
package yellow.content;

import arc.math.Mathf;
import mindustry.type.Item;
import yellow.type.FoodItem;

public class YellowItems {
    public static Item surgeCandy;
    public static Item megaCopperPack;
    public static Item lesserMegaCopperPack;
    public static Item carbideChips;
    public static Item trueCarbideChips;
    public static Item stockItem;

    public static void load() {
        surgeCandy = new FoodItem("surge-candy"){
            {
                this.nameShort = "SurgCndy";
                this.healing = 170.0f;
            }
        };
        megaCopperPack = new FoodItem("mega-copper-pack"){
            {
                this.nameShort = "MCoprPck";
                this.healAllAllies = true;
                this.healUsingPercentage = true;
                this.healingPercent = 0.05f;
            }
        };
        lesserMegaCopperPack = new FoodItem("lesser-mega-copper-pack"){
            {
                this.nameShort = "LCoprPck";
                this.healUsingPercentage = true;
                this.healingPercent = 0.05f;
            }
        };
        carbideChips = new FoodItem("carbide-chips"){
            {
                this.nameShort = "CarbChps";
                this.healUsingPercentage = true;
                this.healingPercent = 1.01f;
            }

            @Override
            public void update() {
                if (Mathf.chance((double)0.07)) {
                    this.healingPercent = Mathf.random((float)1.01f, (float)200000.0f);
                }
            }
        };
        stockItem = new FoodItem("stock-item"){
            {
                this.nameShort = "StckItem";
                this.healing = 0.0f;
                this.healingPercent = 0.0f;
                this.internalFood = true;
                this.hidden = true;
            }
        };
    }
}

