/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.scene.Group
 *  arc.scene.style.Drawable
 *  arc.scene.ui.ImageButton$ImageButtonStyle
 *  mindustry.Vars
 *  mindustry.gen.Tex
 *  mindustry.ui.Styles
 */
package yellow.ui.buttons;

import arc.Core;
import arc.scene.Group;
import arc.scene.style.Drawable;
import arc.scene.ui.ImageButton;
import mindustry.Vars;
import mindustry.gen.Tex;
import mindustry.ui.Styles;
import yellow.content.YellowUnitTypes;
import yellow.internal.util.YellowUtils;
import yellow.ui.buttons.dialogs.YellowWeaponSwitchDialog;

public class YellowWeaponSwitch {
    private static final float width = 150.0f;
    private static final float padding = 4.0f;
    private static final float isize = 48.0f;
    private YellowWeaponSwitchDialog dialog;

    public void build(Group parent) {
        Drawable icon = Core.atlas.drawable("status-disarmed");
        this.dialog = new YellowWeaponSwitchDialog();
        if (Vars.mobile) {
            YellowUtils.mobileHudButton(icon, () -> {
                if (Vars.player.unit().type == YellowUnitTypes.yellow) {
                    this.dialog.show(Vars.player.unit().mounts);
                }
            });
        } else {
            ImageButton.ImageButtonStyle style = new ImageButton.ImageButtonStyle(){
                {
                    this.up = Tex.pane;
                    this.down = Styles.flatDown;
                    this.over = Styles.flatOver;
                }
            };
            parent.fill(cont -> {
                cont.name = "weapons switch";
                cont.defaults().size(75.0f);
                cont.top().right();
                cont.marginRight(146.0f);
                cont.button(icon, style, 48.0f, () -> this.dialog.show(Vars.player.unit().mounts));
                cont.visible(() -> Vars.player.unit().type == YellowUnitTypes.yellow);
            });
        }
    }
}

