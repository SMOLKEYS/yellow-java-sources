// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.effect;

import mindustry.entities.Effect$EffectContainer;
import kotlin.random.Random;
import org.jetbrains.annotations.Nullable;
import arc.graphics.Color;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import mindustry.entities.Effect;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001¢\u0006\u0002\u0010\u0004J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R$\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013" }, d2 = { "Lyellow/entities/effect/RandomEffect;", "Lmindustry/entities/Effect;", "effects", "", "([Lmindustry/entities/Effect;)V", "getEffects", "()[Lmindustry/entities/Effect;", "setEffects", "[Lmindustry/entities/Effect;", "create", "", "x", "", "y", "rotation", "color", "Larc/graphics/Color;", "data", "", "yellow-java" })
public class RandomEffect extends Effect
{
    @NotNull
    private Effect[] effects;
    
    public RandomEffect(@NotNull final Effect... effects) {
        Intrinsics.checkNotNullParameter(effects, "effects");
        super(0.0f, RandomEffect::_init_$lambda$0);
        this.effects = effects;
    }
    
    @NotNull
    public final Effect[] getEffects() {
        return this.effects;
    }
    
    public final void setEffects(@NotNull final Effect[] <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.effects = <set-?>;
    }
    
    public void create(final float x, final float y, final float rotation, @NotNull final Color color, @Nullable final Object data) {
        Intrinsics.checkNotNullParameter(color, "color");
        if (!this.shouldCreate()) {
            return;
        }
        ((Effect)ArraysKt___ArraysKt.random(this.effects, Random.Default)).create(x, y, rotation, color, data);
    }
    
    private static final void _init_$lambda$0(final Effect$EffectContainer it) {
    }
}
