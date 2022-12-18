// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ui.buttons.dialogs;

import arc.scene.ui.Dialog;
import org.jetbrains.annotations.NotNull;
import mindustry.game.Team;
import yellow.content.YellowItems;
import mindustry.type.Item;
import kotlin.Metadata;
import mindustry.ui.dialogs.BaseDialog;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lyellow/ui/buttons/dialogs/FoodDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "selectedItem", "Lmindustry/type/Item;", "kotlin.jvm.PlatformType", "getSelectedItem", "()Lmindustry/type/Item;", "setSelectedItem", "(Lmindustry/type/Item;)V", "show", "Larc/scene/ui/Dialog;", "team", "Lmindustry/game/Team;", "yellow-java" })
public class FoodDialog extends BaseDialog
{
    private Item selectedItem;
    
    public FoodDialog() {
        super("Food");
        this.selectedItem = YellowItems.stockItem;
        this.addCloseButton();
    }
    
    public final Item getSelectedItem() {
        return this.selectedItem;
    }
    
    public final void setSelectedItem(final Item <set-?>) {
        this.selectedItem = <set-?>;
    }
    
    @NotNull
    public final Dialog show(@NotNull final Team team) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "team"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //    10: invokevirtual   arc/scene/ui/layout/Table.clear:()V
        //    13: aload_0         /* this */
        //    14: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //    17: dup            
        //    18: ldc             "cont"
        //    20: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: astore_2       
        //    24: getstatic       mindustry/gen/Tex.pane:Larc/scene/style/Drawable;
        //    27: dup            
        //    28: ldc             "pane"
        //    30: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    33: astore_3        /* background$iv */
        //    34: iconst_0       
        //    35: istore          $i$f$addTable
        //    37: aload_2         /* $this$addTable$iv */
        //    38: new             Larc/scene/ui/layout/Table;
        //    41: dup            
        //    42: aload_3         /* background$iv */
        //    43: invokespecial   arc/scene/ui/layout/Table.<init>:(Larc/scene/style/Drawable;)V
        //    46: astore          5
        //    48: aload           5
        //    50: astore          6
        //    52: astore          7
        //    54: iconst_0       
        //    55: istore          $i$a$-also-GroupDslKt$addTable$4$iv
        //    57: aload           it$iv
        //    59: astore          $this$show_u24lambda_u240
        //    61: iconst_0       
        //    62: istore          $i$a$-addTable-FoodDialog$show$1
        //    64: nop            
        //    65: nop            
        //    66: nop            
        //    67: aload           7
        //    69: aload           5
        //    71: checkcast       Larc/scene/Element;
        //    74: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //    77: dup            
        //    78: ldc             "add(Table(background).al\u2026 {\n\t\tit.constructor()\n\t})"
        //    80: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    83: invokevirtual   arc/scene/ui/layout/Cell.grow:()Larc/scene/ui/layout/Cell;
        //    86: pop            
        //    87: aload_0         /* this */
        //    88: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //    91: dup            
        //    92: ldc             "cont"
        //    94: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    97: astore_2       
        //    98: getstatic       mindustry/gen/Tex.pane:Larc/scene/style/Drawable;
        //   101: dup            
        //   102: ldc             "pane"
        //   104: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   107: astore_3        /* background$iv */
        //   108: iconst_0       
        //   109: istore          $i$f$addTable
        //   111: aload_2         /* $this$addTable$iv */
        //   112: new             Larc/scene/ui/layout/Table;
        //   115: dup            
        //   116: aload_3         /* background$iv */
        //   117: invokespecial   arc/scene/ui/layout/Table.<init>:(Larc/scene/style/Drawable;)V
        //   120: astore          5
        //   122: aload           5
        //   124: astore          6
        //   126: astore          7
        //   128: iconst_0       
        //   129: istore          $i$a$-also-GroupDslKt$addTable$4$iv
        //   131: aload           it$iv
        //   133: astore          $this$show_u24lambda_u241
        //   135: iconst_0       
        //   136: istore          $i$a$-addTable-FoodDialog$show$2
        //   138: nop            
        //   139: nop            
        //   140: nop            
        //   141: aload           7
        //   143: aload           5
        //   145: checkcast       Larc/scene/Element;
        //   148: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   151: dup            
        //   152: ldc             "add(Table(background).al\u2026 {\n\t\tit.constructor()\n\t})"
        //   154: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   157: invokevirtual   arc/scene/ui/layout/Cell.grow:()Larc/scene/ui/layout/Cell;
        //   160: pop            
        //   161: aload_0         /* this */
        //   162: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //   165: invokevirtual   arc/scene/ui/layout/Table.row:()Larc/scene/ui/layout/Table;
        //   168: pop            
        //   169: aload_0         /* this */
        //   170: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //   173: dup            
        //   174: ldc             "cont"
        //   176: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   179: astore_2       
        //   180: getstatic       mindustry/gen/Tex.pane:Larc/scene/style/Drawable;
        //   183: dup            
        //   184: ldc             "pane"
        //   186: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   189: astore_3        /* background$iv */
        //   190: iconst_0       
        //   191: istore          $i$f$addTable
        //   193: aload_2         /* $this$addTable$iv */
        //   194: new             Larc/scene/ui/layout/Table;
        //   197: dup            
        //   198: aload_3         /* background$iv */
        //   199: invokespecial   arc/scene/ui/layout/Table.<init>:(Larc/scene/style/Drawable;)V
        //   202: astore          5
        //   204: aload           5
        //   206: astore          6
        //   208: astore          7
        //   210: iconst_0       
        //   211: istore          $i$a$-also-GroupDslKt$addTable$4$iv
        //   213: aload           it$iv
        //   215: astore          $this$show_u24lambda_u242
        //   217: iconst_0       
        //   218: istore          $i$a$-addTable-FoodDialog$show$3
        //   220: nop            
        //   221: nop            
        //   222: nop            
        //   223: aload           7
        //   225: aload           5
        //   227: checkcast       Larc/scene/Element;
        //   230: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   233: dup            
        //   234: ldc             "add(Table(background).al\u2026 {\n\t\tit.constructor()\n\t})"
        //   236: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   239: invokevirtual   arc/scene/ui/layout/Cell.grow:()Larc/scene/ui/layout/Cell;
        //   242: pop            
        //   243: aload_0         /* this */
        //   244: invokespecial   mindustry/ui/dialogs/BaseDialog.show:()Larc/scene/ui/Dialog;
        //   247: dup            
        //   248: ldc             "super.show()"
        //   250: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   253: areturn        
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
}
