/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Events
 *  arc.scene.Group
 *  arc.scene.style.Drawable
 *  arc.util.Log
 *  mindustry.Vars
 *  mindustry.game.EventType$ClientLoadEvent
 *  mindustry.game.EventType$Trigger
 *  mindustry.gen.Icon
 *  mindustry.mod.Mod
 *  mindustry.mod.Mods$LoadedMod
 *  mindustry.type.Weapon
 */
package yellow;

import arc.Events;
import arc.scene.Group;
import arc.scene.style.Drawable;
import arc.util.Log;
import mindustry.Vars;
import mindustry.game.EventType;
import mindustry.gen.Icon;
import mindustry.mod.Mod;
import mindustry.mod.Mods;
import mindustry.type.Weapon;
import yellow.YellowVars;
import yellow.content.YellowBlocks;
import yellow.content.YellowBullets;
import yellow.content.YellowItems;
import yellow.content.YellowPlanets;
import yellow.content.YellowStatusEffects;
import yellow.content.YellowUnitTypes;
import yellow.internal.YellowAutoUpdater;
import yellow.internal.YellowClassGateway;
import yellow.internal.util.YellowUtils;
import yellow.type.FoodItem;
import yellow.ui.YellowSettings;
import yellow.ui.buttons.YellowWeaponSwitch;
import yellow.ui.buttons.dialogs.FoodDialog;
import yellow.ui.buttons.dialogs.WeaponInfoDialog;
import yellow.weapons.YellowWeapons;

public class Yellow
extends Mod {
    public static YellowWeaponSwitch weaponSwitch = new YellowWeaponSwitch();
    public static WeaponInfoDialog weaponInfo = new WeaponInfoDialog();
    public static FoodDialog food;

    public Yellow() {
        String yellow = "yellow suse ballas ";
        for (int i = 0; i < 5; ++i) {
            yellow = yellow + yellow;
        }
        Log.info((Object)yellow);
        Events.run(EventType.ClientLoadEvent.class, () -> {
            weaponSwitch.build((Group)Vars.ui.hudGroup);
            food = new FoodDialog();
            YellowUtils.mobileHudButton((Drawable)Icon.add, () -> food.show(Vars.player.team()));
            YellowVars.load();
            YellowClassGateway ycg = new YellowClassGateway();
            ycg.load();
            YellowSettings.load();
            YellowUtils.startRequestLimitHandler();
            YellowAutoUpdater.start();
            Events.run((Object)EventType.Trigger.update, () -> FoodItem.instances.each(FoodItem::update));
        });
    }

    public static Mods.LoadedMod getSelf() {
        return Vars.mods.getMod("yellow-java");
    }

    public void loadContent() {
        YellowBullets.load();
        YellowWeapons.load();
        YellowUnitTypes.load();
        YellowStatusEffects.load();
        YellowPlanets.load();
        YellowBlocks.load();
        YellowItems.load();
        YellowWeapons.afterLoad();
        YellowUtils.mirror(new Weapon[]{YellowWeapons.meltdownBurstAttack, YellowWeapons.antiMothSpray, YellowWeapons.decimation, YellowWeapons.airstrikeFlareLauncher, YellowWeapons.ghostCall, YellowWeapons.ghostRain}, true, true, true, YellowUnitTypes.yellow);
    }
}

