// 
// Decompiled by Procyon v0.6.0
// 

package yellow.type;

import mindustry.gen.Groups;
import kotlin.jvm.internal.Ref;
import yellow.game.Spellcaster;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import mindustry.gen.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.Metadata;

@Metadata(mv = { 1, 8, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR*\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00020\r0\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'" }, d2 = { "Lyellow/type/Spell;", "", "()V", "cooldown", "", "getCooldown", "()F", "setCooldown", "(F)V", "cost", "getCost", "setCost", "groupHeal", "", "getGroupHeal", "()Z", "setGroupHeal", "(Z)V", "healWithFract", "getHealWithFract", "setHealWithFract", "healing", "getHealing", "setHealing", "healingByFract", "getHealingByFract", "setHealingByFract", "predicate", "Lkotlin/Function1;", "Lmindustry/gen/Unit;", "Lkotmindy/mindustry/MUnit;", "getPredicate", "()Lkotlin/jvm/functions/Function1;", "setPredicate", "(Lkotlin/jvm/functions/Function1;)V", "cast", "", "user", "Lyellow/game/Spellcaster;", "yellow-java" })
public class Spell
{
    private float healing;
    private float healingByFract;
    private float cooldown;
    private float cost;
    private boolean groupHeal;
    private boolean healWithFract;
    @NotNull
    private Function1<? super Unit, Boolean> predicate;
    
    public Spell() {
        this.healing = 10.0f;
        this.cooldown = 60.0f;
        this.cost = 27.0f;
        this.predicate = (Function1)Spell$predicate.Spell$predicate$1.INSTANCE;
    }
    
    public final float getHealing() {
        return this.healing;
    }
    
    public final void setHealing(final float <set-?>) {
        this.healing = <set-?>;
    }
    
    public final float getHealingByFract() {
        return this.healingByFract;
    }
    
    public final void setHealingByFract(final float <set-?>) {
        this.healingByFract = <set-?>;
    }
    
    public final float getCooldown() {
        return this.cooldown;
    }
    
    public final void setCooldown(final float <set-?>) {
        this.cooldown = <set-?>;
    }
    
    public final float getCost() {
        return this.cost;
    }
    
    public final void setCost(final float <set-?>) {
        this.cost = <set-?>;
    }
    
    public final boolean getGroupHeal() {
        return this.groupHeal;
    }
    
    public final void setGroupHeal(final boolean <set-?>) {
        this.groupHeal = <set-?>;
    }
    
    public final boolean getHealWithFract() {
        return this.healWithFract;
    }
    
    public final void setHealWithFract(final boolean <set-?>) {
        this.healWithFract = <set-?>;
    }
    
    @NotNull
    public final Function1<Unit, Boolean> getPredicate() {
        return (Function1<Unit, Boolean>)this.predicate;
    }
    
    public final void setPredicate(@NotNull final Function1<? super Unit, Boolean> <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.predicate = <set-?>;
    }
    
    public final void cast(@NotNull final Spellcaster user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (user.getTensionPoints() < this.cost || !(user instanceof Unit)) {
            return;
        }
        final Ref.IntRef healedTargets = new Ref.IntRef();
        Groups.unit.each(Spell::cast$lambda$0);
        if (healedTargets.element != 0) {
            user.removeTensionPoints(this.cost);
        }
    }
    
    private static final void cast$lambda$0(final Spell this$0, final Ref.IntRef $healedTargets, final Spellcaster $user, final Unit it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($healedTargets, "$healedTargets");
        Intrinsics.checkNotNullParameter($user, "$user");
        if (!this$0.groupHeal && $healedTargets.element > 0) {
            return;
        }
        final Function1<? super Unit, Boolean> predicate = this$0.predicate;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (Boolean.valueOf(predicate.invoke(it)) && Intrinsics.areEqual(it.team, ((Unit)$user).team)) {
            if (this$0.healWithFract) {
                it.healFract(this$0.healingByFract);
            }
            else {
                it.heal(this$0.healing);
            }
            ++$healedTargets.element;
        }
    }
}
