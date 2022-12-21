/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.ApplicationListener
 *  arc.Core
 *  mindustry.mod.Mods$ModMeta
 */
package yellow;

import arc.ApplicationListener;
import arc.Core;
import mindustry.mod.Mods;
import yellow.Yellow;
import yellow.YellowPermVars;
import yellow.internal.MetaChaos;
import yellow.internal.util.YellowUtils;

public class YellowVars {
    public static Mods.ModMeta meta;

    public static void load() {
        meta = Yellow.getSelf().meta;
        MetaChaos.load();
        YellowVars.meta.subtitle = (String)MetaChaos.getSubtitles().random();
        YellowVars.meta.description = (String)MetaChaos.getDescriptions().random();
        YellowUtils.loop(1.0f, () -> {
            YellowVars.meta.subtitle = (String)MetaChaos.getSubtitles().random();
            YellowVars.meta.description = (String)MetaChaos.getDescriptions().random();
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

