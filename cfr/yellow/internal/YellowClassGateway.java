/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.Vars
 *  rhino.ImporterTopLevel
 *  rhino.NativeJavaPackage
 *  rhino.Scriptable
 */
package yellow.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mindustry.Vars;
import rhino.ImporterTopLevel;
import rhino.NativeJavaPackage;
import rhino.Scriptable;
import yellow.internal.util.YellowUtils;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lyellow/internal/YellowClassGateway;", "", "()V", "uniGateErrors", "", "uniGateImports", "load", "", "yellow-java"})
public class YellowClassGateway {
    private int uniGateImports;
    private int uniGateErrors;

    public final void load() {
        ImporterTopLevel scope = null;
        Scriptable scriptable = Vars.mods.getScripts().scope;
        Intrinsics.checkNotNull(scriptable, "null cannot be cast to non-null type rhino.ImporterTopLevel");
        scope = (ImporterTopLevel)scriptable;
        String string = Vars.tree.get("classpaths/yellow-classpath.txt").readString();
        Intrinsics.checkNotNullExpressionValue(string, "tree.get(\"classpaths/yel\u2026sspath.txt\").readString()");
        char[] cArray = new char[]{'\n'};
        List packages = StringsKt.split$default((CharSequence)string, cArray, false, 0, 6, null);
        YellowUtils.controlledLog("[yellow]--------STARTING GATEWAY--------[]");
        YellowUtils.controlledLog("Scope: " + scope + ", Generator: " + this + ", Class Loader: " + Vars.mods.mainLoader());
        Iterable $this$forEach$iv = packages;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            String it = (String)element$iv;
            boolean bl = false;
            NativeJavaPackage p = new NativeJavaPackage(it, Vars.mods.mainLoader());
            YellowUtils.controlledLog("importing classes from " + it + "...");
            p.setParentScope((Scriptable)scope);
            scope.importPackage(p);
        }
        YellowUtils.controlledLog("[green]--------GATEWAY STARTED!--------[]");
    }
}

