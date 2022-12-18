// 
// Decompiled by Procyon v0.6.0
// 

package yellow;

import arc.ApplicationListener;
import arc.Core;
import yellow.internal.util.YellowUtils;
import yellow.internal.MetaChaos;
import mindustry.Vars;
import mindustry.mod.Mods;

public class YellowVars
{
    public static Mods.ModMeta meta;
    
    public static void load() {
        YellowVars.meta = Vars.mods.getMod("yellow-java").meta;
        final MetaChaos locs = new MetaChaos();
        YellowVars.meta.subtitle = (String)locs.getSubtitles().random();
        YellowVars.meta.description = (String)locs.getDescriptions().random();
        YellowUtils.loop(1.0f, () -> {
            YellowVars.meta.subtitle = (String)locs.getSubtitles().random();
            YellowVars.meta.description = (String)locs.getDescriptions().random();
            return;
        });
        if (YellowPermVars.INSTANCE.getTemporary()) {
            Core.app.addListener((ApplicationListener)new ApplicationListener() {
                public void exit() {
                    Yellow.getSelf().file.delete();
                }
            });
        }
    }
}
