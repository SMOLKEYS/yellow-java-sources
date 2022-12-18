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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mindustry.Vars;
import mindustry.mod.Mods;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r*\b\u0012\u0004\u0012\u00020\u00050\rJ\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r*\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0010"}, d2={"Lyellow/internal/MetaChaos;", "", "()V", "descriptions", "Larc/struct/Seq;", "", "getDescriptions", "()Larc/struct/Seq;", "subtitles", "getSubtitles", "load", "", "filterComments", "", "readLines", "Larc/files/Fi;", "yellow-java"})
public class MetaChaos {
    @NotNull
    private final Seq<String> subtitles = new Seq();
    @NotNull
    private final Seq<String> descriptions = new Seq();

    public MetaChaos() {
        this.load();
    }

    @NotNull
    public final Seq<String> getSubtitles() {
        return this.subtitles;
    }

    @NotNull
    public final Seq<String> getDescriptions() {
        return this.descriptions;
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

    public final void load() {
        Mods.ModMeta meta = Vars.mods.getMod((String)"yellow-java").meta;
        this.subtitles.add((Object)meta.subtitle);
        this.descriptions.add((Object)meta.description);
        Fi fi = Vars.tree.get("metachaos/subtitles.txt");
        Intrinsics.checkNotNullExpressionValue(fi, "Vars.tree[\"metachaos/subtitles.txt\"]");
        List<String> sub = this.readLines(fi);
        this.subtitles.addAll((Iterable)sub);
        Fi fi2 = Vars.tree.get("metachaos/descriptions.txt");
        Intrinsics.checkNotNullExpressionValue(fi2, "Vars.tree[\"metachaos/descriptions.txt\"]");
        List<String> desc = this.readLines(fi2);
        this.descriptions.addAll((Iterable)desc);
    }
}

