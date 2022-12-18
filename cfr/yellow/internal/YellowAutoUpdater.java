/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.util.Http
 *  arc.util.Http$HttpResponse
 *  arc.util.Log
 *  arc.util.serialization.JsonReader
 */
package yellow.internal;

import arc.Core;
import arc.util.Http;
import arc.util.Log;
import arc.util.serialization.JsonReader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotmindy.mindustry.ui.QuickUIKt;
import org.jetbrains.annotations.NotNull;
import yellow.Yellow;
import yellow.internal.YellowAutoUpdater;
import yellow.internal.util.YellowUtils;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2={"Lyellow/internal/YellowAutoUpdater;", "", "()V", "jsr", "Larc/util/serialization/JsonReader;", "getJsr", "()Larc/util/serialization/JsonReader;", "vtype", "", "getVtype", "()Ljava/lang/String;", "start", "", "yellow-java"})
public final class YellowAutoUpdater {
    @NotNull
    public static final YellowAutoUpdater INSTANCE = new YellowAutoUpdater();
    @NotNull
    private static final String vtype;
    @NotNull
    private static final JsonReader jsr;

    private YellowAutoUpdater() {
    }

    @NotNull
    public final String getVtype() {
        return vtype;
    }

    @NotNull
    public final JsonReader getJsr() {
        return jsr;
    }

    @JvmStatic
    public static final void start() {
        String string = vtype;
        if (Intrinsics.areEqual(string, "release")) {
            Http.get((String)"https://api.github.com/repos/SMOLKEYS/yellow-java/releases", YellowAutoUpdater::start$lambda$0, YellowAutoUpdater::start$lambda$2);
        } else if (Intrinsics.areEqual(string, "bleeding-edge")) {
            Http.get((String)"https://api.github.com/repos/SMOLKEYS/yellow-java-builds/releases", YellowAutoUpdater::start$lambda$3, YellowAutoUpdater::start$lambda$5);
        }
    }

    private static final void start$lambda$0(Http.HttpResponse it) {
        String res = it.getResultAsString();
        try {
            String string = jsr.parse(res).get(0).get("tag_name").asString();
            Intrinsics.checkNotNullExpressionValue(string, "jsr.parse(res)[0][\"tag_name\"].asString()");
            String version = StringsKt.replace$default(string, "v", "", false, 4, null);
            float kr = StringsKt.toFloatOrNull(version) != null ? Float.parseFloat(version) : 0.0f;
            String string2 = Yellow.getSelf().meta.version;
            Intrinsics.checkNotNullExpressionValue(string2, "getSelf().meta.version");
            String rk = StringsKt.replace$default(string2, "v", "", false, 4, null);
            float krk = StringsKt.toFloatOrNull(rk) != null ? Float.parseFloat(rk) : 99999.99f;
            YellowUtils.controlledLog(version);
            YellowUtils.controlledLog(String.valueOf(kr));
            if (kr > krk) {
                QuickUIKt.showTitledConfirm("New yellow-java release!", "Update now?", start.1.1.INSTANCE);
            }
        }
        catch (Exception e) {
            Log.err((Throwable)e);
        }
    }

    private static final void start$lambda$2$lambda$1(Throwable $it) {
        $it.printStackTrace();
        Log.err((Throwable)$it);
    }

    private static final void start$lambda$2(Throwable it) {
        Core.app.post(() -> YellowAutoUpdater.start$lambda$2$lambda$1(it));
    }

    private static final void start$lambda$3(Http.HttpResponse it) {
        String res = it.getResultAsString();
        try {
            String version = jsr.parse(res).get(0).get("tag_name").asString();
            Intrinsics.checkNotNullExpressionValue(version, "version");
            int kr = StringsKt.toIntOrNull(version) != null ? Integer.parseInt(version) : 0;
            String rk = Yellow.getSelf().meta.version;
            Intrinsics.checkNotNullExpressionValue(rk, "rk");
            int krk = StringsKt.toIntOrNull(rk) != null ? Integer.parseInt(rk) : 999999;
            YellowUtils.controlledLog(version);
            YellowUtils.controlledLog(String.valueOf(kr));
            if (kr > krk) {
                QuickUIKt.showTitledConfirm("Update", "Found a new bleeding edge version for Yellow.\nUpdate now? (current: " + krk + ", new: " + kr + ')', start.3.1.INSTANCE);
            }
        }
        catch (Exception e) {
            Log.err((Throwable)e);
        }
    }

    private static final void start$lambda$5$lambda$4(Throwable $it) {
        $it.printStackTrace();
        Log.err((Throwable)$it);
    }

    private static final void start$lambda$5(Throwable it) {
        Core.app.post(() -> YellowAutoUpdater.start$lambda$5$lambda$4(it));
    }

    static {
        String string = Yellow.getSelf().meta.version;
        Intrinsics.checkNotNullExpressionValue(string, "getSelf().meta.version");
        vtype = StringsKt.contains$default((CharSequence)string, ".", false, 2, null) ? "release" : "bleeding-edge";
        jsr = new JsonReader();
    }
}

