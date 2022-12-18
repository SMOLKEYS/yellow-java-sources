/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.gen.Groups
 *  mindustry.gen.Unit
 */
package yellow.type;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mindustry.gen.Groups;
import mindustry.gen.Unit;
import org.jetbrains.annotations.NotNull;
import yellow.game.Spellcaster;
import yellow.type.Spell;

@Metadata(mv={1, 7, 1}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR*\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00020\r0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006'"}, d2={"Lyellow/type/Spell;", "", "()V", "cooldown", "", "getCooldown", "()F", "setCooldown", "(F)V", "cost", "getCost", "setCost", "groupHeal", "", "getGroupHeal", "()Z", "setGroupHeal", "(Z)V", "healWithFract", "getHealWithFract", "setHealWithFract", "healing", "getHealing", "setHealing", "healingByFract", "getHealingByFract", "setHealingByFract", "predicate", "Lkotlin/Function1;", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "getPredicate", "()Lkotlin/jvm/functions/Function1;", "setPredicate", "(Lkotlin/jvm/functions/Function1;)V", "cast", "", "user", "Lyellow/game/Spellcaster;", "yellow-java"})
public class Spell {
    private float healing = 10.0f;
    private float healingByFract;
    private float cooldown = 60.0f;
    private float cost = 27.0f;
    private boolean groupHeal;
    private boolean healWithFract;
    @NotNull
    private Function1<? super Unit, Boolean> predicate = predicate.1.INSTANCE;

    public final float getHealing() {
        return this.healing;
    }

    public final void setHealing(float f) {
        this.healing = f;
    }

    public final float getHealingByFract() {
        return this.healingByFract;
    }

    public final void setHealingByFract(float f) {
        this.healingByFract = f;
    }

    public final float getCooldown() {
        return this.cooldown;
    }

    public final void setCooldown(float f) {
        this.cooldown = f;
    }

    public final float getCost() {
        return this.cost;
    }

    public final void setCost(float f) {
        this.cost = f;
    }

    public final boolean getGroupHeal() {
        return this.groupHeal;
    }

    public final void setGroupHeal(boolean bl) {
        this.groupHeal = bl;
    }

    public final boolean getHealWithFract() {
        return this.healWithFract;
    }

    public final void setHealWithFract(boolean bl) {
        this.healWithFract = bl;
    }

    @NotNull
    public final Function1<Unit, Boolean> getPredicate() {
        return this.predicate;
    }

    public final void setPredicate(@NotNull Function1<? super Unit, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.predicate = function1;
    }

    public final void cast(@NotNull Spellcaster user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (user.getTensionPoints() < this.cost || !(user instanceof Unit)) {
            return;
        }
        Ref.IntRef healedTargets = new Ref.IntRef();
        Groups.unit.each(arg_0 -> Spell.cast$lambda$0(this, healedTargets, user, arg_0));
        if (healedTargets.element != 0) {
            user.removeTensionPoints(this.cost);
        }
    }

    private static final void cast$lambda$0(Spell this$0, Ref.IntRef $healedTargets, Spellcaster $user, Unit it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($healedTargets, "$healedTargets");
        Intrinsics.checkNotNullParameter($user, "$user");
        if (!this$0.groupHeal && $healedTargets.element > 0) {
            return;
        }
        Function1<? super Unit, Boolean> function1 = this$0.predicate;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (function1.invoke((Unit)it).booleanValue() && Intrinsics.areEqual(it.team, ((Unit)$user).team)) {
            if (this$0.healWithFract) {
                it.healFract(this$0.healingByFract);
            } else {
                it.heal(this$0.healing);
            }
            int n = $healedTargets.element;
            $healedTargets.element = n + 1;
        }
    }
}

