/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.files.Fi
 *  arc.struct.Seq
 *  mindustry.Vars
 *  mindustry.mod.Mods$ModMeta
 */
package yellow.internal;

import arc.files.Fi;
import arc.struct.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mindustry.Vars;
import mindustry.mod.Mods;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\b\u0012\u0004\u0012\u00020\u00050\u000fJ\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u0011R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\u0012"}, d2={"Lyellow/internal/MetaChaos;", "", "()V", "descriptions", "Larc/struct/Seq;", "", "getDescriptions$annotations", "getDescriptions", "()Larc/struct/Seq;", "subtitles", "getSubtitles$annotations", "getSubtitles", "load", "", "filterComments", "", "readLines", "Larc/files/Fi;", "yellow-java"})
@SourceDebugExtension(value={"SMAP\nMetaChaos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaChaos.kt\nyellow/internal/MetaChaos\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n766#2:33\n857#2,2:34\n*S KotlinDebug\n*F\n+ 1 MetaChaos.kt\nyellow/internal/MetaChaos\n*L\n14#1:33\n14#1:34,2\n*E\n"})
public final class MetaChaos {
    @NotNull
    public static final MetaChaos INSTANCE = new MetaChaos();
    @NotNull
    private static final Seq<String> subtitles = new Seq();
    @NotNull
    private static final Seq<String> descriptions = new Seq();

    private MetaChaos() {
    }

    @NotNull
    public static final Seq<String> getSubtitles() {
        return subtitles;
    }

    @JvmStatic
    public static /* synthetic */ void getSubtitles$annotations() {
    }

    @NotNull
    public static final Seq<String> getDescriptions() {
        return descriptions;
    }

    @JvmStatic
    public static /* synthetic */ void getDescriptions$annotations() {
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<String> filterComments(@NotNull List<String> $this$filterComments) {
        void $this$filterTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$filterComments, "<this>");
        Iterable $this$filter$iv = $this$filterComments;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            String it = (String)element$iv$iv;
            boolean bl = false;
            if (!(!StringsKt.startsWith$default(it, "#", false, 2, null))) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        return (List)destination$iv$iv;
    }

    @NotNull
    public final List<String> readLines(@NotNull Fi $this$readLines) {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        String string = $this$readLines.readString();
        Intrinsics.checkNotNullExpressionValue(string, "this.readString()");
        char[] cArray = new char[]{'\n'};
        return this.filterComments(StringsKt.split$default((CharSequence)string, cArray, false, 0, 6, null));
    }

    @JvmStatic
    public static final void load() {
        Mods.ModMeta meta = Vars.mods.getMod((String)"yellow-java").meta;
        subtitles.add((Object)meta.subtitle);
        descriptions.add((Object)meta.description);
        Fi fi = Vars.tree.get("metachaos/subtitles.txt");
        Intrinsics.checkNotNullExpressionValue(fi, "Vars.tree[\"metachaos/subtitles.txt\"]");
        List<String> sub = INSTANCE.readLines(fi);
        subtitles.addAll((Iterable)sub);
        Fi fi2 = Vars.tree.get("metachaos/descriptions.txt");
        Intrinsics.checkNotNullExpressionValue(fi2, "Vars.tree[\"metachaos/descriptions.txt\"]");
        List<String> desc = INSTANCE.readLines(fi2);
        descriptions.addAll((Iterable)desc);
    }
}

