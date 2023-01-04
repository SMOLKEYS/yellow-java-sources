/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Mathf
 *  arc.util.Time
 *  arc.util.io.Reads
 *  arc.util.io.Writes
 *  mindustry.content.Fx
 *  mindustry.entities.Effect
 *  mindustry.gen.EntityMapping
 *  mindustry.gen.UnitEntity
 *  mindustry.type.UnitType
 */
package yellow.entities.units.entity;

import arc.math.Mathf;
import arc.util.Time;
import arc.util.io.Reads;
import arc.util.io.Writes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mindustry.content.Fx;
import mindustry.entities.Effect;
import mindustry.gen.EntityMapping;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import org.jetbrains.annotations.NotNull;
import yellow.entities.units.GhostUnitType;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0006\u0010\u0019\u001a\u00020\nJ\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2={"Lyellow/entities/units/entity/GhostUnitEntity;", "Lmindustry/gen/UnitEntity;", "()V", "despawnEffect", "Lmindustry/entities/Effect;", "getDespawnEffect", "()Lmindustry/entities/Effect;", "setDespawnEffect", "(Lmindustry/entities/Effect;)V", "ghostLifetime", "", "getGhostLifetime", "()F", "setGhostLifetime", "(F)V", "inited", "", "cap", "", "clampLifetime", "", "classId", "destroy", "initVars", "kill", "lifetimef", "read", "Larc/util/io/Reads;", "update", "write", "Larc/util/io/Writes;", "Companion", "yellow-java"})
public class GhostUnitEntity
extends UnitEntity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private float ghostLifetime;
    @NotNull
    private Effect despawnEffect;
    private boolean inited;
    private static final int mappingId = EntityMapping.register((String)"ghost-unit", GhostUnitEntity::new);

    public GhostUnitEntity() {
        Effect effect = Fx.none;
        Intrinsics.checkNotNullExpressionValue(effect, "none");
        this.despawnEffect = effect;
    }

    public final float getGhostLifetime() {
        return this.ghostLifetime;
    }

    public final void setGhostLifetime(float f) {
        this.ghostLifetime = f;
    }

    @NotNull
    public final Effect getDespawnEffect() {
        return this.despawnEffect;
    }

    public final void setDespawnEffect(@NotNull Effect effect) {
        Intrinsics.checkNotNullParameter(effect, "<set-?>");
        this.despawnEffect = effect;
    }

    public final float lifetimef() {
        UnitType unitType = this.type;
        Intrinsics.checkNotNull(unitType, "null cannot be cast to non-null type yellow.entities.units.GhostUnitType");
        return this.ghostLifetime / ((GhostUnitType)unitType).ghostLifetime;
    }

    public final void clampLifetime() {
        UnitType unitType = this.type;
        Intrinsics.checkNotNull(unitType, "null cannot be cast to non-null type yellow.entities.units.GhostUnitType");
        this.ghostLifetime = Mathf.clamp((float)this.ghostLifetime, (float)0.0f, (float)((GhostUnitType)unitType).ghostLifetime);
    }

    private final void initVars() {
        this.inited = true;
        UnitType unitType = this.type;
        Intrinsics.checkNotNull(unitType, "null cannot be cast to non-null type yellow.entities.units.GhostUnitType");
        this.ghostLifetime = ((GhostUnitType)unitType).ghostLifetime + Mathf.random((float)60.0f);
        UnitType unitType2 = this.type;
        Intrinsics.checkNotNull(unitType2, "null cannot be cast to non-null type yellow.entities.units.GhostUnitType");
        Effect effect = ((GhostUnitType)unitType2).despawnEffect;
        Intrinsics.checkNotNullExpressionValue(effect, "type as GhostUnitType).despawnEffect");
        this.despawnEffect = effect;
    }

    public void kill() {
        Fx.unitDespawn.at(this.x, this.y, 0.0f, (Object)this);
        this.remove();
    }

    public void destroy() {
        Fx.unitDespawn.at(this.x, this.y, 0.0f, (Object)this);
        this.remove();
    }

    public void update() {
        super.update();
        if (!this.inited) {
            this.initVars();
        }
        this.ghostLifetime -= Time.delta;
        this.clampLifetime();
        if (this.ghostLifetime <= 0.0f) {
            UnitType unitType = this.type;
            Intrinsics.checkNotNull(unitType, "null cannot be cast to non-null type yellow.entities.units.GhostUnitType");
            GhostUnitType ty = (GhostUnitType)unitType;
            this.remove();
            ty.despawnEffect.at(this.x + ty.despawnEffectOffset.x, this.y + ty.despawnEffectOffset.y);
        }
    }

    public int cap() {
        return this.count() + 1;
    }

    public void write(@NotNull Writes write) {
        Intrinsics.checkNotNullParameter(write, "write");
        super.write(write);
        write.f(this.ghostLifetime);
        write.bool(this.inited);
    }

    public void read(@NotNull Reads read) {
        Intrinsics.checkNotNullParameter(read, "read");
        super.read(read);
        this.ghostLifetime = read.f();
        this.inited = read.bool();
    }

    public int classId() {
        return mappingId;
    }

    @Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lyellow/entities/units/entity/GhostUnitEntity$Companion;", "", "()V", "mappingId", "", "getMappingId", "()I", "yellow-java"})
    public static final class Companion {
        private Companion() {
        }

        public final int getMappingId() {
            return mappingId;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

