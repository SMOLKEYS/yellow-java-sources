// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ui.buttons.dialogs;

import arc.Core;
import kotlin.jvm.internal.Intrinsics;
import arc.scene.ui.layout.Table;
import arc.scene.ui.Dialog;
import org.jetbrains.annotations.NotNull;
import yellow.type.NameableWeapon;
import kotlin.Metadata;
import mindustry.ui.dialogs.BaseDialog;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lyellow/ui/buttons/dialogs/WeaponInfoDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "show", "Larc/scene/ui/Dialog;", "weapon", "Lyellow/type/NameableWeapon;", "yellow-java" })
public class WeaponInfoDialog extends BaseDialog
{
    public WeaponInfoDialog() {
        super("Weapon Info");
        this.addCloseButton();
    }
    
    @NotNull
    public final Dialog show(@NotNull final NameableWeapon weapon) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "weapon"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        yellow/ui/buttons/dialogs/WeaponInfoDialog.cont:Larc/scene/ui/layout/Table;
        //    10: invokevirtual   arc/scene/ui/layout/Table.clear:()V
        //    13: new             Larc/scene/ui/layout/Table;
        //    16: dup            
        //    17: invokespecial   arc/scene/ui/layout/Table.<init>:()V
        //    20: astore_2        /* info */
        //    21: aload_2         /* info */
        //    22: ldc             10.0
        //    24: invokevirtual   arc/scene/ui/layout/Table.margin:(F)Larc/scene/ui/layout/Table;
        //    27: pop            
        //    28: aload_2         /* info */
        //    29: aload_1         /* weapon */
        //    30: invokedynamic   BootstrapMethod #0, get:(Lyellow/type/NameableWeapon;)Larc/func/Cons;
        //    35: invokevirtual   arc/scene/ui/layout/Table.table:(Larc/func/Cons;)Larc/scene/ui/layout/Cell;
        //    38: invokevirtual   arc/scene/ui/layout/Cell.row:()V
        //    41: aload_2         /* info */
        //    42: ldc             "Description"
        //    44: checkcast       Ljava/lang/CharSequence;
        //    47: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //    50: getstatic       mindustry/graphics/Pal.accent:Larc/graphics/Color;
        //    53: invokevirtual   arc/scene/ui/layout/Cell.color:(Larc/graphics/Color;)Larc/scene/ui/layout/Cell;
        //    56: invokevirtual   arc/scene/ui/layout/Cell.fillX:()Larc/scene/ui/layout/Cell;
        //    59: ldc             10.0
        //    61: invokevirtual   arc/scene/ui/layout/Cell.padTop:(F)Larc/scene/ui/layout/Cell;
        //    64: invokevirtual   arc/scene/ui/layout/Cell.row:()V
        //    67: aload_2         /* info */
        //    68: aload_1         /* weapon */
        //    69: getfield        yellow/type/NameableWeapon.description:Ljava/lang/String;
        //    72: checkcast       Ljava/lang/CharSequence;
        //    75: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //    78: getstatic       arc/graphics/Color.lightGray:Larc/graphics/Color;
        //    81: invokevirtual   arc/scene/ui/layout/Cell.color:(Larc/graphics/Color;)Larc/scene/ui/layout/Cell;
        //    84: invokevirtual   arc/scene/ui/layout/Cell.fillX:()Larc/scene/ui/layout/Cell;
        //    87: invokevirtual   arc/scene/ui/layout/Cell.get:()Larc/scene/Element;
        //    90: checkcast       Larc/scene/ui/Label;
        //    93: iconst_1       
        //    94: invokevirtual   arc/scene/ui/Label.setWrap:(Z)V
        //    97: aload_2         /* info */
        //    98: invokevirtual   arc/scene/ui/layout/Table.row:()Larc/scene/ui/layout/Table;
        //   101: pop            
        //   102: aload_2         /* info */
        //   103: ldc             "General Stats"
        //   105: checkcast       Ljava/lang/CharSequence;
        //   108: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //   111: getstatic       mindustry/graphics/Pal.accent:Larc/graphics/Color;
        //   114: invokevirtual   arc/scene/ui/layout/Cell.color:(Larc/graphics/Color;)Larc/scene/ui/layout/Cell;
        //   117: invokevirtual   arc/scene/ui/layout/Cell.fillX:()Larc/scene/ui/layout/Cell;
        //   120: ldc             3.0
        //   122: invokevirtual   arc/scene/ui/layout/Cell.padTop:(F)Larc/scene/ui/layout/Cell;
        //   125: invokevirtual   arc/scene/ui/layout/Cell.row:()V
        //   128: aload_2         /* info */
        //   129: new             Ljava/lang/StringBuilder;
        //   132: dup            
        //   133: invokespecial   java/lang/StringBuilder.<init>:()V
        //   136: astore_3       
        //   137: aload_3        
        //   138: astore          4
        //   140: astore          6
        //   142: iconst_0       
        //   143: istore          $i$a$-buildString-WeaponInfoDialog$show$2
        //   145: aload           $this$show_u24lambda_u241
        //   147: new             Ljava/lang/StringBuilder;
        //   150: dup            
        //   151: invokespecial   java/lang/StringBuilder.<init>:()V
        //   154: ldc             "[lightgray]Reload:[] "
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: aload_1         /* weapon */
        //   160: getfield        yellow/type/NameableWeapon.reload:F
        //   163: ldc             60.0
        //   165: fdiv           
        //   166: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   169: ldc             " seconds\n"
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: pop            
        //   181: aload           $this$show_u24lambda_u241
        //   183: new             Ljava/lang/StringBuilder;
        //   186: dup            
        //   187: invokespecial   java/lang/StringBuilder.<init>:()V
        //   190: ldc             "[lightgray]X, Y:[] "
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: aload_1         /* weapon */
        //   196: getfield        yellow/type/NameableWeapon.x:F
        //   199: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   202: ldc             ", "
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: aload_1         /* weapon */
        //   208: getfield        yellow/type/NameableWeapon.y:F
        //   211: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   214: bipush          10
        //   216: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: pop            
        //   226: aload           $this$show_u24lambda_u241
        //   228: new             Ljava/lang/StringBuilder;
        //   231: dup            
        //   232: invokespecial   java/lang/StringBuilder.<init>:()V
        //   235: ldc             "[lightgray]Rotate:[] "
        //   237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   240: aload_1         /* weapon */
        //   241: getfield        yellow/type/NameableWeapon.rotate:Z
        //   244: invokestatic    yellow/internal/util/YellowUtilsKtKt.yesNo:(Z)Ljava/lang/String;
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   250: bipush          10
        //   252: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   255: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: pop            
        //   262: aload           $this$show_u24lambda_u241
        //   264: new             Ljava/lang/StringBuilder;
        //   267: dup            
        //   268: invokespecial   java/lang/StringBuilder.<init>:()V
        //   271: ldc             "[lightgray]Shoot Cone:[] "
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: aload_1         /* weapon */
        //   277: getfield        yellow/type/NameableWeapon.shootCone:F
        //   280: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   283: ldc             " degrees\n"
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: pop            
        //   295: aload           $this$show_u24lambda_u241
        //   297: new             Ljava/lang/StringBuilder;
        //   300: dup            
        //   301: invokespecial   java/lang/StringBuilder.<init>:()V
        //   304: ldc             "[lightgray]Base Rotation:[] "
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: aload_1         /* weapon */
        //   310: getfield        yellow/type/NameableWeapon.baseRotation:F
        //   313: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   316: ldc             " degrees\n"
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   324: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   327: pop            
        //   328: aload_1         /* weapon */
        //   329: getfield        yellow/type/NameableWeapon.rotate:Z
        //   332: ifeq            368
        //   335: aload           $this$show_u24lambda_u241
        //   337: new             Ljava/lang/StringBuilder;
        //   340: dup            
        //   341: invokespecial   java/lang/StringBuilder.<init>:()V
        //   344: ldc             "[lightgray]Rotate Speed:[] "
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: aload_1         /* weapon */
        //   350: getfield        yellow/type/NameableWeapon.rotateSpeed:F
        //   353: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   356: ldc             " degrees\n"
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   364: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   367: pop            
        //   368: nop            
        //   369: aload           6
        //   371: aload_3        
        //   372: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   375: dup            
        //   376: ldc             "StringBuilder().apply(builderAction).toString()"
        //   378: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   381: checkcast       Ljava/lang/CharSequence;
        //   384: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //   387: pop            
        //   388: new             Larc/scene/ui/ScrollPane;
        //   391: dup            
        //   392: aload_2         /* info */
        //   393: checkcast       Larc/scene/Element;
        //   396: invokespecial   arc/scene/ui/ScrollPane.<init>:(Larc/scene/Element;)V
        //   399: astore_3        /* paenu */
        //   400: aload_0         /* this */
        //   401: getfield        yellow/ui/buttons/dialogs/WeaponInfoDialog.cont:Larc/scene/ui/layout/Table;
        //   404: aload_3         /* paenu */
        //   405: checkcast       Larc/scene/Element;
        //   408: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   411: pop            
        //   412: aload_0         /* this */
        //   413: invokespecial   mindustry/ui/dialogs/BaseDialog.show:()Larc/scene/ui/Dialog;
        //   416: dup            
        //   417: ldc             "super.show()"
        //   419: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   422: areturn        
        //    StackMapTable: 00 01 FF 01 70 00 07 07 00 02 07 00 64 07 00 21 07 00 7E 07 00 7E 01 07 00 21 00 00
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
    
    private static final void show$lambda$0(final NameableWeapon $weapon, final Table it) {
        Intrinsics.checkNotNullParameter($weapon, "$weapon");
        it.image(Core.atlas.drawable("status-disarmed")).size(50.0f);
        it.add((CharSequence)("[accent]" + $weapon.displayName + "[]"));
    }
}
