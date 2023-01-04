// 
// Decompiled by Procyon v0.6.0
// 

package yellow.internal;

import java.util.Iterator;
import java.util.List;
import rhino.Scriptable;
import rhino.NativeJavaPackage;
import yellow.internal.util.YellowUtils;
import rhino.ImporterTopLevel;
import kotlin.jvm.internal.Intrinsics;
import mindustry.Vars;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.Metadata;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lyellow/internal/YellowClassGateway;", "", "()V", "uniGateErrors", "", "uniGateImports", "load", "", "yellow-java" })
@SourceDebugExtension({ "SMAP\nYellowClassGateway.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YellowClassGateway.kt\nyellow/internal/YellowClassGateway\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 YellowClassGateway.kt\nyellow/internal/YellowClassGateway\n*L\n20#1:90,2\n*E\n" })
public class YellowClassGateway
{
    private int uniGateImports;
    private int uniGateErrors;
    
    public final void load() {
        Object scope = null;
        final Scriptable scope2 = Vars.mods.getScripts().scope;
        Intrinsics.checkNotNull(scope2, "null cannot be cast to non-null type rhino.ImporterTopLevel");
        scope = scope2;
        final String string = Vars.tree.get("classpaths/yellow-classpath.txt").readString();
        Intrinsics.checkNotNullExpressionValue(string, "tree.get(\"classpaths/yel\u2026sspath.txt\").readString()");
        final List packages = StringsKt__StringsKt.split$default(string, new char[] { '\n' }, false, 0, 6, null);
        YellowUtils.controlledLog("[yellow]--------STARTING GATEWAY--------[]");
        YellowUtils.controlledLog("Scope: " + scope + ", Generator: " + this + ", Class Loader: " + Vars.mods.mainLoader());
        final Iterable $this$forEach$iv = (Iterable)packages;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final String it = (String)element$iv;
            final int n = 0;
            final NativeJavaPackage p = new NativeJavaPackage(it, Vars.mods.mainLoader());
            YellowUtils.controlledLog("importing classes from " + it + "...");
            p.setParentScope((Scriptable)scope);
            ((ImporterTopLevel)scope).importPackage(p);
        }
        YellowUtils.controlledLog("[green]--------GATEWAY STARTED!--------[]");
    }
}
