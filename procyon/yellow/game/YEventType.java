// 
// Decompiled by Procyon v0.6.0
// 

package yellow.game;

import mindustry.gen.Unit;

public class YEventType
{
    public static class DeathInvalidationEvent
    {
        public final Unit defier;
        
        public DeathInvalidationEvent(final Unit defier) {
            this.defier = defier;
        }
    }
}
