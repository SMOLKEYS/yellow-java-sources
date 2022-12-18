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
        //    84: invokevirtual   arc/scene/ui/layout/Cell.get:()Larc/scene/Element;
        //    87: checkcast       Larc/scene/ui/Label;
        //    90: iconst_1       
        //    91: invokevirtual   arc/scene/ui/Label.setWrap:(Z)V
        //    94: aload_2         /* info */
        //    95: invokevirtual   arc/scene/ui/layout/Table.row:()Larc/scene/ui/layout/Table;
        //    98: pop            
        //    99: aload_2         /* info */
        //   100: ldc             "General Stats"
        //   102: checkcast       Ljava/lang/CharSequence;
        //   105: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //   108: getstatic       mindustry/graphics/Pal.accent:Larc/graphics/Color;
        //   111: invokevirtual   arc/scene/ui/layout/Cell.color:(Larc/graphics/Color;)Larc/scene/ui/layout/Cell;
        //   114: invokevirtual   arc/scene/ui/layout/Cell.fillX:()Larc/scene/ui/layout/Cell;
        //   117: ldc             3.0
        //   119: invokevirtual   arc/scene/ui/layout/Cell.padTop:(F)Larc/scene/ui/layout/Cell;
        //   122: invokevirtual   arc/scene/ui/layout/Cell.row:()V
        //   125: aload_2         /* info */
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: astore_3       
        //   134: aload_3        
        //   135: astore          4
        //   137: astore          6
        //   139: iconst_0       
        //   140: istore          $i$a$-buildString-WeaponInfoDialog$show$2
        //   142: aload           $this$show_u24lambda_u241
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: ldc             "[lightgray]Reload:[] "
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: aload_1         /* weapon */
        //   157: getfield        yellow/type/NameableWeapon.reload:F
        //   160: ldc             60.0
        //   162: fdiv           
        //   163: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   166: ldc             " seconds\n"
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: pop            
        //   178: aload           $this$show_u24lambda_u241
        //   180: new             Ljava/lang/StringBuilder;
        //   183: dup            
        //   184: invokespecial   java/lang/StringBuilder.<init>:()V
        //   187: ldc             "[lightgray]X, Y:[] "
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: aload_1         /* weapon */
        //   193: getfield        yellow/type/NameableWeapon.x:F
        //   196: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   199: ldc             ", "
        //   201: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   204: aload_1         /* weapon */
        //   205: getfield        yellow/type/NameableWeapon.y:F
        //   208: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   211: bipush          10
        //   213: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   216: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   219: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   222: pop            
        //   223: aload           $this$show_u24lambda_u241
        //   225: new             Ljava/lang/StringBuilder;
        //   228: dup            
        //   229: invokespecial   java/lang/StringBuilder.<init>:()V
        //   232: ldc             "[lightgray]Rotate:[] "
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: aload_1         /* weapon */
        //   238: getfield        yellow/type/NameableWeapon.rotate:Z
        //   241: invokestatic    yellow/internal/util/YellowUtilsKtKt.yesNo:(Z)Ljava/lang/String;
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: bipush          10
        //   249: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   252: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: pop            
        //   259: aload           $this$show_u24lambda_u241
        //   261: new             Ljava/lang/StringBuilder;
        //   264: dup            
        //   265: invokespecial   java/lang/StringBuilder.<init>:()V
        //   268: ldc             "[lightgray]Shoot Cone:[] "
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: aload_1         /* weapon */
        //   274: getfield        yellow/type/NameableWeapon.shootCone:F
        //   277: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   280: ldc             " degrees\n"
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: aload           $this$show_u24lambda_u241
        //   294: new             Ljava/lang/StringBuilder;
        //   297: dup            
        //   298: invokespecial   java/lang/StringBuilder.<init>:()V
        //   301: ldc             "[lightgray]Rotate Speed:[] "
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: aload_1         /* weapon */
        //   307: getfield        yellow/type/NameableWeapon.rotateSpeed:F
        //   310: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   313: ldc             " degrees\n"
        //   315: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   318: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: pop            
        //   325: nop            
        //   326: aload           6
        //   328: aload_3        
        //   329: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   332: dup            
        //   333: ldc             "StringBuilder().apply(builderAction).toString()"
        //   335: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   338: checkcast       Ljava/lang/CharSequence;
        //   341: invokevirtual   arc/scene/ui/layout/Table.add:(Ljava/lang/CharSequence;)Larc/scene/ui/layout/Cell;
        //   344: pop            
        //   345: new             Larc/scene/ui/ScrollPane;
        //   348: dup            
        //   349: aload_2         /* info */
        //   350: checkcast       Larc/scene/Element;
        //   353: invokespecial   arc/scene/ui/ScrollPane.<init>:(Larc/scene/Element;)V
        //   356: astore_3        /* paenu */
        //   357: aload_0         /* this */
        //   358: getfield        mindustry/ui/dialogs/BaseDialog.cont:Larc/scene/ui/layout/Table;
        //   361: aload_3         /* paenu */
        //   362: checkcast       Larc/scene/Element;
        //   365: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   368: pop            
        //   369: aload_0         /* this */
        //   370: invokespecial   mindustry/ui/dialogs/BaseDialog.show:()Larc/scene/ui/Dialog;
        //   373: dup            
        //   374: ldc             "super.show()"
        //   376: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   379: areturn        
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
