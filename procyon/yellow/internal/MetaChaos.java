// 
// Decompiled by Procyon v0.6.0
// 

package yellow.internal;

import mindustry.mod.Mods$ModMeta;
import mindustry.Vars;
import kotlin.jvm.internal.Intrinsics;
import arc.files.Fi;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import arc.struct.Seq;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r*\b\u0012\u0004\u0012\u00020\u00050\rJ\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r*\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010" }, d2 = { "Lyellow/internal/MetaChaos;", "", "()V", "descriptions", "Larc/struct/Seq;", "", "getDescriptions", "()Larc/struct/Seq;", "subtitles", "getSubtitles", "load", "", "filterComments", "", "readLines", "Larc/files/Fi;", "yellow-java" })
public class MetaChaos
{
    @NotNull
    private final Seq<String> subtitles;
    @NotNull
    private final Seq<String> descriptions;
    
    public MetaChaos() {
        this.subtitles = (Seq<String>)new Seq();
        this.descriptions = (Seq<String>)new Seq();
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
    
    @NotNull
    public final List<String> filterComments(@NotNull final List<String> $this$filterComments) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* $this$filterComments */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_2        /* $this$filter$iv */
        //    11: iconst_0       
        //    12: istore_3        /* $i$f$filter */
        //    13: aload_2         /* $this$filter$iv */
        //    14: astore          4
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: checkcast       Ljava/util/Collection;
        //    26: astore          destination$iv$iv
        //    28: iconst_0       
        //    29: istore          $i$f$filterTo
        //    31: aload           $this$filterTo$iv$iv
        //    33: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    38: astore          7
        //    40: aload           7
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            103
        //    50: aload           7
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: astore          element$iv$iv
        //    59: aload           element$iv$iv
        //    61: checkcast       Ljava/lang/String;
        //    64: astore          it
        //    66: iconst_0       
        //    67: istore          $i$a$-filter-MetaChaos$filterComments$1
        //    69: aload           it
        //    71: ldc             "#"
        //    73: iconst_0       
        //    74: iconst_2       
        //    75: aconst_null    
        //    76: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //    79: ifne            86
        //    82: iconst_1       
        //    83: goto            87
        //    86: iconst_0       
        //    87: ifeq            40
        //    90: aload           destination$iv$iv
        //    92: aload           element$iv$iv
        //    94: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    99: pop            
        //   100: goto            40
        //   103: aload           destination$iv$iv
        //   105: checkcast       Ljava/util/List;
        //   108: nop            
        //   109: areturn        
        //    Signature:
        //  (Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;
        //    StackMapTable: 00 04 FF 00 28 00 08 07 00 02 07 00 4C 07 00 29 01 07 00 29 07 00 2E 01 07 00 34 00 00 FE 00 2D 07 00 04 07 00 3E 01 40 01 F8 00 0F
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot read field "references" because "newVariable" is null
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2945)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final List<String> readLines(@NotNull final Fi $this$readLines) {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        final String string = $this$readLines.readString();
        Intrinsics.checkNotNullExpressionValue(string, "this.readString()");
        return this.filterComments(StringsKt__StringsKt.split$default(string, new char[] { '\n' }, false, 0, 6, null));
    }
    
    public final void load() {
        final Mods$ModMeta meta = Vars.mods.getMod("yellow-java").meta;
        this.subtitles.add((Object)meta.subtitle);
        this.descriptions.add((Object)meta.description);
        final Fi value = Vars.tree.get("metachaos/subtitles.txt");
        Intrinsics.checkNotNullExpressionValue(value, "Vars.tree[\"metachaos/subtitles.txt\"]");
        final List sub = this.readLines(value);
        this.subtitles.addAll((Iterable)sub);
        final Fi value2 = Vars.tree.get("metachaos/descriptions.txt");
        Intrinsics.checkNotNullExpressionValue(value2, "Vars.tree[\"metachaos/descriptions.txt\"]");
        final List desc = this.readLines(value2);
        this.descriptions.addAll((Iterable)desc);
    }
}
