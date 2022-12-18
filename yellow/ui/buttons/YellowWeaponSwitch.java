// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ui.buttons;

import arc.scene.ui.layout.Table;
import arc.scene.style.Drawable;
import mindustry.ui.Styles;
import mindustry.gen.Tex;
import arc.scene.ui.ImageButton;
import yellow.internal.util.YellowUtils;
import yellow.content.YellowUnitTypes;
import mindustry.Vars;
import arc.Core;
import arc.scene.Group;
import yellow.ui.buttons.dialogs.YellowWeaponSwitchDialog;

public class YellowWeaponSwitch
{
    private static final float width = 150.0f;
    private static final float padding = 4.0f;
    private static final float isize = 48.0f;
    private YellowWeaponSwitchDialog dialog;
    
    public void build(final Group parent) {
        final Drawable icon = Core.atlas.drawable("status-disarmed");
        this.dialog = new YellowWeaponSwitchDialog();
        if (Vars.mobile) {
            YellowUtils.mobileHudButton(icon, () -> {
                if (Vars.player.unit().type == YellowUnitTypes.yellow) {
                    this.dialog.show(Vars.player.unit().mounts);
                }
            });
        }
        else {
            final ImageButton.ImageButtonStyle style = new ImageButton.ImageButtonStyle() {
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
