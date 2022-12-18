// 
// Decompiled by Procyon v0.6.0
// 

package yellow;

import kotlin.jvm.internal.Intrinsics;
import com.github.mnemotechnician.mkui.delegates.SettingDelegate;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u0010X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR+\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR+\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\t¨\u0006)" }, d2 = { "Lyellow/YellowPermVars;", "", "()V", "<set-?>", "", "internalLoggering", "getInternalLoggering", "()Z", "setInternalLoggering", "(Z)V", "internalLoggering$delegate", "Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;", "removeAllowed", "getRemoveAllowed", "setRemoveAllowed", "removeAllowed$delegate", "", "sourceBERepo", "getSourceBERepo", "()Ljava/lang/String;", "setSourceBERepo", "(Ljava/lang/String;)V", "sourceBERepo$delegate", "sourceReleaseRepo", "getSourceReleaseRepo", "setSourceReleaseRepo", "sourceReleaseRepo$delegate", "syn", "getSyn", "temporary", "getTemporary", "setTemporary", "temporary$delegate", "verboseLoggering", "getVerboseLoggering", "setVerboseLoggering", "verboseLoggering$delegate", "weaponSanityCheck", "getWeaponSanityCheck", "setWeaponSanityCheck", "weaponSanityCheck$delegate", "yellow-java" })
public final class YellowPermVars
{
    @NotNull
    public static final YellowPermVars INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final String syn;
    @NotNull
    private static final SettingDelegate sourceBERepo$delegate;
    @NotNull
    private static final SettingDelegate sourceReleaseRepo$delegate;
    @NotNull
    private static final SettingDelegate removeAllowed$delegate;
    @NotNull
    private static final SettingDelegate verboseLoggering$delegate;
    @NotNull
    private static final SettingDelegate internalLoggering$delegate;
    @NotNull
    private static final SettingDelegate weaponSanityCheck$delegate;
    @NotNull
    private static final SettingDelegate temporary$delegate;
    
    private YellowPermVars() {
    }
    
    @NotNull
    public final String getSyn() {
        return YellowPermVars.syn;
    }
    
    @NotNull
    public final String getSourceBERepo() {
        return YellowPermVars.sourceBERepo$delegate.getValue(this, YellowPermVars.$$delegatedProperties[0]);
    }
    
    public final void setSourceBERepo(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        YellowPermVars.sourceBERepo$delegate.setValue(this, YellowPermVars.$$delegatedProperties[0], <set-?>);
    }
    
    @NotNull
    public final String getSourceReleaseRepo() {
        return YellowPermVars.sourceReleaseRepo$delegate.getValue(this, YellowPermVars.$$delegatedProperties[1]);
    }
    
    public final void setSourceReleaseRepo(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        YellowPermVars.sourceReleaseRepo$delegate.setValue(this, YellowPermVars.$$delegatedProperties[1], <set-?>);
    }
    
    public final boolean getRemoveAllowed() {
        return Boolean.valueOf(YellowPermVars.removeAllowed$delegate.getValue((Object)this, (KProperty<?>)YellowPermVars.$$delegatedProperties[2]));
    }
    
    public final void setRemoveAllowed(final boolean <set-?>) {
        YellowPermVars.removeAllowed$delegate.setValue(this, YellowPermVars.$$delegatedProperties[2], Boolean.valueOf(<set-?>));
    }
    
    public final boolean getVerboseLoggering() {
        return Boolean.valueOf(YellowPermVars.verboseLoggering$delegate.getValue((Object)this, (KProperty<?>)YellowPermVars.$$delegatedProperties[3]));
    }
    
    public final void setVerboseLoggering(final boolean <set-?>) {
        YellowPermVars.verboseLoggering$delegate.setValue(this, YellowPermVars.$$delegatedProperties[3], Boolean.valueOf(<set-?>));
    }
    
    public final boolean getInternalLoggering() {
        return Boolean.valueOf(YellowPermVars.internalLoggering$delegate.getValue((Object)this, (KProperty<?>)YellowPermVars.$$delegatedProperties[4]));
    }
    
    public final void setInternalLoggering(final boolean <set-?>) {
        YellowPermVars.internalLoggering$delegate.setValue(this, YellowPermVars.$$delegatedProperties[4], Boolean.valueOf(<set-?>));
    }
    
    public final boolean getWeaponSanityCheck() {
        return Boolean.valueOf(YellowPermVars.weaponSanityCheck$delegate.getValue((Object)this, (KProperty<?>)YellowPermVars.$$delegatedProperties[5]));
    }
    
    public final void setWeaponSanityCheck(final boolean <set-?>) {
        YellowPermVars.weaponSanityCheck$delegate.setValue(this, YellowPermVars.$$delegatedProperties[5], Boolean.valueOf(<set-?>));
    }
    
    public final boolean getTemporary() {
        return Boolean.valueOf(YellowPermVars.temporary$delegate.getValue((Object)this, (KProperty<?>)YellowPermVars.$$delegatedProperties[6]));
    }
    
    public final void setTemporary(final boolean <set-?>) {
        YellowPermVars.temporary$delegate.setValue(this, YellowPermVars.$$delegatedProperties[6], Boolean.valueOf(<set-?>));
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: anewarray       Lkotlin/reflect/KProperty;
        //     5: astore_0       
        //     6: aload_0        
        //     7: iconst_0       
        //     8: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //    11: dup            
        //    12: ldc             Lyellow/YellowPermVars;.class
        //    14: ldc             "sourceBERepo"
        //    16: ldc             "getSourceBERepo()Ljava/lang/String;"
        //    18: iconst_0       
        //    19: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    22: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //    25: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //    28: checkcast       Lkotlin/reflect/KProperty;
        //    31: aastore        
        //    32: aload_0        
        //    33: iconst_1       
        //    34: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //    37: dup            
        //    38: ldc             Lyellow/YellowPermVars;.class
        //    40: ldc             "sourceReleaseRepo"
        //    42: ldc             "getSourceReleaseRepo()Ljava/lang/String;"
        //    44: iconst_0       
        //    45: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    48: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //    51: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //    54: checkcast       Lkotlin/reflect/KProperty;
        //    57: aastore        
        //    58: aload_0        
        //    59: iconst_2       
        //    60: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //    63: dup            
        //    64: ldc             Lyellow/YellowPermVars;.class
        //    66: ldc             "removeAllowed"
        //    68: ldc             "getRemoveAllowed()Z"
        //    70: iconst_0       
        //    71: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    74: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //    77: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //    80: checkcast       Lkotlin/reflect/KProperty;
        //    83: aastore        
        //    84: aload_0        
        //    85: iconst_3       
        //    86: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //    89: dup            
        //    90: ldc             Lyellow/YellowPermVars;.class
        //    92: ldc             "verboseLoggering"
        //    94: ldc             "getVerboseLoggering()Z"
        //    96: iconst_0       
        //    97: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   100: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //   103: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //   106: checkcast       Lkotlin/reflect/KProperty;
        //   109: aastore        
        //   110: aload_0        
        //   111: iconst_4       
        //   112: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //   115: dup            
        //   116: ldc             Lyellow/YellowPermVars;.class
        //   118: ldc             "internalLoggering"
        //   120: ldc             "getInternalLoggering()Z"
        //   122: iconst_0       
        //   123: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   126: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //   129: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //   132: checkcast       Lkotlin/reflect/KProperty;
        //   135: aastore        
        //   136: aload_0        
        //   137: iconst_5       
        //   138: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //   141: dup            
        //   142: ldc             Lyellow/YellowPermVars;.class
        //   144: ldc             "weaponSanityCheck"
        //   146: ldc             "getWeaponSanityCheck()Z"
        //   148: iconst_0       
        //   149: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   152: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //   155: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //   158: checkcast       Lkotlin/reflect/KProperty;
        //   161: aastore        
        //   162: aload_0        
        //   163: bipush          6
        //   165: new             Lkotlin/jvm/internal/MutablePropertyReference1Impl;
        //   168: dup            
        //   169: ldc             Lyellow/YellowPermVars;.class
        //   171: ldc             "temporary"
        //   173: ldc             "getTemporary()Z"
        //   175: iconst_0       
        //   176: invokespecial   kotlin/jvm/internal/MutablePropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   179: checkcast       Lkotlin/jvm/internal/MutablePropertyReference1;
        //   182: invokestatic    kotlin/jvm/internal/Reflection.mutableProperty1:(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;
        //   185: checkcast       Lkotlin/reflect/KProperty;
        //   188: aastore        
        //   189: aload_0        
        //   190: putstatic       yellow/YellowPermVars.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   193: new             Lyellow/YellowPermVars;
        //   196: dup            
        //   197: invokespecial   yellow/YellowPermVars.<init>:()V
        //   200: putstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   203: ldc             "yellow-"
        //   205: putstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   208: ldc             "https://github.com/SMOLKEYS/yellow-java-builds/releases/latest/download/yellow-java.jar"
        //   210: astore_0       
        //   211: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   214: pop            
        //   215: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   218: astore_1        /* prefix$iv */
        //   219: iconst_0       
        //   220: istore_2        /* $i$f$setting */
        //   221: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   224: dup            
        //   225: aload_1         /* prefix$iv */
        //   226: aload_0         /* default$iv */
        //   227: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   230: putstatic       yellow/YellowPermVars.sourceBERepo$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   233: ldc             "https://github.com/SMOLKEYS/yellow-java/releases/latest/download/yellow-java.jar"
        //   235: astore_0       
        //   236: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   239: pop            
        //   240: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   243: astore_1        /* prefix$iv */
        //   244: iconst_0       
        //   245: istore_2        /* $i$f$setting */
        //   246: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   249: dup            
        //   250: aload_1         /* prefix$iv */
        //   251: aload_0         /* default$iv */
        //   252: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   255: putstatic       yellow/YellowPermVars.sourceReleaseRepo$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   258: iconst_0       
        //   259: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   262: astore_0       
        //   263: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   266: pop            
        //   267: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   270: astore_1        /* prefix$iv */
        //   271: iconst_0       
        //   272: istore_2        /* $i$f$setting */
        //   273: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   276: dup            
        //   277: aload_1         /* prefix$iv */
        //   278: aload_0         /* default$iv */
        //   279: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   282: putstatic       yellow/YellowPermVars.removeAllowed$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   285: iconst_0       
        //   286: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   289: astore_0       
        //   290: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   293: pop            
        //   294: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   297: astore_1        /* prefix$iv */
        //   298: iconst_0       
        //   299: istore_2        /* $i$f$setting */
        //   300: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   303: dup            
        //   304: aload_1         /* prefix$iv */
        //   305: aload_0         /* default$iv */
        //   306: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   309: putstatic       yellow/YellowPermVars.verboseLoggering$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   312: iconst_0       
        //   313: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   316: astore_0       
        //   317: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   320: pop            
        //   321: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   324: astore_1        /* prefix$iv */
        //   325: iconst_0       
        //   326: istore_2        /* $i$f$setting */
        //   327: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   330: dup            
        //   331: aload_1         /* prefix$iv */
        //   332: aload_0         /* default$iv */
        //   333: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   336: putstatic       yellow/YellowPermVars.internalLoggering$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   339: iconst_1       
        //   340: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   343: astore_0       
        //   344: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   347: pop            
        //   348: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   351: astore_1        /* prefix$iv */
        //   352: iconst_0       
        //   353: istore_2        /* $i$f$setting */
        //   354: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   357: dup            
        //   358: aload_1         /* prefix$iv */
        //   359: aload_0         /* default$iv */
        //   360: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   363: putstatic       yellow/YellowPermVars.weaponSanityCheck$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   366: iconst_0       
        //   367: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   370: astore_0       
        //   371: getstatic       yellow/YellowPermVars.INSTANCE:Lyellow/YellowPermVars;
        //   374: pop            
        //   375: getstatic       yellow/YellowPermVars.syn:Ljava/lang/String;
        //   378: astore_1        /* prefix$iv */
        //   379: iconst_0       
        //   380: istore_2        /* $i$f$setting */
        //   381: new             Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   384: dup            
        //   385: aload_1         /* prefix$iv */
        //   386: aload_0         /* default$iv */
        //   387: invokespecial   com/github/mnemotechnician/mkui/delegates/SettingDelegate.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //   390: putstatic       yellow/YellowPermVars.temporary$delegate:Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;
        //   393: return         
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
