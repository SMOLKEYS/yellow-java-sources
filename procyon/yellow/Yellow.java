// 
// Decompiled by Procyon v0.6.0
// 

package yellow;

import arc.Core;
import mindustry.type.Weapon;
import yellow.game.YellowTeam;
import yellow.content.YellowSpells;
import yellow.content.YellowItems;
import yellow.content.YellowBlocks;
import yellow.content.YellowPlanets;
import yellow.content.YellowStatusEffects;
import yellow.content.YellowUnitTypes;
import yellow.weapons.YellowWeapons;
import yellow.content.YellowBullets;
import mindustry.mod.Mods;
import arc.Events;
import yellow.type.FoodItem;
import yellow.internal.YellowAutoUpdater;
import yellow.ui.YellowSettings;
import yellow.internal.YellowClassGateway;
import arc.scene.style.Drawable;
import yellow.internal.util.YellowUtils;
import mindustry.gen.Icon;
import arc.scene.Group;
import mindustry.Vars;
import mindustry.game.EventType;
import arc.util.Log;
import yellow.ui.buttons.dialogs.FoodDialog;
import yellow.ui.buttons.dialogs.WeaponInfoDialog;
import yellow.ui.buttons.YellowWeaponSwitch;
import mindustry.mod.Mod;

public class Yellow extends Mod
{
    public static YellowWeaponSwitch weaponSwitch;
    public static WeaponInfoDialog weaponInfo;
    public static FoodDialog food;
    
    public Yellow() {
        String yellow = "yellow suse ballas ";
        for (int i = 0; i < 5; ++i) {
            yellow += yellow;
        }
        Log.info((Object)yellow);
        Events.run((Object)EventType.ClientLoadEvent.class, () -> {
            Yellow.weaponSwitch.build((Group)Vars.ui.hudGroup);
            Yellow.weaponInfo = new WeaponInfoDialog();
            Yellow.food = new FoodDialog();
            YellowUtils.mobileHudButton((Drawable)Icon.add, () -> Yellow.food.show(Vars.player.team()));
            YellowVars.load();
            final YellowClassGateway ycg = new YellowClassGateway();
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
        try {
            YellowBullets.load();
            YellowWeapons.load();
            YellowUnitTypes.load();
            YellowStatusEffects.load();
            YellowPlanets.load();
            YellowBlocks.load();
            YellowItems.load();
            YellowSpells.load();
            YellowTeam.load();
            YellowWeapons.afterLoad();
            YellowUtils.mirror(new Weapon[] { YellowWeapons.meltdownBurstAttack, YellowWeapons.antiMothSpray, YellowWeapons.decimation, YellowWeapons.airstrikeFlareLauncher, YellowWeapons.ghostCall, YellowWeapons.ghostRain, YellowWeapons.dualSpeedEngine }, true, true, true, YellowUnitTypes.yellow);
        }
        catch (final Exception e) {
            Events.run((Object)EventType.ClientLoadEvent.class, () -> Vars.ui.showCustomConfirm("[red]FATAL LOAD ERROR[]", "An error was thrown while content was being loaded from Yellow.\nClosing the game is heavily recommended.", "Close", "Keep Playing", () -> Core.app.exit(), () -> {}));
        }
    }
    
    static {
        Yellow.weaponSwitch = new YellowWeaponSwitch();
    }
}
