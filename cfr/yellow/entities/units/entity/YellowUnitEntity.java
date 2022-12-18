/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.Events
 *  arc.math.Mathf
 *  arc.math.geom.Vec2
 *  arc.struct.Seq
 *  arc.util.io.Reads
 *  arc.util.io.Writes
 *  mindustry.Vars
 *  mindustry.content.UnitTypes
 *  mindustry.entities.Units
 *  mindustry.entities.units.WeaponMount
 *  mindustry.gen.EntityMapping
 *  mindustry.gen.Teamc
 *  mindustry.gen.Unit
 *  mindustry.gen.UnitEntity
 *  mindustry.type.UnitType
 *  mindustry.type.Weapon
 *  mindustry.world.blocks.storage.CoreBlock$CoreBuild
 */
package yellow.entities.units.entity;

import arc.Events;
import arc.math.Mathf;
import arc.math.geom.Vec2;
import arc.struct.Seq;
import arc.util.io.Reads;
import arc.util.io.Writes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import mindustry.Vars;
import mindustry.content.UnitTypes;
import mindustry.entities.Units;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.EntityMapping;
import mindustry.gen.Teamc;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.world.blocks.storage.CoreBlock;
import org.jetbrains.annotations.NotNull;
import yellow.YellowPermVars;
import yellow.entities.units.DisableableWeaponMount;
import yellow.entities.units.YellowUnitType;
import yellow.game.Spellcaster;
import yellow.game.YEventType;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J,\u0010&\u001a\u00020\u001e\"\n\b\u0000\u0010'\u0018\u0001*\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u00020\u001e0*H\u0086\b\u00f8\u0001\u0000J\u0006\u0010+\u001a\u00020\u001eJ\b\u0010,\u001a\u00020\u000eH\u0016J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0016J\u0006\u00101\u001a\u00020\u0005J\u0010\u00102\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001eH\u0016J\b\u00105\u001a\u00020\u001eH\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u000eH\u0016J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u001eH\u0016J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006A"}, d2={"Lyellow/entities/units/entity/YellowUnitEntity;", "Lmindustry/gen/UnitEntity;", "Lyellow/game/Spellcaster;", "()V", "allowsHealing", "", "getAllowsHealing", "()Z", "setAllowsHealing", "(Z)V", "everywhere", "Larc/math/geom/Vec2;", "firstDeath", "franticTeleportTime", "", "inited", "lives", "", "getLives", "()I", "setLives", "(I)V", "panicMode", "getPanicMode", "setPanicMode", "panicModeTypeTwo", "getPanicModeTypeTwo", "setPanicModeTypeTwo", "tensionPoints", "addTensionPoints", "", "amount", "classId", "damage", "withEffect", "damagePierce", "destroy", "destroyFull", "eachMountAs", "T", "Lmindustry/entities/units/WeaponMount;", "cons", "Lkotlin/Function1;", "forceKill", "getTensionPoints", "initVars", "invalidateDeath", "invalidateVars", "kill", "outOfWorldBounds", "read", "Larc/util/io/Reads;", "remove", "removeFull", "removeTensionPoints", "setTensionPoints", "set", "toString", "", "type", "Lyellow/entities/units/YellowUnitType;", "update", "write", "Larc/util/io/Writes;", "Companion", "yellow-java"})
public class YellowUnitEntity
extends UnitEntity
implements Spellcaster {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean inited;
    private boolean firstDeath;
    private float franticTeleportTime = 60.0f;
    private float tensionPoints;
    @NotNull
    private final Vec2 everywhere = new Vec2();
    private int lives;
    private boolean allowsHealing;
    private boolean panicMode;
    private boolean panicModeTypeTwo;
    private static final int mappingId = EntityMapping.register((String)"yellow-unit", YellowUnitEntity::new);
    @NotNull
    private static final Seq<YellowUnitEntity> entities = new Seq();

    public final int getLives() {
        return this.lives;
    }

    public final void setLives(int n) {
        this.lives = n;
    }

    public final boolean getAllowsHealing() {
        return this.allowsHealing;
    }

    public final void setAllowsHealing(boolean bl) {
        this.allowsHealing = bl;
    }

    public final boolean getPanicMode() {
        return this.panicMode;
    }

    public final void setPanicMode(boolean bl) {
        this.panicMode = bl;
    }

    public final boolean getPanicModeTypeTwo() {
        return this.panicModeTypeTwo;
    }

    public final void setPanicModeTypeTwo(boolean bl) {
        this.panicModeTypeTwo = bl;
    }

    private final void initVars() {
        this.inited = true;
        this.lives = this.type().getMaxLives();
        this.allowsHealing = Mathf.chance((double)0.346);
        this.panicMode = Mathf.chance((double)0.221);
        this.panicModeTypeTwo = Mathf.chance((double)0.124);
        entities.add((Object)this);
    }

    private final void invalidateVars() {
        this.lives = 0;
        this.allowsHealing = false;
        this.panicMode = false;
        this.panicModeTypeTwo = false;
        this.dead = true;
        this.health = 0.0f;
        this.shield = 0.0f;
        entities.remove((Object)this);
    }

    private final void invalidateDeath() {
        --this.lives;
        this.health = this.type.health;
        this.dead = false;
        this.elevation = 1.0f;
        if (this.lives == this.type().getMaxLives() - 1 && !this.firstDeath) {
            this.shield = Mathf.random((float)1000.0f, (float)8000.0f);
            this.firstDeath = true;
        }
        if (this.isPlayer()) {
            Vars.ui.showInfoFade(this.lives + " left!");
        }
        if (this.outOfWorldBounds()) {
            if (this.team.data().cores.isEmpty()) {
                this.x = (float)Mathf.random((int)Vars.world.width()) * 8.0f;
                this.y = (float)Mathf.random((int)Vars.world.height()) * 8.0f;
            } else {
                CoreBlock.CoreBuild core = (CoreBlock.CoreBuild)this.team.data().cores.get(0);
                this.x = core.x;
                this.y = core.y;
            }
        } else {
            this.x += Mathf.range((float)200.0f);
            this.y += Mathf.range((float)200.0f);
        }
        Events.fire((Object)new YEventType.DeathInvalidationEvent((mindustry.gen.Unit)this));
    }

    private final void destroyFull() {
        this.invalidateVars();
        super.destroy();
    }

    private final void removeFull() {
        this.invalidateVars();
        super.remove();
    }

    public final boolean outOfWorldBounds() {
        return this.x > (float)Vars.world.width() * 8.0f || this.x < 0.0f || this.y > (float)Vars.world.height() * 8.0f || this.y < 0.0f;
    }

    public final void forceKill() {
        while (this.lives > 0) {
            this.kill();
        }
    }

    public final /* synthetic */ <T extends WeaponMount> void eachMountAs(Function1<? super T, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        boolean $i$f$eachMountAs = false;
        WeaponMount[] weaponMountArray = this.mounts();
        Intrinsics.checkNotNullExpressionValue(weaponMountArray, "mounts()");
        Object[] $this$forEach$iv = weaponMountArray;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            WeaponMount it = (WeaponMount)element$iv;
            boolean bl = false;
            Intrinsics.reifiedOperationMarker(3, "T");
            if (!(it instanceof WeaponMount)) continue;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            cons.invoke(it);
        }
    }

    @NotNull
    public YellowUnitType type() {
        UnitType unitType = this.type;
        Intrinsics.checkNotNull(unitType, "null cannot be cast to non-null type yellow.entities.units.YellowUnitType");
        return (YellowUnitType)unitType;
    }

    public void kill() {
        this.destroy();
    }

    public void destroy() {
        if (this.lives > 1) {
            this.invalidateDeath();
            return;
        }
        this.destroyFull();
    }

    public void remove() {
        if (!YellowPermVars.INSTANCE.getRemoveAllowed() && this.lives > 1) {
            return;
        }
        this.removeFull();
    }

    public void damage(float amount) {
        super.damage(amount);
    }

    public void damage(float amount, boolean withEffect) {
        this.damage(amount);
    }

    public void damagePierce(float amount) {
        this.damage(amount);
    }

    public void damagePierce(float amount, boolean withEffect) {
        this.damage(amount);
    }

    public void update() {
        super.update();
        if (!this.inited) {
            this.initVars();
        }
        this.spawnedByCore = false;
        if (this.team.data().countType(this.type) > 1) {
            YellowPermVars.INSTANCE.setRemoveAllowed(true);
            this.removeFull();
        } else {
            YellowPermVars.INSTANCE.setRemoveAllowed(false);
        }
        if (this.allowsHealing) {
            Units.nearby((float)this.x, (float)this.y, (float)120.0f, (float)120.0f, arg_0 -> YellowUnitEntity.update$lambda$1(this, arg_0));
        }
        if (this.panicMode && this.lives == 1 && this.franticTeleportTime > 0.0f) {
            this.everywhere.set((float)Mathf.random((int)Vars.world.width()) * 8.0f, (float)Mathf.random((int)Vars.world.height()) * 8.0f);
            this.x = this.everywhere.x;
            this.y = this.everywhere.y;
            Intrinsics.checkNotNullExpressionValue(this.mounts, "mounts");
            WeaponMount mountus = (WeaponMount)ArraysKt.random((Object[])this.mounts, (Random)Random.Default);
            mountus.shoot = true;
            mountus.weapon.update((mindustry.gen.Unit)this, mountus);
            if (this.panicModeTypeTwo) {
                ((Weapon)UnitTypes.quad.weapons.get((int)0)).bullet.create((Teamc)this, this.x, this.y, 0.0f);
            }
            float f = this.franticTeleportTime;
            this.franticTeleportTime = f + -1.0f;
        }
    }

    @Override
    public float getTensionPoints() {
        return this.tensionPoints;
    }

    @Override
    public void setTensionPoints(float set) {
        this.tensionPoints = set;
    }

    @Override
    public void addTensionPoints(float amount) {
        this.tensionPoints += amount;
    }

    @Override
    public void removeTensionPoints(float amount) {
        this.tensionPoints -= amount;
    }

    @NotNull
    public String toString() {
        return this.isValid() ? "YellowUnitEntity#" + this.id : "(invalid) YellowUnitEntity#" + this.id;
    }

    public void write(@NotNull Writes write) {
        Intrinsics.checkNotNullParameter(write, "write");
        super.write(write);
        write.bool(this.inited);
        write.bool(this.firstDeath);
        write.bool(this.allowsHealing);
        write.bool(this.panicMode);
        write.bool(this.panicModeTypeTwo);
        write.i(this.lives);
        write.f(this.tensionPoints);
        write.f(this.franticTeleportTime);
        YellowUnitEntity this_$iv = this;
        boolean $i$f$eachMountAs = false;
        WeaponMount[] weaponMountArray = this_$iv.mounts();
        Intrinsics.checkNotNullExpressionValue(weaponMountArray, "mounts()");
        Object[] $this$forEach$iv$iv = weaponMountArray;
        boolean $i$f$forEach = false;
        for (Object element$iv$iv : $this$forEach$iv$iv) {
            WeaponMount it$iv = (WeaponMount)element$iv$iv;
            boolean bl = false;
            if (!(it$iv instanceof DisableableWeaponMount)) continue;
            DisableableWeaponMount it = (DisableableWeaponMount)it$iv;
            boolean bl2 = false;
            it.write(write);
        }
    }

    public void read(@NotNull Reads read) {
        Intrinsics.checkNotNullParameter(read, "read");
        super.read(read);
        this.inited = read.bool();
        this.firstDeath = read.bool();
        this.allowsHealing = read.bool();
        this.panicMode = read.bool();
        this.panicModeTypeTwo = read.bool();
        this.lives = read.i();
        this.tensionPoints = read.f();
        this.franticTeleportTime = read.f();
        YellowUnitEntity this_$iv = this;
        boolean $i$f$eachMountAs = false;
        WeaponMount[] weaponMountArray = this_$iv.mounts();
        Intrinsics.checkNotNullExpressionValue(weaponMountArray, "mounts()");
        Object[] $this$forEach$iv$iv = weaponMountArray;
        boolean $i$f$forEach = false;
        for (Object element$iv$iv : $this$forEach$iv$iv) {
            WeaponMount it$iv = (WeaponMount)element$iv$iv;
            boolean bl = false;
            if (!(it$iv instanceof DisableableWeaponMount)) continue;
            DisableableWeaponMount it = (DisableableWeaponMount)it$iv;
            boolean bl2 = false;
            it.read(read);
        }
    }

    public int classId() {
        return mappingId;
    }

    private static final void update$lambda$1(YellowUnitEntity this$0, mindustry.gen.Unit a) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(a, "a");
        if (Intrinsics.areEqual(a.team, this$0.team)) {
            if (!a.isPlayer()) {
                if (Mathf.chanceDelta((double)0.09)) {
                    a.heal(10.0f);
                }
            } else if (Mathf.chanceDelta((double)0.14)) {
                a.heal(Mathf.random() * (a.health / 3.0f));
            }
        }
    }

    @NotNull
    public static final Seq<YellowUnitEntity> getEntities() {
        return Companion.getEntities();
    }

    @Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lyellow/entities/units/entity/YellowUnitEntity$Companion;", "", "()V", "entities", "Larc/struct/Seq;", "Lyellow/entities/units/entity/YellowUnitEntity;", "getEntities$annotations", "getEntities", "()Larc/struct/Seq;", "mappingId", "", "getMappingId", "()I", "yellow-java"})
    public static final class Companion {
        private Companion() {
        }

        public final int getMappingId() {
            return mappingId;
        }

        @NotNull
        public final Seq<YellowUnitEntity> getEntities() {
            return entities;
        }

        @JvmStatic
        public static /* synthetic */ void getEntities$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

