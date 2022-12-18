// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy.arc;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import arc.struct.Seq;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 2, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "seqOf", "Larc/struct/Seq;", "T", "elements", "", "([Ljava/lang/Object;)Larc/struct/Seq;", "lib" })
public final class ArcOfTypesKt
{
    @NotNull
    public static final <T> Seq<T> seqOf(@NotNull final T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            final Seq with = Seq.with(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(with, "with()");
            return (Seq<T>)with;
        }
        final Seq with2 = Seq.with((Object[])Arrays.copyOf(elements, elements.length));
        Intrinsics.checkNotNullExpressionValue(with2, "with(*elements)");
        return (Seq<T>)with2;
    }
}
