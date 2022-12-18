/*
 * Decompiled with CFR 0.152.
 */
package yellow;

import com.github.mnemotechnician.mkui.delegates.SettingDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR+\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR+\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\t\u00a8\u0006)"}, d2={"Lyellow/YellowPermVars;", "", "()V", "<set-?>", "", "internalLoggering", "getInternalLoggering", "()Z", "setInternalLoggering", "(Z)V", "internalLoggering$delegate", "Lcom/github/mnemotechnician/mkui/delegates/SettingDelegate;", "removeAllowed", "getRemoveAllowed", "setRemoveAllowed", "removeAllowed$delegate", "", "sourceBERepo", "getSourceBERepo", "()Ljava/lang/String;", "setSourceBERepo", "(Ljava/lang/String;)V", "sourceBERepo$delegate", "sourceReleaseRepo", "getSourceReleaseRepo", "setSourceReleaseRepo", "sourceReleaseRepo$delegate", "syn", "getSyn", "temporary", "getTemporary", "setTemporary", "temporary$delegate", "verboseLoggering", "getVerboseLoggering", "setVerboseLoggering", "verboseLoggering$delegate", "weaponSanityCheck", "getWeaponSanityCheck", "setWeaponSanityCheck", "weaponSanityCheck$delegate", "yellow-java"})
public final class YellowPermVars {
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
        return syn;
    }

    @NotNull
    public final String getSourceBERepo() {
        return (String)sourceBERepo$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setSourceBERepo(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        sourceBERepo$delegate.setValue(this, $$delegatedProperties[0], string);
    }

    @NotNull
    public final String getSourceReleaseRepo() {
        return (String)sourceReleaseRepo$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final void setSourceReleaseRepo(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        sourceReleaseRepo$delegate.setValue(this, $$delegatedProperties[1], string);
    }

    public final boolean getRemoveAllowed() {
        return (Boolean)removeAllowed$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final void setRemoveAllowed(boolean bl) {
        removeAllowed$delegate.setValue(this, $$delegatedProperties[2], bl);
    }

    public final boolean getVerboseLoggering() {
        return (Boolean)verboseLoggering$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final void setVerboseLoggering(boolean bl) {
        verboseLoggering$delegate.setValue(this, $$delegatedProperties[3], bl);
    }

    public final boolean getInternalLoggering() {
        return (Boolean)internalLoggering$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final void setInternalLoggering(boolean bl) {
        internalLoggering$delegate.setValue(this, $$delegatedProperties[4], bl);
    }

    public final boolean getWeaponSanityCheck() {
        return (Boolean)weaponSanityCheck$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final void setWeaponSanityCheck(boolean bl) {
        weaponSanityCheck$delegate.setValue(this, $$delegatedProperties[5], bl);
    }

    public final boolean getTemporary() {
        return (Boolean)temporary$delegate.getValue(this, $$delegatedProperties[6]);
    }

    public final void setTemporary(boolean bl) {
        temporary$delegate.setValue(this, $$delegatedProperties[6], bl);
    }

    static {
        Object default$iv;
        Object object = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "sourceBERepo", "getSourceBERepo()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "sourceReleaseRepo", "getSourceReleaseRepo()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "removeAllowed", "getRemoveAllowed()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "verboseLoggering", "getVerboseLoggering()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "internalLoggering", "getInternalLoggering()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "weaponSanityCheck", "getWeaponSanityCheck()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(YellowPermVars.class, "temporary", "getTemporary()Z", 0))};
        $$delegatedProperties = object;
        INSTANCE = new YellowPermVars();
        syn = "yellow-";
        object = "https://github.com/SMOLKEYS/yellow-java-builds/releases/latest/download/yellow-java.jar";
        String prefix$iv = syn;
        boolean $i$f$setting = false;
        sourceBERepo$delegate = new SettingDelegate<void>(prefix$iv, (void)default$iv);
        default$iv = "https://github.com/SMOLKEYS/yellow-java/releases/latest/download/yellow-java.jar";
        prefix$iv = syn;
        $i$f$setting = false;
        sourceReleaseRepo$delegate = new SettingDelegate<String>(prefix$iv, (String)default$iv);
        default$iv = false;
        prefix$iv = syn;
        $i$f$setting = false;
        removeAllowed$delegate = new SettingDelegate<Object>(prefix$iv, default$iv);
        default$iv = false;
        prefix$iv = syn;
        $i$f$setting = false;
        verboseLoggering$delegate = new SettingDelegate<Object>(prefix$iv, default$iv);
        default$iv = false;
        prefix$iv = syn;
        $i$f$setting = false;
        internalLoggering$delegate = new SettingDelegate<Object>(prefix$iv, default$iv);
        default$iv = true;
        prefix$iv = syn;
        $i$f$setting = false;
        weaponSanityCheck$delegate = new SettingDelegate<Object>(prefix$iv, default$iv);
        default$iv = false;
        prefix$iv = syn;
        $i$f$setting = false;
        temporary$delegate = new SettingDelegate<Object>(prefix$iv, default$iv);
    }
}

