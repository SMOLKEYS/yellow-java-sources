/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.game.Team
 *  mindustry.type.UnitType
 */
package yellow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mindustry.game.Team;
import mindustry.type.UnitType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2={"Lyellow/internal/UnitData;", "", "unit", "Lmindustry/type/UnitType;", "team", "Lmindustry/game/Team;", "health", "", "(Lmindustry/type/UnitType;Lmindustry/game/Team;F)V", "getHealth", "()F", "getTeam", "()Lmindustry/game/Team;", "getUnit", "()Lmindustry/type/UnitType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yellow-java"})
public final class UnitData {
    @NotNull
    private final UnitType unit;
    @NotNull
    private final Team team;
    private final float health;

    public UnitData(@NotNull UnitType unit, @NotNull Team team, float health) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(team, "team");
        this.unit = unit;
        this.team = team;
        this.health = health;
    }

    @NotNull
    public final UnitType getUnit() {
        return this.unit;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public final float getHealth() {
        return this.health;
    }

    @NotNull
    public final UnitType component1() {
        return this.unit;
    }

    @NotNull
    public final Team component2() {
        return this.team;
    }

    public final float component3() {
        return this.health;
    }

    @NotNull
    public final UnitData copy(@NotNull UnitType unit, @NotNull Team team, float health) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(team, "team");
        return new UnitData(unit, team, health);
    }

    public static /* synthetic */ UnitData copy$default(UnitData unitData, UnitType unitType, Team team, float f, int n, Object object) {
        if ((n & 1) != 0) {
            unitType = unitData.unit;
        }
        if ((n & 2) != 0) {
            team = unitData.team;
        }
        if ((n & 4) != 0) {
            f = unitData.health;
        }
        return unitData.copy(unitType, team, f);
    }

    @NotNull
    public String toString() {
        return "UnitData(unit=" + this.unit + ", team=" + this.team + ", health=" + this.health + ')';
    }

    public int hashCode() {
        int result = this.unit.hashCode();
        result = result * 31 + this.team.hashCode();
        result = result * 31 + Float.hashCode(this.health);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnitData)) {
            return false;
        }
        UnitData unitData = (UnitData)other;
        if (!Intrinsics.areEqual(this.unit, unitData.unit)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.team, unitData.team)) {
            return false;
        }
        return Float.compare(this.health, unitData.health) == 0;
    }
}

