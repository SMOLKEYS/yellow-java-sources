/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Core
 *  arc.files.Fi
 *  arc.graphics.Color
 *  arc.scene.ui.Image
 *  arc.scene.ui.layout.Cell
 *  arc.scene.ui.layout.Table
 *  arc.struct.Seq
 *  arc.util.Log
 *  arc.util.serialization.JsonReader
 *  arc.util.serialization.JsonValue
 */
package yellow.internal.util;

import arc.Core;
import arc.files.Fi;
import arc.graphics.Color;
import arc.scene.ui.Image;
import arc.scene.ui.layout.Cell;
import arc.scene.ui.layout.Table;
import arc.struct.Seq;
import arc.util.Log;
import arc.util.serialization.JsonReader;
import arc.util.serialization.JsonValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J#\u0010\u001b\u001a\u00020\u001a*\u00020\u001c2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001e\"\u00020\u001a\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2={"Lyellow/internal/util/YellowUtilsKt;", "", "()V", "jsr", "Larc/util/serialization/JsonReader;", "rangeOf", "Lkotlin/ranges/IntRange;", "one", "", "two", "seperator", "Larc/scene/ui/layout/Cell;", "Larc/scene/ui/Image;", "table", "Larc/scene/ui/layout/Table;", "width", "", "height", "color", "Larc/graphics/Color;", "traverse", "", "dir", "Larc/files/Fi;", "dump", "Larc/struct/Seq;", "", "getValues", "Larc/util/serialization/JsonValue;", "values", "", "(Larc/util/serialization/JsonValue;[Ljava/lang/String;)Ljava/lang/String;", "yellow-java"})
public final class YellowUtilsKt {
    @NotNull
    public static final YellowUtilsKt INSTANCE = new YellowUtilsKt();
    @NotNull
    private static final JsonReader jsr = new JsonReader();

    private YellowUtilsKt() {
    }

    @NotNull
    public final IntRange rangeOf(int one, int two) {
        return new IntRange(one, two);
    }

    public final void traverse(@NotNull Fi dir, @NotNull Seq<String> dump) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(dump, "dump");
        if (!dir.exists()) {
            return;
        }
        dir.seq().each(arg_0 -> YellowUtilsKt.traverse$lambda$0(dump, arg_0));
    }

    public final void traverse(@NotNull Fi dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (!dir.exists()) {
            return;
        }
        dir.seq().each(YellowUtilsKt::traverse$lambda$1);
    }

    @NotNull
    public final String getValues(@NotNull JsonValue $this$getValues, String ... values2) {
        StringBuilder stringBuilder;
        Intrinsics.checkNotNullParameter($this$getValues, "<this>");
        Intrinsics.checkNotNullParameter(values2, "values");
        JsonValue aus = $this$getValues;
        StringBuilder $this$getValues_u24lambda_u243 = stringBuilder = new StringBuilder();
        boolean bl = false;
        String[] $this$forEach$iv = values2;
        boolean $i$f$forEach = false;
        int n = $this$forEach$iv.length;
        for (int j = 0; j < n; ++j) {
            String element$iv;
            String it = element$iv = $this$forEach$iv[j];
            boolean bl2 = false;
            String[] stringArray = new String[]{":"};
            List sua = StringsKt.split$default((CharSequence)String.valueOf(aus.get(it)), stringArray, false, 0, 6, null);
            $this$getValues_u24lambda_u243.append(Core.bundle.get("status." + StringsKt.replace$default((String)sua.get(0), "_", "-", false, 4, null)) + ": " + ((Object)StringsKt.trim((CharSequence)((String)sua.get(1)))).toString() + '\n');
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final Cell<Image> seperator(@NotNull Table table, float width) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.seperator(table, width, 10.0f);
    }

    @NotNull
    public final Cell<Image> seperator(@NotNull Table table, float width, float height) {
        Intrinsics.checkNotNullParameter(table, "table");
        Color color = Color.darkGray;
        Intrinsics.checkNotNullExpressionValue(color, "darkGray");
        return this.seperator(table, width, height, color);
    }

    @NotNull
    public final Cell<Image> seperator(@NotNull Table table, float width, float height, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(color, "color");
        Cell cell = table.image().width(width).height(height).color(color);
        Intrinsics.checkNotNullExpressionValue(cell, "table.image().width(widt\u2026ight(height).color(color)");
        return cell;
    }

    private static final void traverse$lambda$0(Seq $dump, Fi su) {
        Intrinsics.checkNotNullParameter($dump, "$dump");
        Intrinsics.checkNotNullParameter(su, "su");
        if (su.isDirectory()) {
            $dump.add((Object)StringsKt.removeSuffix(StringsKt.replace$default(su.pathWithoutExtension().toString(), "/", ".", false, 4, null), (CharSequence)"."));
        }
        if (!su.seq().isEmpty()) {
            INSTANCE.traverse(su, (Seq<String>)$dump);
        }
    }

    private static final void traverse$lambda$1(Fi su) {
        Intrinsics.checkNotNullParameter(su, "su");
        if (su.isDirectory()) {
            Log.info((String)StringsKt.removeSuffix(StringsKt.replace$default(su.pathWithoutExtension().toString(), "/", ".", false, 4, null), (CharSequence)"."), (Object[])new Object[0]);
        }
        if (!su.seq().isEmpty()) {
            INSTANCE.traverse(su);
        }
    }
}

