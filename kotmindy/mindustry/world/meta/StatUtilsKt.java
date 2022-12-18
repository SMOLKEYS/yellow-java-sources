// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy.mindustry.world.meta;

import mindustry.type.ItemStack;
import mindustry.type.Item;
import mindustry.world.meta.StatValues;
import kotlin.jvm.internal.Intrinsics;
import mindustry.world.meta.StatUnit;
import mindustry.world.meta.Stat;
import org.jetbrains.annotations.NotNull;
import mindustry.world.meta.Stats;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 2, xi = 48, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u001a\u001a\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007¨\u0006\r" }, d2 = { "replace", "", "Lmindustry/world/meta/Stats;", "stat", "Lmindustry/world/meta/Stat;", "value", "", "", "statUnit", "Lmindustry/world/meta/StatUnit;", "item", "Lmindustry/type/Item;", "replacePercent", "lib" })
public final class StatUtilsKt
{
    public static final void replace(@NotNull final Stats $this$replace, @NotNull final Stat stat, final float value, @NotNull final StatUnit statUnit) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(stat, "stat");
        Intrinsics.checkNotNullParameter(statUnit, "statUnit");
        $this$replace.remove(stat);
        $this$replace.add(stat, StatValues.number(value, statUnit));
    }
    
    public static final void replace(@NotNull final Stats $this$replace, @NotNull final Stat stat, final float value) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(stat, "stat");
        $this$replace.remove(stat);
        $this$replace.add(stat, value);
    }
    
    public static final void replacePercent(@NotNull final Stats $this$replacePercent, @NotNull final Stat stat, final float value) {
        Intrinsics.checkNotNullParameter($this$replacePercent, "<this>");
        Intrinsics.checkNotNullParameter(stat, "stat");
        $this$replacePercent.remove(stat);
        $this$replacePercent.add(stat, StatValues.number(value * 100.0f, StatUnit.percent));
    }
    
    public static final void replace(@NotNull final Stats $this$replace, @NotNull final Stat stat, final boolean value) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(stat, "stat");
        $this$replace.remove(stat);
        $this$replace.add(stat, StatValues.bool(value));
    }
    
    public static final void replace(@NotNull final Stats $this$replace, @NotNull final Stat stat, @NotNull final Item item) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(stat, "stat");
        Intrinsics.checkNotNullParameter(item, "item");
        $this$replace.remove(stat);
        $this$replace.add(stat, StatValues.items(new ItemStack[] { new ItemStack(item, 1) }));
    }
}
