// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy.mindustry.ui;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import mindustry.Vars;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import kotmindy.RunDen;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 2, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aN\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00030\nj\u0002`\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00030\nj\u0002`\u000b\u001aC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0002\b\u000f\u001a\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00030\nj\u0002`\u000b\u001a\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014\u001a\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00030\nj\u0002`\u000b\u001a*\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00030\nj\u0002`\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018" }, d2 = { "pair", "Lkotmindy/RunDen;", "customConfirm", "", "title", "", "text", "yes", "no", "confirmed", "Lkotlin/Function0;", "Lkotmindy/BlankRun;", "denied", "oncall", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "showConfirm", "showError", "showException", "source", "", "showInfo", "exit", "showTitledConfirm", "lib" })
public final class QuickUIKt
{
    @NotNull
    private static final RunDen pair;
    
    public static final void showInfo(@NotNull final String text, @NotNull final Function0<Unit> exit) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Vars.ui.showInfoOnHidden(text, QuickUIKt::showInfo$lambda$0);
    }
    
    public static final void showError(@NotNull final String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Vars.ui.showErrorMessage(text);
    }
    
    public static final void showException(@Nullable final String text, @NotNull final Throwable source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (text != null) {
            Vars.ui.showException(text, source);
        }
        else {
            Vars.ui.showException(source);
        }
    }
    
    public static final void showConfirm(@NotNull final String text, @NotNull final Function0<Unit> confirmed) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(confirmed, "confirmed");
        Vars.ui.showConfirm(text, QuickUIKt::showConfirm$lambda$1);
    }
    
    public static final void showTitledConfirm(@NotNull final String title, @NotNull final String text, @NotNull final Function0<Unit> confirmed) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(confirmed, "confirmed");
        Vars.ui.showConfirm(title, text, QuickUIKt::showTitledConfirm$lambda$2);
    }
    
    public static final void customConfirm(@NotNull final String title, @NotNull final String text, @NotNull final String yes, @NotNull final String no, @NotNull final Function0<Unit> confirmed, @NotNull final Function0<Unit> denied) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(yes, "yes");
        Intrinsics.checkNotNullParameter(no, "no");
        Intrinsics.checkNotNullParameter(confirmed, "confirmed");
        Intrinsics.checkNotNullParameter(denied, "denied");
        Vars.ui.showCustomConfirm(title, text, yes, no, QuickUIKt::customConfirm$lambda$3, QuickUIKt::customConfirm$lambda$4);
    }
    
    public static final void customConfirm(@NotNull final String title, @NotNull final String text, @NotNull final String yes, @NotNull final String no, @NotNull final Function1<? super RunDen, Unit> oncall) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(yes, "yes");
        Intrinsics.checkNotNullParameter(no, "no");
        Intrinsics.checkNotNullParameter(oncall, "oncall");
        QuickUIKt.pair.setConfirmed((Function0<Unit>)QuickUIKt$customConfirm.QuickUIKt$customConfirm$1.INSTANCE);
        QuickUIKt.pair.setDenied((Function0<Unit>)QuickUIKt$customConfirm.QuickUIKt$customConfirm$2.INSTANCE);
        oncall.invoke(QuickUIKt.pair);
        final RunDen pair = QuickUIKt.pair;
        final Function0 conf = pair.component1();
        final Function0 deny = pair.component2();
        customConfirm(title, text, yes, no, conf, deny);
    }
    
    private static final void showInfo$lambda$0(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke();
    }
    
    private static final void showConfirm$lambda$1(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke();
    }
    
    private static final void showTitledConfirm$lambda$2(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke();
    }
    
    private static final void customConfirm$lambda$3(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke();
    }
    
    private static final void customConfirm$lambda$4(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        $tmp0.invoke();
    }
    
    static {
        pair = new RunDen(QuickUIKt$pair.QuickUIKt$pair$1.INSTANCE, (Function0<Unit>)QuickUIKt$pair.QuickUIKt$pair$2.INSTANCE);
    }
}
