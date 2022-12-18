// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy.arc.events;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import arc.Events;
import arc.func.Cons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 2, xi = 48, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0002`\u0005¢\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f" }, d2 = { "listen", "", "T", "cons", "Lkotlin/Function1;", "Lkotmindy/RunR;", "Lkotlin/ExtensionFunctionType;", "listenTrigger", "event", "", "Lkotlin/Function0;", "Lkotmindy/BlankRun;", "lib" })
public final class ArcEventUtilsKt
{
    public static final void listenTrigger(@NotNull final Object event, @NotNull final Function0<Unit> cons) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(cons, "cons");
        Events.run(event, ArcEventUtilsKt::listenTrigger$lambda$0);
    }
    
    private static final void listenTrigger$lambda$0(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke();
    }
}
