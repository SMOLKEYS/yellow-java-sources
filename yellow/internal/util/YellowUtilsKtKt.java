// 
// Decompiled by Procyon v0.6.0
// 

package yellow.internal.util;

import yellow.type.FoodItem;
import arc.scene.Element;
import arc.scene.event.Touchable;
import arc.scene.ui.layout.Table;
import java.util.Arrays;
import arc.struct.Seq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import mindustry.gen.Unit;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 2, xi = 48, d1 = { "\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u000b*\u00060\fj\u0002`\r\u001a\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086\u0004\u001a\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0004\u001a\u001a\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018" }, d2 = { "seqOf", "Larc/struct/Seq;", "T", "items", "", "([Ljava/lang/Object;)Larc/struct/Seq;", "typiis", "", "item", "Lyellow/type/FoodItem;", "healthFract", "", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "ins", "", "other", "", "touchableOf", "", "Larc/scene/ui/layout/Table;", "index", "touchable", "Larc/scene/event/Touchable;", "yellow-java" })
public final class YellowUtilsKtKt
{
    public static final float healthFract(@NotNull final Unit $this$healthFract) {
        Intrinsics.checkNotNullParameter($this$healthFract, "<this>");
        return $this$healthFract.health / $this$healthFract.type.health;
    }
    
    public static final boolean ins(final int $this$ins, final int other) {
        return $this$ins % other == 0;
    }
    
    public static final boolean ins(final float $this$ins, final float other) {
        return $this$ins % other == 0.0f;
    }
    
    @NotNull
    public static final <T> Seq<T> seqOf(@NotNull final T... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.length == 0) {
            final Seq with = Seq.with(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(with, "with()");
            return (Seq<T>)with;
        }
        final Seq with2 = Seq.with((Object[])Arrays.copyOf(items, items.length));
        Intrinsics.checkNotNullExpressionValue(with2, "with(*items)");
        return (Seq<T>)with2;
    }
    
    public static final void touchableOf(@NotNull final Table $this$touchableOf, final int index, @NotNull final Touchable touchable) {
        Intrinsics.checkNotNullParameter($this$touchableOf, "<this>");
        Intrinsics.checkNotNullParameter(touchable, "touchable");
        ((Element)$this$touchableOf.getChildren().get(index)).touchable = touchable;
    }
    
    @NotNull
    public static final String typiis(@NotNull final FoodItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        final StringBuilder $this$typiis_u24lambda_u240;
        final StringBuilder sb = $this$typiis_u24lambda_u240 = new StringBuilder();
        final int n = 0;
        if (item.healUsingPercentage) {
            $this$typiis_u24lambda_u240.append(new StringBuilder().append('+').append((int)(item.healingPercent * 100.0f)).append("% HP").toString());
        }
        else {
            $this$typiis_u24lambda_u240.append(new StringBuilder().append('+').append(item.healing).append(" HP").toString());
        }
        if (item.healAllAllies) {
            $this$typiis_u24lambda_u240.append(" (Team)");
        }
        else {
            $this$typiis_u24lambda_u240.append(" (Single)");
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
