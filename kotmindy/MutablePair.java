// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00028\u0000H\u00c6\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00028\u0001H\u00c6\u0003¢\u0006\u0002\u0010\bJ.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001H\u00c6\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001c\u0010\u0004\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u00028\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019" }, d2 = { "Lkotmindy/MutablePair;", "A", "B", "", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "setFirst", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getSecond", "setSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotmindy/MutablePair;", "equals", "", "other", "hashCode", "", "toString", "", "lib" })
public final class MutablePair<A, B>
{
    private A first;
    private B second;
    
    public MutablePair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }
    
    public final A getFirst() {
        return this.first;
    }
    
    public final void setFirst(final A <set-?>) {
        this.first = <set-?>;
    }
    
    public final B getSecond() {
        return this.second;
    }
    
    public final void setSecond(final B <set-?>) {
        this.second = <set-?>;
    }
    
    public final A component1() {
        return this.first;
    }
    
    public final B component2() {
        return this.second;
    }
    
    @NotNull
    public final MutablePair<A, B> copy(final A first, final B second) {
        return new MutablePair<A, B>(first, second);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "MutablePair(first=" + this.first + ", second=" + this.second + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.first == null) ? 0 : this.first.hashCode();
        result = result * 31 + ((this.second == null) ? 0 : this.second.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutablePair)) {
            return false;
        }
        final MutablePair mutablePair = (MutablePair)other;
        return Intrinsics.areEqual(this.first, mutablePair.first) && Intrinsics.areEqual(this.second, mutablePair.second);
    }
}
