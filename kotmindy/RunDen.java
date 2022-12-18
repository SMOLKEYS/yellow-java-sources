// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy;

import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u00c6\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u00c6\u0003J\u0018\u0010\u0010\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005J1\u0010\u0012\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u00c6\u0001J\u0018\u0010\u0013\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R$\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u001b" }, d2 = { "Lkotmindy/RunDen;", "", "confirmed", "Lkotlin/Function0;", "", "Lkotmindy/BlankRun;", "denied", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getConfirmed", "()Lkotlin/jvm/functions/Function0;", "setConfirmed", "(Lkotlin/jvm/functions/Function0;)V", "getDenied", "setDenied", "component1", "component2", "confirm", "new", "copy", "deny", "equals", "", "other", "hashCode", "", "toString", "", "lib" })
public final class RunDen
{
    @NotNull
    private Function0<Unit> confirmed;
    @NotNull
    private Function0<Unit> denied;
    
    public RunDen(@NotNull final Function0<Unit> confirmed, @NotNull final Function0<Unit> denied) {
        Intrinsics.checkNotNullParameter(confirmed, "confirmed");
        Intrinsics.checkNotNullParameter(denied, "denied");
        this.confirmed = confirmed;
        this.denied = denied;
    }
    
    @NotNull
    public final Function0<Unit> getConfirmed() {
        return this.confirmed;
    }
    
    public final void setConfirmed(@NotNull final Function0<Unit> <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.confirmed = <set-?>;
    }
    
    @NotNull
    public final Function0<Unit> getDenied() {
        return this.denied;
    }
    
    public final void setDenied(@NotNull final Function0<Unit> <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.denied = <set-?>;
    }
    
    public final void confirm(@NotNull final Function0<Unit> new) {
        Intrinsics.checkNotNullParameter(new, "new");
        this.confirmed = new;
    }
    
    public final void deny(@NotNull final Function0<Unit> new) {
        Intrinsics.checkNotNullParameter(new, "new");
        this.denied = new;
    }
    
    @NotNull
    public final Function0<Unit> component1() {
        return this.confirmed;
    }
    
    @NotNull
    public final Function0<Unit> component2() {
        return this.denied;
    }
    
    @NotNull
    public final RunDen copy(@NotNull final Function0<Unit> confirmed, @NotNull final Function0<Unit> denied) {
        Intrinsics.checkNotNullParameter(confirmed, "confirmed");
        Intrinsics.checkNotNullParameter(denied, "denied");
        return new RunDen(confirmed, denied);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "RunDen(confirmed=" + this.confirmed + ", denied=" + this.denied + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.confirmed.hashCode();
        result = result * 31 + this.denied.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunDen)) {
            return false;
        }
        final RunDen runDen = (RunDen)other;
        return Intrinsics.areEqual(this.confirmed, runDen.confirmed) && Intrinsics.areEqual(this.denied, runDen.denied);
    }
}
