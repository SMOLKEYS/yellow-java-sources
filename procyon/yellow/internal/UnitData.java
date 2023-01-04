// 
// Decompiled by Procyon v0.6.0
// 

package yellow.internal;

import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.Intrinsics;
import mindustry.game.Team;
import org.jetbrains.annotations.NotNull;
import mindustry.type.UnitType;
import kotlin.Metadata;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a" }, d2 = { "Lyellow/internal/UnitData;", "", "unit", "Lmindustry/type/UnitType;", "team", "Lmindustry/game/Team;", "health", "", "(Lmindustry/type/UnitType;Lmindustry/game/Team;F)V", "getHealth", "()F", "getTeam", "()Lmindustry/game/Team;", "getUnit", "()Lmindustry/type/UnitType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yellow-java" })
public final class UnitData
{
    @NotNull
    private final UnitType unit;
    @NotNull
    private final Team team;
    private final float health;
    
    public UnitData(@NotNull final UnitType unit, @NotNull final Team team, final float health) {
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
    public final UnitData copy(@NotNull final UnitType unit, @NotNull final Team team, final float health) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(team, "team");
        return new UnitData(unit, team, health);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "UnitData(unit=" + this.unit + ", team=" + this.team + ", health=" + this.health + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.unit.hashCode();
        result = result * 31 + this.team.hashCode();
        result = result * 31 + Float.hashCode(this.health);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnitData)) {
            return false;
        }
        final UnitData unitData = (UnitData)other;
        return Intrinsics.areEqual(this.unit, unitData.unit) && Intrinsics.areEqual(this.team, unitData.team) && Float.compare(this.health, unitData.health) == 0;
    }
}
