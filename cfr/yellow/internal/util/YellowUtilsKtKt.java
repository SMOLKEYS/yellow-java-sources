/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  arc.scene.Element
 *  arc.scene.event.Touchable
 *  arc.scene.ui.layout.Table
 *  arc.struct.Seq
 *  mindustry.gen.Unit
 */
package yellow.internal.util;

import arc.graphics.Color;
import arc.scene.Element;
import arc.scene.event.Touchable;
import arc.scene.ui.layout.Table;
import arc.struct.Seq;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.gen.Unit;
import org.jetbrains.annotations.NotNull;
import yellow.type.FoodItem;

@Metadata(mv={1, 8, 0}, k=2, xi=48, d1={"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002\u00a2\u0006\u0002\u0010\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u000b*\u00060\fj\u0002`\r\u001a\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086\u0004\u001a\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0004\u001a\u0012\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a\u001a\n\u0010\u001b\u001a\u00020\u0007*\u00020\u000f\u00a8\u0006\u001c"}, d2={"seqOf", "Larc/struct/Seq;", "T", "items", "", "([Ljava/lang/Object;)Larc/struct/Seq;", "typiis", "", "item", "Lyellow/type/FoodItem;", "healthFract", "", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "ins", "", "other", "", "tint", "color", "Larc/graphics/Color;", "touchableOf", "", "Larc/scene/ui/layout/Table;", "index", "touchable", "Larc/scene/event/Touchable;", "yesNo", "yellow-java"})
public final class YellowUtilsKtKt {
    public static final float healthFract(@NotNull Unit $this$healthFract) {
        Intrinsics.checkNotNullParameter($this$healthFract, "<this>");
        return $this$healthFract.health / $this$healthFract.type.health;
    }

    public static final boolean ins(int $this$ins, int other) {
        return $this$ins % other == 0;
    }

    public static final boolean ins(float $this$ins, float other) {
        return $this$ins % other == 0.0f;
    }

    @NotNull
    public static final <T> Seq<T> seqOf(T ... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.length == 0) {
            Seq seq = Seq.with((Object[])new Object[0]);
            Intrinsics.checkNotNullExpressionValue(seq, "with()");
            return seq;
        }
        Seq seq = Seq.with((Object[])Arrays.copyOf(items, items.length));
        Intrinsics.checkNotNullExpressionValue(seq, "with(*items)");
        return seq;
    }

    public static final void touchableOf(@NotNull Table $this$touchableOf, int index, @NotNull Touchable touchable) {
        Intrinsics.checkNotNullParameter($this$touchableOf, "<this>");
        Intrinsics.checkNotNullParameter(touchable, "touchable");
        ((Element)$this$touchableOf.getChildren().get((int)index)).touchable = touchable;
    }

    @NotNull
    public static final String typiis(@NotNull FoodItem item) {
        StringBuilder stringBuilder;
        Intrinsics.checkNotNullParameter((Object)item, "item");
        StringBuilder $this$typiis_u24lambda_u240 = stringBuilder = new StringBuilder();
        boolean bl = false;
        if (item.healUsingPercentage) {
            $this$typiis_u24lambda_u240.append("" + '+' + (int)(item.healingPercent * 100.0f) + "% HP");
        } else {
            $this$typiis_u24lambda_u240.append("" + '+' + item.healing + " HP");
        }
        if (item.healAllAllies) {
            $this$typiis_u24lambda_u240.append(" (Team)");
        } else {
            $this$typiis_u24lambda_u240.append(" (Single)");
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public static final String tint(@NotNull String $this$tint, @NotNull Color color) {
        Intrinsics.checkNotNullParameter($this$tint, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        return "[#" + color + ']' + $this$tint + "[]";
    }

    @NotNull
    public static final String yesNo(boolean $this$yesNo) {
        return $this$yesNo ? "Yes" : "No";
    }
}

