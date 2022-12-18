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

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lyellow/ui/buttons/dialogs/WeaponInfoDialog;", "Lmindustry/ui/dialogs/BaseDialog;", "()V", "show", "Larc/scene/ui/Dialog;", "weapon", "Lyellow/type/NameableWeapon;", "yellow-java" })
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
        //     7: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
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
        //    84: invokevirtual   arc/scene/ui/layout/Cell.row:()V
        //    87: aload_2         /* info */
        //    88: ldc             "General Stats"
        //    90: checkcast       Ljava/lang/CharSequence;
        //    93: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //    96: getstatic       mindustry/graphics/Pal.accent:Larc/graphics/Color;
        //    99: invokevirtual   arc/scene/ui/layout/Cell.color:(Larc/graphics/Color;)Larc/scene/ui/layout/Cell;
        //   102: invokevirtual   arc/scene/ui/layout/Cell.fillX:()Larc/scene/ui/layout/Cell;
        //   105: ldc             10.0
        //   107: invokevirtual   arc/scene/ui/layout/Cell.padTop:(F)Larc/scene/ui/layout/Cell;
        //   110: invokevirtual   arc/scene/ui/layout/Cell.row:()V
        //   113: aload_2         /* info */
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: invokespecial   java/lang/StringBuilder.<init>:()V
        //   121: astore_3       
        //   122: aload_3        
        //   123: astore          4
        //   125: astore          6
        //   127: iconst_0       
        //   128: istore          $i$a$-buildString-WeaponInfoDialog$show$2
        //   130: aload           $this$show_u24lambda_u241
        //   132: new             Ljava/lang/StringBuilder;
        //   135: dup            
        //   136: invokespecial   java/lang/StringBuilder.<init>:()V
        //   139: ldc             "[lightgray]Reload:[] "
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: aload_1         /* weapon */
        //   145: getfield        yellow/type/NameableWeapon.reload:F
        //   148: ldc             60.0
        //   150: fdiv           
        //   151: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   154: bipush          10
        //   156: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   159: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: pop            
        //   166: aload           $this$show_u24lambda_u241
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: invokespecial   java/lang/StringBuilder.<init>:()V
        //   175: ldc             "[lightgray]X, Y:[] "
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: aload_1         /* weapon */
        //   181: getfield        yellow/type/NameableWeapon.x:F
        //   184: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   187: ldc             ", "
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: aload_1         /* weapon */
        //   193: getfield        yellow/type/NameableWeapon.y:F
        //   196: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   199: bipush          10
        //   201: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   204: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   210: pop            
        //   211: aload           $this$show_u24lambda_u241
        //   213: new             Ljava/lang/StringBuilder;
        //   216: dup            
        //   217: invokespecial   java/lang/StringBuilder.<init>:()V
        //   220: ldc             "[lightgray]Rotate:[] "
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: aload_1         /* weapon */
        //   226: getfield        yellow/type/NameableWeapon.rotate:Z
        //   229: invokestatic    yellow/internal/util/YellowUtilsKtKt.yesNo:(Z)Ljava/lang/String;
        //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   235: bipush          10
        //   237: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   240: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: aload           $this$show_u24lambda_u241
        //   249: new             Ljava/lang/StringBuilder;
        //   252: dup            
        //   253: invokespecial   java/lang/StringBuilder.<init>:()V
        //   256: ldc             "[lightgray]Shoot Cone:[] "
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: aload_1         /* weapon */
        //   262: getfield        yellow/type/NameableWeapon.shootCone:F
        //   265: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   268: bipush          10
        //   270: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   273: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: pop            
        //   280: aload           $this$show_u24lambda_u241
        //   282: new             Ljava/lang/StringBuilder;
        //   285: dup            
        //   286: invokespecial   java/lang/StringBuilder.<init>:()V
        //   289: ldc             "[lightgray]Rotate Speed:[] "
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: aload_1         /* weapon */
        //   295: getfield        yellow/type/NameableWeapon.rotateSpeed:F
        //   298: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   301: bipush          10
        //   303: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: pop            
        //   313: nop            
        //   314: aload           6
        //   316: aload_3        
        //   317: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   320: dup            
        //   321: ldc             "StringBuilder().apply(builderAction).toString()"
        //   323: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   326: checkcast       Ljava/lang/CharSequence;
        //   329: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //   332: pop            
        //   333: new             Larc/scene/ui/ScrollPane;
        //   336: dup            
        //   337: aload_2         /* info */
        //   338: checkcast       Larc/scene/Element;
        //   341: invokespecial   arc/scene/ui/ScrollPane.<init>:(Larc/scene/Element;)V
        //   344: astore_3        /* paenu */
        //   345: aload_0         /* this */
        //   346: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //   349: aload_3         /* paenu */
        //   350: checkcast       Larc/scene/Element;
        //   353: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   356: pop            
        //   357: aload_0         /* this */
        //   358: invokespecial   mindustry/ui/dialogs/BaseDialog.show:()Larc/scene/ui/Dialog;
        //   361: dup            
        //   362: ldc             "super.show()"
        //   364: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   367: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void show$lambda$0(final NameableWeapon $weapon, final Table it) {
        Intrinsics.checkNotNullParameter($weapon, "$weapon");
        it.image(Core.atlas.drawable("status-disarmed")).size(50.0f);
        it.add((CharSequence)("[accent]" + $weapon.displayName + "[]"));
    }
}
