/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  mindustry.entities.Effect
 *  mindustry.entities.Effect$EffectContainer
 */
package yellow.entities.effect;

import arc.graphics.Color;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import mindustry.entities.Effect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001\u00a2\u0006\u0002\u0010\u0004J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R$\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0013"}, d2={"Lyellow/entities/effect/RandomEffect;", "Lmindustry/entities/Effect;", "effects", "", "([Lmindustry/entities/Effect;)V", "getEffects", "()[Lmindustry/entities/Effect;", "setEffects", "[Lmindustry/entities/Effect;", "create", "", "x", "", "y", "rotation", "color", "Larc/graphics/Color;", "data", "", "yellow-java"})
public class RandomEffect
extends Effect {
    @NotNull
    private Effect[] effects;

    public RandomEffect(Effect ... effects) {
        Intrinsics.checkNotNullParameter(effects, "effects");
        super(0.0f, RandomEffect::_init_$lambda$0);
        this.effects = effects;
    }

    @NotNull
    public final Effect[] getEffects() {
        return this.effects;
    }

    public final void setEffects(@NotNull Effect[] effectArray) {
        Intrinsics.checkNotNullParameter(effectArray, "<set-?>");
        this.effects = effectArray;
    }

    public void create(float x, float y, float rotation, @NotNull Color color, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(color, "color");
        if (!this.shouldCreate()) {
            return;
        }
        ArraysKt.random(this.effects, (Random)Random.Default).create(x, y, rotation, color, data);
    }

    private static final void _init_$lambda$0(Effect.EffectContainer it) {
    }
}

