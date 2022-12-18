/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.ApplicationListener
 *  arc.Core
 *  mindustry.Vars
 *  mindustry.mod.Mods$ModMeta
 */
package yellow;

import arc.ApplicationListener;
import arc.Core;
import mindustry.Vars;
import mindustry.mod.Mods;
import yellow.Yellow;
import yellow.YellowPermVars;
import yellow.internal.MetaChaos;
import yellow.internal.util.YellowUtils;

public class YellowVars {
    public static Mods.ModMeta meta;

    public static void load() {
        meta = Vars.mods.getMod((String)"yellow-java").meta;
        MetaChaos locs = new MetaChaos();
        YellowVars.meta.subtitle = (String)locs.getSubtitles().random();
        YellowVars.meta.description = (String)locs.getDescriptions().random();
        YellowUtils.loop(1.0f, () -> {
            YellowVars.meta.subtitle = (String)locs.getSubtitles().random();
            YellowVars.meta.description = (String)locs.getDescriptions().random();
        });
        if (YellowPermVars.INSTANCE.getTemporary()) {
            Core.app.addListener(new ApplicationListener(){

                public void exit() {
                    Yellow.getSelf().file.delete();
                }
            });
        }
    }
}

