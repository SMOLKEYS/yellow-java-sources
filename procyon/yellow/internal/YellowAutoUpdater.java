// 
// Decompiled by Procyon v0.6.0
// 

package yellow.internal;

import arc.Core;
import arc.util.Log;
import kotlin.Unit;
import kotmindy.mindustry.ui.QuickUIKt;
import kotlin.jvm.functions.Function0;
import yellow.internal.util.YellowUtils;
import yellow.Yellow;
import kotlin.jvm.JvmStatic;
import arc.util.Http;
import kotlin.jvm.internal.Intrinsics;
import arc.util.serialization.JsonReader;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lyellow/internal/YellowAutoUpdater;", "", "()V", "jsr", "Larc/util/serialization/JsonReader;", "getJsr", "()Larc/util/serialization/JsonReader;", "vtype", "", "getVtype", "()Ljava/lang/String;", "start", "", "yellow-java" })
public final class YellowAutoUpdater
{
    @NotNull
    public static final YellowAutoUpdater INSTANCE;
    @NotNull
    private static final String vtype;
    @NotNull
    private static final JsonReader jsr;
    
    private YellowAutoUpdater() {
    }
    
    @NotNull
    public final String getVtype() {
        return YellowAutoUpdater.vtype;
    }
    
    @NotNull
    public final JsonReader getJsr() {
        return YellowAutoUpdater.jsr;
    }
    
    @JvmStatic
    public static final void start() {
        final YellowAutoUpdater instance = YellowAutoUpdater.INSTANCE;
        final String vtype = YellowAutoUpdater.vtype;
        if (Intrinsics.areEqual(vtype, "release")) {
            Http.get("https://api.github.com/repos/SMOLKEYS/yellow-java/releases", YellowAutoUpdater::start$lambda$0, YellowAutoUpdater::start$lambda$2);
        }
        else if (Intrinsics.areEqual(vtype, "bleeding-edge")) {
            Http.get("https://api.github.com/repos/SMOLKEYS/yellow-java-builds/releases", YellowAutoUpdater::start$lambda$3, YellowAutoUpdater::start$lambda$5);
        }
    }
    
    private static final void start$lambda$0(final Http.HttpResponse it) {
        final String res = it.getResultAsString();
        try {
            final YellowAutoUpdater instance = YellowAutoUpdater.INSTANCE;
            final String string = YellowAutoUpdater.jsr.parse(res).get(0).get("tag_name").asString();
            Intrinsics.checkNotNullExpressionValue(string, "jsr.parse(res)[0][\"tag_name\"].asString()");
            final String version = StringsKt__StringsJVMKt.replace$default(string, "v", "", false, 4, null);
            final float kr = (StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(version) != null) ? Float.parseFloat(version) : 0.0f;
            final String version2 = Yellow.getSelf().meta.version;
            Intrinsics.checkNotNullExpressionValue(version2, "getSelf().meta.version");
            final String rk = StringsKt__StringsJVMKt.replace$default(version2, "v", "", false, 4, null);
            final float krk = (StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(rk) != null) ? Float.parseFloat(rk) : 99999.99f;
            YellowUtils.controlledLog(version);
            YellowUtils.controlledLog(String.valueOf(kr));
            if (kr > krk) {
                QuickUIKt.showTitledConfirm("New yellow-java release!", "Update now?", (Function0<Unit>)YellowAutoUpdater$start$1.YellowAutoUpdater$start$1$1.INSTANCE);
            }
        }
        catch (final Exception e) {
            Log.err((Throwable)e);
        }
    }
    
    private static final void start$lambda$2$lambda$1(final Throwable $it) {
        $it.printStackTrace();
        Log.err($it);
    }
    
    private static final void start$lambda$2(final Throwable it) {
        Core.app.post(YellowAutoUpdater::start$lambda$2$lambda$1);
    }
    
    private static final void start$lambda$3(final Http.HttpResponse it) {
        final String res = it.getResultAsString();
        try {
            final YellowAutoUpdater instance = YellowAutoUpdater.INSTANCE;
            final String version = YellowAutoUpdater.jsr.parse(res).get(0).get("tag_name").asString();
            Intrinsics.checkNotNullExpressionValue(version, "version");
            final int kr = (StringsKt__StringNumberConversionsKt.toIntOrNull(version) != null) ? Integer.parseInt(version) : 0;
            final String rk = Yellow.getSelf().meta.version;
            Intrinsics.checkNotNullExpressionValue(rk, "rk");
            final int krk = (StringsKt__StringNumberConversionsKt.toIntOrNull(rk) != null) ? Integer.parseInt(rk) : 999999;
            YellowUtils.controlledLog(version);
            YellowUtils.controlledLog(String.valueOf(kr));
            if (kr > krk) {
                QuickUIKt.showTitledConfirm("Update", "Found a new bleeding edge version for Yellow.\nUpdate now? (current: " + krk + ", new: " + kr + ')', (Function0<Unit>)YellowAutoUpdater$start$3.YellowAutoUpdater$start$3$1.INSTANCE);
            }
        }
        catch (final Exception e) {
            Log.err((Throwable)e);
        }
    }
    
    private static final void start$lambda$5$lambda$4(final Throwable $it) {
        $it.printStackTrace();
        Log.err($it);
    }
    
    private static final void start$lambda$5(final Throwable it) {
        Core.app.post(YellowAutoUpdater::start$lambda$5$lambda$4);
    }
    
    static {
        INSTANCE = new YellowAutoUpdater();
        final String version = Yellow.getSelf().meta.version;
        Intrinsics.checkNotNullExpressionValue(version, "getSelf().meta.version");
        vtype = (StringsKt__StringsKt.contains$default(version, ".", false, 2, null) ? "release" : "bleeding-edge");
        jsr = new JsonReader();
    }
}
