// 
// Decompiled by Procyon v0.6.0
// 

package yellow.entities.units.entity;

import kotlin.jvm.JvmStatic;
import mindustry.gen.EntityMapping;
import kotlin.jvm.internal.DefaultConstructorMarker;
import arc.util.io.Reads;
import yellow.entities.units.DisableableWeaponMount;
import arc.util.io.Writes;
import mindustry.gen.Teamc;
import mindustry.content.UnitTypes;
import mindustry.type.Weapon;
import kotlin.random.Random;
import mindustry.entities.Units;
import yellow.YellowPermVars;
import mindustry.type.UnitType;
import yellow.entities.units.YellowUnitType;
import kotlin.jvm.internal.Intrinsics;
import mindustry.entities.units.WeaponMount;
import kotlin.jvm.functions.Function1;
import arc.Events;
import yellow.game.YEventType;
import mindustry.gen.Unit;
import mindustry.world.blocks.storage.CoreBlock$CoreBuild;
import mindustry.Vars;
import arc.math.Mathf;
import arc.struct.Seq;
import arc.math.geom.Vec2;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import yellow.game.Spellcaster;
import mindustry.gen.UnitEntity;

@Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J,\u0010&\u001a\u00020\u001e\"\n\b\u0000\u0010'\u0018\u0001*\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u00020\u001e0*H\u0086\b\u00f8\u0001\u0000J\u0006\u0010+\u001a\u00020\u001eJ\b\u0010,\u001a\u00020\u000eH\u0016J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0016J\u0006\u00101\u001a\u00020\u0005J\u0010\u00102\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001eH\u0016J\b\u00105\u001a\u00020\u001eH\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u000eH\u0016J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u001eH\u0016J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A" }, d2 = { "Lyellow/entities/units/entity/YellowUnitEntity;", "Lmindustry/gen/UnitEntity;", "Lyellow/game/Spellcaster;", "()V", "allowsHealing", "", "getAllowsHealing", "()Z", "setAllowsHealing", "(Z)V", "everywhere", "Larc/math/geom/Vec2;", "firstDeath", "franticTeleportTime", "", "inited", "lives", "", "getLives", "()I", "setLives", "(I)V", "panicMode", "getPanicMode", "setPanicMode", "panicModeTypeTwo", "getPanicModeTypeTwo", "setPanicModeTypeTwo", "tensionPoints", "addTensionPoints", "", "amount", "classId", "damage", "withEffect", "damagePierce", "destroy", "destroyFull", "eachMountAs", "T", "Lmindustry/entities/units/WeaponMount;", "cons", "Lkotlin/Function1;", "forceKill", "getTensionPoints", "initVars", "invalidateDeath", "invalidateVars", "kill", "outOfWorldBounds", "read", "Larc/util/io/Reads;", "remove", "removeFull", "removeTensionPoints", "setTensionPoints", "set", "toString", "", "type", "Lyellow/entities/units/YellowUnitType;", "update", "write", "Larc/util/io/Writes;", "Companion", "yellow-java" })
public class YellowUnitEntity extends UnitEntity implements Spellcaster
{
    @NotNull
    public static final Companion Companion;
    private boolean inited;
    private boolean firstDeath;
    private float franticTeleportTime;
    private float tensionPoints;
    @NotNull
    private final Vec2 everywhere;
    private int lives;
    private boolean allowsHealing;
    private boolean panicMode;
    private boolean panicModeTypeTwo;
    private static final int mappingId;
    @NotNull
    private static final Seq<YellowUnitEntity> entities;
    
    public YellowUnitEntity() {
        this.franticTeleportTime = 60.0f;
        this.everywhere = new Vec2();
    }
    
    public final int getLives() {
        return this.lives;
    }
    
    public final void setLives(final int <set-?>) {
        this.lives = <set-?>;
    }
    
    public final boolean getAllowsHealing() {
        return this.allowsHealing;
    }
    
    public final void setAllowsHealing(final boolean <set-?>) {
        this.allowsHealing = <set-?>;
    }
    
    public final boolean getPanicMode() {
        return this.panicMode;
    }
    
    public final void setPanicMode(final boolean <set-?>) {
        this.panicMode = <set-?>;
    }
    
    public final boolean getPanicModeTypeTwo() {
        return this.panicModeTypeTwo;
    }
    
    public final void setPanicModeTypeTwo(final boolean <set-?>) {
        this.panicModeTypeTwo = <set-?>;
    }
    
    private final void initVars() {
        this.inited = true;
        this.lives = this.type().getMaxLives();
        this.allowsHealing = Mathf.chance(0.346);
        this.panicMode = Mathf.chance(0.221);
        this.panicModeTypeTwo = Mathf.chance(0.124);
        YellowUnitEntity.entities.add((Object)this);
    }
    
    private final void invalidateVars() {
        this.lives = 0;
        this.allowsHealing = false;
        this.panicMode = false;
        this.panicModeTypeTwo = false;
        this.dead = true;
        this.health = 0.0f;
        this.shield = 0.0f;
        YellowUnitEntity.entities.remove((Object)this);
    }
    
    private final void invalidateDeath() {
        --this.lives;
        this.health = super.type.health;
        this.dead = false;
        this.elevation = 1.0f;
        if (this.lives == this.type().getMaxLives() - 1 && !this.firstDeath) {
            this.shield = Mathf.random(1000.0f, 8000.0f);
            this.firstDeath = true;
        }
        if (this.isPlayer()) {
            Vars.ui.showInfoFade(this.lives + " left!");
        }
        if (this.outOfWorldBounds()) {
            if (super.team.data().cores.isEmpty()) {
                this.x = Mathf.random(Vars.world.width()) * 8.0f;
                this.y = Mathf.random(Vars.world.height()) * 8.0f;
            }
            else {
                final CoreBlock$CoreBuild core = (CoreBlock$CoreBuild)super.team.data().cores.get(0);
                this.x = core.x;
                this.y = core.y;
            }
        }
        else {
            this.x += Mathf.range(200.0f);
            this.y += Mathf.range(200.0f);
        }
        Events.fire((Object)new YEventType.DeathInvalidationEvent((Unit)this));
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
        return super.x > Vars.world.width() * 8.0f || super.x < 0.0f || super.y > Vars.world.height() * 8.0f || super.y < 0.0f;
    }
    
    public final void forceKill() {
        while (this.lives > 0) {
            this.kill();
        }
    }
    
    @NotNull
    public YellowUnitType type() {
        final UnitType type = super.type;
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type yellow.entities.units.YellowUnitType");
        return (YellowUnitType)type;
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
    
    public void damage(final float amount) {
        super.damage(amount);
    }
    
    public void damage(final float amount, final boolean withEffect) {
        this.damage(amount);
    }
    
    public void damagePierce(final float amount) {
        this.damage(amount);
    }
    
    public void damagePierce(final float amount, final boolean withEffect) {
        this.damage(amount);
    }
    
    public void update() {
        super.update();
        if (!this.inited) {
            this.initVars();
        }
        this.spawnedByCore = false;
        if (super.team.data().countType(super.type) > 1) {
            YellowPermVars.INSTANCE.setRemoveAllowed(true);
            this.removeFull();
        }
        else {
            YellowPermVars.INSTANCE.setRemoveAllowed(false);
        }
        if (this.allowsHealing) {
            Units.nearby(super.x, super.y, 120.0f, 120.0f, YellowUnitEntity::update$lambda$1);
        }
        if (this.panicMode && this.lives == 1 && this.franticTeleportTime > 0.0f) {
            this.everywhere.set((float)Mathf.random(Vars.world.width()) * 8.0f, (float)Mathf.random(Vars.world.height()) * 8.0f);
            this.x = this.everywhere.x;
            this.y = this.everywhere.y;
            final WeaponMount[] mounts = super.mounts;
            Intrinsics.checkNotNullExpressionValue(mounts, "mounts");
            final WeaponMount mountus = (WeaponMount)ArraysKt___ArraysKt.random(mounts, Random.Default);
            mountus.shoot = true;
            mountus.weapon.update((Unit)this, mountus);
            if (this.panicModeTypeTwo) {
                ((Weapon)UnitTypes.quad.weapons.get(0)).bullet.create((Teamc)this, super.x, super.y, 0.0f);
            }
            --this.franticTeleportTime;
        }
    }
    
    public float getTensionPoints() {
        return this.tensionPoints;
    }
    
    public void setTensionPoints(final float set) {
        this.tensionPoints = set;
    }
    
    public void addTensionPoints(final float amount) {
        this.tensionPoints += amount;
    }
    
    public void removeTensionPoints(final float amount) {
        this.tensionPoints -= amount;
    }
    
    @NotNull
    public String toString() {
        return this.isValid() ? ("YellowUnitEntity#" + super.id) : ("(invalid) YellowUnitEntity#" + super.id);
    }
    
    public void write(@NotNull final Writes write) {
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
        final YellowUnitEntity this_$iv = this;
        final int $i$f$eachMountAs = 0;
        final WeaponMount[] mounts = this_$iv.mounts();
        Intrinsics.checkNotNullExpressionValue(mounts, "mounts()");
        final Object[] $this$forEach$iv$iv = (Object[])mounts;
        final int $i$f$forEach = 0;
        for (int i = 0; i < $this$forEach$iv$iv.length; ++i) {
            final Object element$iv$iv = $this$forEach$iv$iv[i];
            final WeaponMount it$iv = (WeaponMount)element$iv$iv;
            final int n = 0;
            if (it$iv instanceof DisableableWeaponMount) {
                final DisableableWeaponMount it = (DisableableWeaponMount)it$iv;
                final int n2 = 0;
                it.write(write);
            }
        }
    }
    
    public void read(@NotNull final Reads read) {
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
        final YellowUnitEntity this_$iv = this;
        final int $i$f$eachMountAs = 0;
        final WeaponMount[] mounts = this_$iv.mounts();
        Intrinsics.checkNotNullExpressionValue(mounts, "mounts()");
        final Object[] $this$forEach$iv$iv = (Object[])mounts;
        final int $i$f$forEach = 0;
        for (int i = 0; i < $this$forEach$iv$iv.length; ++i) {
            final Object element$iv$iv = $this$forEach$iv$iv[i];
            final WeaponMount it$iv = (WeaponMount)element$iv$iv;
            final int n = 0;
            if (it$iv instanceof DisableableWeaponMount) {
                final DisableableWeaponMount it = (DisableableWeaponMount)it$iv;
                final int n2 = 0;
                it.read(read);
            }
        }
    }
    
    public int classId() {
        return YellowUnitEntity.mappingId;
    }
    
    private static final void update$lambda$1(final YellowUnitEntity this$0, final Unit a) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(a, "a");
        if (Intrinsics.areEqual(a.team, this$0.team)) {
            if (!a.isPlayer()) {
                if (Mathf.chanceDelta(0.09)) {
                    a.heal(10.0f);
                }
            }
            else if (Mathf.chanceDelta(0.14)) {
                a.heal(Mathf.random() * (a.health / 3.0f));
            }
        }
    }
    
    @NotNull
    public static final Seq<YellowUnitEntity> getEntities() {
        return YellowUnitEntity.Companion.getEntities();
    }
    
    public static final /* synthetic */ int access$getMappingId$cp() {
        return YellowUnitEntity.mappingId;
    }
    
    public static final /* synthetic */ Seq access$getEntities$cp() {
        return YellowUnitEntity.entities;
    }
    
    static {
        Companion = new Companion(null);
        mappingId = EntityMapping.register("yellow-unit", YellowUnitEntity::new);
        entities = new Seq();
    }
    
    @Metadata(mv = { 1, 7, 1 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lyellow/entities/units/entity/YellowUnitEntity$Companion;", "", "()V", "entities", "Larc/struct/Seq;", "Lyellow/entities/units/entity/YellowUnitEntity;", "getEntities$annotations", "getEntities", "()Larc/struct/Seq;", "mappingId", "", "getMappingId", "()I", "yellow-java" })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final int getMappingId() {
            return YellowUnitEntity.access$getMappingId$cp();
        }
        
        @NotNull
        public final Seq<YellowUnitEntity> getEntities() {
            return (Seq<YellowUnitEntity>)YellowUnitEntity.access$getEntities$cp();
        }
    }
}
