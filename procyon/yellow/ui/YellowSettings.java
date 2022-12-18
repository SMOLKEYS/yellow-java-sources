// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ui;

import arc.Core;
import mindustry.ui.dialogs.SettingsMenuDialog$SettingsTable;
import kotlin.jvm.internal.Intrinsics;
import yellow.YellowPermVars;
import kotlin.jvm.JvmStatic;
import mindustry.gen.Icon;
import arc.scene.style.Drawable;
import mindustry.Vars;
import arc.files.Fi;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lyellow/ui/YellowSettings;", "", "()V", "tmpDir", "Larc/files/Fi;", "getTmpDir", "()Larc/files/Fi;", "load", "", "yellow-java" })
public final class YellowSettings
{
    @NotNull
    public static final YellowSettings INSTANCE;
    @NotNull
    private static final Fi tmpDir;
    
    private YellowSettings() {
    }
    
    @NotNull
    public final Fi getTmpDir() {
        return YellowSettings.tmpDir;
    }
    
    @JvmStatic
    public static final void load() {
        Vars.ui.settings.addCategory("Yellow (Java)", (Drawable)Icon.right, YellowSettings::load$lambda$7);
    }
    
    private static final void load$lambda$7$lambda$0(final boolean it) {
        YellowPermVars.INSTANCE.setVerboseLoggering(it);
    }
    
    private static final void load$lambda$7$lambda$1(final boolean it) {
        YellowPermVars.INSTANCE.setInternalLoggering(it);
    }
    
    private static final void load$lambda$7$lambda$2(final boolean it) {
        YellowPermVars.INSTANCE.setWeaponSanityCheck(it);
    }
    
    private static final void load$lambda$7$lambda$3(final String it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (StringsKt__StringsJVMKt.isBlank(it)) {
            YellowPermVars.INSTANCE.setSourceBERepo("https://github.com/SMOLKEYS/yellow-java-builds/releases/latest/download/yellow-java.jar");
        }
        else {
            YellowPermVars.INSTANCE.setSourceBERepo(it);
        }
    }
    
    private static final void load$lambda$7$lambda$4(final String it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (StringsKt__StringsJVMKt.isBlank(it)) {
            YellowPermVars.INSTANCE.setSourceReleaseRepo("https://github.com/SMOLKEYS/yellow-java/releases/latest/download/yellow-java.jar");
        }
        else {
            YellowPermVars.INSTANCE.setSourceReleaseRepo(it);
        }
    }
    
    private static final void load$lambda$7(final SettingsMenuDialog$SettingsTable table) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "Verbose Logging"
        //     3: iconst_0       
        //     4: invokedynamic   BootstrapMethod #1, get:()Larc/func/Boolc;
        //     9: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.checkPref:(Ljava/lang/String;ZLarc/func/Boolc;)V
        //    12: aload_0         /* table */
        //    13: ldc             "Internal Logging"
        //    15: iconst_0       
        //    16: invokedynamic   BootstrapMethod #2, get:()Larc/func/Boolc;
        //    21: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.checkPref:(Ljava/lang/String;ZLarc/func/Boolc;)V
        //    24: aload_0         /* table */
        //    25: ldc             "Disable Allied Yellow Unit Weapons On World Reload"
        //    27: iconst_1       
        //    28: invokedynamic   BootstrapMethod #3, get:()Larc/func/Boolc;
        //    33: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.checkPref:(Ljava/lang/String;ZLarc/func/Boolc;)V
        //    36: aload_0         /* table */
        //    37: ldc             "Source BE Repo"
        //    39: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //    42: invokevirtual   yellow/YellowPermVars.getSourceBERepo:()Ljava/lang/String;
        //    45: invokedynamic   BootstrapMethod #4, get:()Larc/func/Cons;
        //    50: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.textPref:(Ljava/lang/String;Ljava/lang/String;Larc/func/Cons;)V
        //    53: aload_0         /* table */
        //    54: ldc             "Source Repo"
        //    56: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //    59: invokevirtual   yellow/YellowPermVars.getSourceReleaseRepo:()Ljava/lang/String;
        //    62: invokedynamic   BootstrapMethod #5, get:()Larc/func/Cons;
        //    67: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.textPref:(Ljava/lang/String;Ljava/lang/String;Larc/func/Cons;)V
        //    70: aload_0         /* table */
        //    71: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.row:()Larc/scene/ui/layout/Table;
        //    74: pop            
        //    75: aload_0         /* table */
        //    76: ldc             "table"
        //    78: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    81: aload_0         /* table */
        //    82: checkcast       Larc/scene/ui/layout/Table;
        //    85: astore_1       
        //    86: ldc             "Update\n(Do not spam!)"
        //    88: astore_2       
        //    89: iconst_0       
        //    90: istore          wrap$iv
        //    92: getstatic       mindustry/ui/Styles.defaultt:Larc/scene/ui/TextButton$TextButtonStyle;
        //    95: dup            
        //    96: ldc             "defaultt"
        //    98: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   101: astore_3        /* style$iv */
        //   102: iconst_0       
        //   103: istore          $i$f$textButton
        //   105: aload_1         /* $this$textButton_u24default$iv */
        //   106: new             Larc/scene/ui/TextButton;
        //   109: dup            
        //   110: aload_2         /* text$iv */
        //   111: aload_3         /* style$iv */
        //   112: invokespecial   arc/scene/ui/TextButton.<init>:(Ljava/lang/String;Larc/scene/ui/TextButton$TextButtonStyle;)V
        //   115: astore          6
        //   117: aload           6
        //   119: astore          7
        //   121: astore          8
        //   123: iconst_0       
        //   124: istore          $i$a$-also-ButtonDslKt$textButton$2$iv
        //   126: aload           it$iv
        //   128: new             Lyellow/ui/YellowSettings$load$lambda$7$$inlined$textButton$default$1;
        //   131: dup            
        //   132: aload           it$iv
        //   134: invokespecial   yellow/ui/YellowSettings$load$lambda$7$$inlined$textButton$default$1.<init>:(Larc/scene/ui/TextButton;)V
        //   137: checkcast       Ljava/lang/Runnable;
        //   140: invokevirtual   arc/scene/ui/TextButton.clicked:(Ljava/lang/Runnable;)Larc/scene/event/ClickListener;
        //   143: pop            
        //   144: aload           it$iv
        //   146: invokevirtual   arc/scene/ui/TextButton.getLabel:()Larc/scene/ui/Label;
        //   149: iload           wrap$iv
        //   151: invokevirtual   arc/scene/ui/Label.setWrap:(Z)V
        //   154: nop            
        //   155: aload           8
        //   157: aload           6
        //   159: checkcast       Larc/scene/Element;
        //   162: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   165: dup            
        //   166: ldc             "add(TextButton(text, sty\u2026t.label.setWrap(wrap)\n\t})"
        //   168: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   171: pop            
        //   172: aload_0         /* table */
        //   173: invokevirtual   mindustry/ui/dialogs/SettingsMenuDialog$SettingsTable.row:()Larc/scene/ui/layout/Table;
        //   176: pop            
        //   177: aload_0         /* table */
        //   178: checkcast       Larc/scene/ui/layout/Table;
        //   181: astore_1       
        //   182: ldc             "Check Status"
        //   184: astore_2       
        //   185: iconst_0       
        //   186: istore          wrap$iv
        //   188: getstatic       mindustry/ui/Styles.defaultt:Larc/scene/ui/TextButton$TextButtonStyle;
        //   191: dup            
        //   192: ldc             "defaultt"
        //   194: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   197: astore_3        /* style$iv */
        //   198: iconst_0       
        //   199: istore          $i$f$textButton
        //   201: aload_1         /* $this$textButton_u24default$iv */
        //   202: new             Larc/scene/ui/TextButton;
        //   205: dup            
        //   206: aload_2         /* text$iv */
        //   207: aload_3         /* style$iv */
        //   208: invokespecial   arc/scene/ui/TextButton.<init>:(Ljava/lang/String;Larc/scene/ui/TextButton$TextButtonStyle;)V
        //   211: astore          6
        //   213: aload           6
        //   215: astore          7
        //   217: astore          8
        //   219: iconst_0       
        //   220: istore          $i$a$-also-ButtonDslKt$textButton$2$iv
        //   222: aload           it$iv
        //   224: new             Lyellow/ui/YellowSettings$load$lambda$7$$inlined$textButton$default$2;
        //   227: dup            
        //   228: aload           it$iv
        //   230: invokespecial   yellow/ui/YellowSettings$load$lambda$7$$inlined$textButton$default$2.<init>:(Larc/scene/ui/TextButton;)V
        //   233: checkcast       Ljava/lang/Runnable;
        //   236: invokevirtual   arc/scene/ui/TextButton.clicked:(Ljava/lang/Runnable;)Larc/scene/event/ClickListener;
        //   239: pop            
        //   240: aload           it$iv
        //   242: invokevirtual   arc/scene/ui/TextButton.getLabel:()Larc/scene/ui/Label;
        //   245: iload           wrap$iv
        //   247: invokevirtual   arc/scene/ui/Label.setWrap:(Z)V
        //   250: nop            
        //   251: aload           8
        //   253: aload           6
        //   255: checkcast       Larc/scene/Element;
        //   258: invokevirtual   arc/scene/ui/layout/Table.add:(Larc/scene/Element;)Larc/scene/ui/layout/Cell;
        //   261: dup            
        //   262: ldc             "add(TextButton(text, sty\u2026t.label.setWrap(wrap)\n\t})"
        //   264: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   267: pop            
        //   268: return         
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
    
    static {
        INSTANCE = new YellowSettings();
        final Fi child = Core.settings.getDataDirectory().child("yellow.jar");
        Intrinsics.checkNotNullExpressionValue(child, "settings.dataDirectory.child(\"yellow.jar\")");
        tmpDir = child;
    }
}
