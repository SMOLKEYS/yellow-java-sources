// 
// Decompiled by Procyon v0.6.0
// 

package kotmindy.mindustry.events;

import kotmindy.arc.events.ArcEventUtilsKt;
import mindustry.game.EventType$Trigger;
import kotlin.jvm.functions.Function0;
import mindustry.game.EventType$TapEvent;
import mindustry.game.EventType$DepositEvent;
import mindustry.game.EventType$WithdrawEvent;
import mindustry.game.EventType$UnitControlEvent;
import mindustry.game.EventType$UnitCreateEvent;
import mindustry.game.EventType$UnitDestroyEvent;
import mindustry.game.EventType$BlockBuildEndEvent;
import mindustry.game.EventType$BlockBuildBeginEvent;
import mindustry.game.EventType$BlockDestroyEvent;
import mindustry.game.EventType$SectorLaunchEvent;
import mindustry.game.EventType$LaunchItemEvent;
import mindustry.game.EventType$SectorInvasionEvent;
import mindustry.game.EventType$SectorLoseEvent;
import mindustry.game.EventType$SaveLoadEvent;
import mindustry.game.EventType$WorldLoadEndEvent;
import mindustry.game.EventType$WorldLoadBeginEvent;
import mindustry.game.EventType$WorldLoadEvent;
import mindustry.game.EventType$FileTreeInitEvent;
import mindustry.game.EventType$MusicRegisterEvent;
import mindustry.game.EventType$ClientLoadEvent;
import mindustry.game.EventType$ContentInitEvent;
import mindustry.game.EventType$BlockInfoEvent;
import mindustry.game.EventType$CoreItemDeliverEvent;
import mindustry.game.EventType$TurretAmmoDeliverEvent;
import mindustry.game.EventType$LineConfirmEvent;
import mindustry.game.EventType$TurnEvent;
import mindustry.game.EventType$WaveEvent;
import mindustry.game.EventType$HostEvent;
import mindustry.game.EventType$ResetEvent;
import mindustry.game.EventType$PlayEvent;
import mindustry.game.EventType$DisposeEvent;
import mindustry.game.EventType$ServerLoadEvent;
import mindustry.game.EventType$ClientCreateEvent;
import mindustry.game.EventType$SaveWriteEvent;
import mindustry.game.EventType$MapPublishEvent;
import mindustry.game.EventType$MapMakeEvent;
import mindustry.game.EventType$ResizeEvent;
import mindustry.game.EventType$LoseEvent;
import arc.Events;
import kotmindy.arc.events.ArcEventUtilsKt$listen;
import arc.func.Cons;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Unit;
import mindustry.game.EventType$WinEvent;
import kotlin.jvm.functions.Function1;
import kotlin.Metadata;

@Metadata(mv = { 1, 7, 1 }, k = 2, xi = 48, d1 = { "\u0000\u0086\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\b\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\n\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\f\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u000e\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0010\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0012\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0016\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0018\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u001a\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010 \u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\"\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010$\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010&\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u0018\u0010(\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010)j\u0002`*\u001a\u0018\u0010+\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010)j\u0002`*\u001a\u001f\u0010,\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010.\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u00100\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u00102\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u00104\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u00106\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u00108\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010:\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010<\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010>\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010@\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010B\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010D\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010F\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010H\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010J\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010L\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010N\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010P\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010R\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010T\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¨\u0006V" }, d2 = { "blockBuildBegin", "", "cons", "Lkotlin/Function1;", "Lmindustry/game/EventType$BlockBuildBeginEvent;", "Lkotlin/ExtensionFunctionType;", "blockBuildEnd", "Lmindustry/game/EventType$BlockBuildEndEvent;", "blockDestroy", "Lmindustry/game/EventType$BlockDestroyEvent;", "blockInfo", "Lmindustry/game/EventType$BlockInfoEvent;", "clientCreate", "Lmindustry/game/EventType$ClientCreateEvent;", "clientLoad", "Lmindustry/game/EventType$ClientLoadEvent;", "contentInit", "Lmindustry/game/EventType$ContentInitEvent;", "coreItemDeliver", "Lmindustry/game/EventType$CoreItemDeliverEvent;", "deposit", "Lmindustry/game/EventType$DepositEvent;", "dispose", "Lmindustry/game/EventType$DisposeEvent;", "fileTreeInit", "Lmindustry/game/EventType$FileTreeInitEvent;", "host", "Lmindustry/game/EventType$HostEvent;", "launchItem", "Lmindustry/game/EventType$LaunchItemEvent;", "lineConfirm", "Lmindustry/game/EventType$LineConfirmEvent;", "lose", "Lmindustry/game/EventType$LoseEvent;", "mapMake", "Lmindustry/game/EventType$MapMakeEvent;", "mapPublish", "Lmindustry/game/EventType$MapPublishEvent;", "musicRegister", "Lmindustry/game/EventType$MusicRegisterEvent;", "onDraw", "Lkotlin/Function0;", "Lkotmindy/BlankRun;", "onUpdate", "play", "Lmindustry/game/EventType$PlayEvent;", "reset", "Lmindustry/game/EventType$ResetEvent;", "resize", "Lmindustry/game/EventType$ResizeEvent;", "saveLoad", "Lmindustry/game/EventType$SaveLoadEvent;", "saveWrite", "Lmindustry/game/EventType$SaveWriteEvent;", "sectorInvasion", "Lmindustry/game/EventType$SectorInvasionEvent;", "sectorLaunch", "Lmindustry/game/EventType$SectorLaunchEvent;", "sectorLose", "Lmindustry/game/EventType$SectorLoseEvent;", "serverLoad", "Lmindustry/game/EventType$ServerLoadEvent;", "tap", "Lmindustry/game/EventType$TapEvent;", "turn", "Lmindustry/game/EventType$TurnEvent;", "turretAmmoDeliver", "Lmindustry/game/EventType$TurretAmmoDeliverEvent;", "unitControl", "Lmindustry/game/EventType$UnitControlEvent;", "unitCreate", "Lmindustry/game/EventType$UnitCreateEvent;", "unitDestroy", "Lmindustry/game/EventType$UnitDestroyEvent;", "wave", "Lmindustry/game/EventType$WaveEvent;", "win", "Lmindustry/game/EventType$WinEvent;", "withdraw", "Lmindustry/game/EventType$WithdrawEvent;", "worldLoad", "Lmindustry/game/EventType$WorldLoadEvent;", "worldLoadBegin", "Lmindustry/game/EventType$WorldLoadBeginEvent;", "worldLoadEnd", "Lmindustry/game/EventType$WorldLoadEndEvent;", "lib" })
public final class MindustryEventUtilsKt
{
    public static final void win(@NotNull final Function1<? super EventType$WinEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$WinEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void lose(@NotNull final Function1<? super EventType$LoseEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$LoseEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void resize(@NotNull final Function1<? super EventType$ResizeEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$ResizeEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void mapMake(@NotNull final Function1<? super EventType$MapMakeEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$MapMakeEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void mapPublish(@NotNull final Function1<? super EventType$MapPublishEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$MapPublishEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void saveWrite(@NotNull final Function1<? super EventType$SaveWriteEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$SaveWriteEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void clientCreate(@NotNull final Function1<? super EventType$ClientCreateEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$ClientCreateEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void serverLoad(@NotNull final Function1<? super EventType$ServerLoadEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$ServerLoadEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void dispose(@NotNull final Function1<? super EventType$DisposeEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$DisposeEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void play(@NotNull final Function1<? super EventType$PlayEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$PlayEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void reset(@NotNull final Function1<? super EventType$ResetEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$ResetEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void host(@NotNull final Function1<? super EventType$HostEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$HostEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void wave(@NotNull final Function1<? super EventType$WaveEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$WaveEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void turn(@NotNull final Function1<? super EventType$TurnEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$TurnEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void lineConfirm(@NotNull final Function1<? super EventType$LineConfirmEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$LineConfirmEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void turretAmmoDeliver(@NotNull final Function1<? super EventType$TurretAmmoDeliverEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$TurretAmmoDeliverEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void coreItemDeliver(@NotNull final Function1<? super EventType$CoreItemDeliverEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$CoreItemDeliverEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void blockInfo(@NotNull final Function1<? super EventType$BlockInfoEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$BlockInfoEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void contentInit(@NotNull final Function1<? super EventType$ContentInitEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$ContentInitEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void clientLoad(@NotNull final Function1<? super EventType$ClientLoadEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$ClientLoadEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void musicRegister(@NotNull final Function1<? super EventType$MusicRegisterEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$MusicRegisterEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void fileTreeInit(@NotNull final Function1<? super EventType$FileTreeInitEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$FileTreeInitEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void worldLoad(@NotNull final Function1<? super EventType$WorldLoadEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$WorldLoadEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void worldLoadBegin(@NotNull final Function1<? super EventType$WorldLoadBeginEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$WorldLoadBeginEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void worldLoadEnd(@NotNull final Function1<? super EventType$WorldLoadEndEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$WorldLoadEndEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void saveLoad(@NotNull final Function1<? super EventType$SaveLoadEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$SaveLoadEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void sectorLose(@NotNull final Function1<? super EventType$SectorLoseEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$SectorLoseEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void sectorInvasion(@NotNull final Function1<? super EventType$SectorInvasionEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$SectorInvasionEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void launchItem(@NotNull final Function1<? super EventType$LaunchItemEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$LaunchItemEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void sectorLaunch(@NotNull final Function1<? super EventType$SectorLaunchEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$SectorLaunchEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void blockDestroy(@NotNull final Function1<? super EventType$BlockDestroyEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$BlockDestroyEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void blockBuildBegin(@NotNull final Function1<? super EventType$BlockBuildBeginEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$BlockBuildBeginEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void blockBuildEnd(@NotNull final Function1<? super EventType$BlockBuildEndEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$BlockBuildEndEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void unitDestroy(@NotNull final Function1<? super EventType$UnitDestroyEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$UnitDestroyEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void unitCreate(@NotNull final Function1<? super EventType$UnitCreateEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$UnitCreateEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void unitControl(@NotNull final Function1<? super EventType$UnitControlEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$UnitControlEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void withdraw(@NotNull final Function1<? super EventType$WithdrawEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$WithdrawEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void deposit(@NotNull final Function1<? super EventType$DepositEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$DepositEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void tap(@NotNull final Function1<? super EventType$TapEvent, Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        final int $i$f$listen = 0;
        Events.on((Class)EventType$TapEvent.class, (Cons)new Cons(cons) {
            public final void get(final T it) {
                this.$cons.invoke(it);
            }
        });
    }
    
    public static final void onUpdate(@NotNull final Function0<Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        ArcEventUtilsKt.listenTrigger(EventType$Trigger.update, cons);
    }
    
    public static final void onDraw(@NotNull final Function0<Unit> cons) {
        Intrinsics.checkNotNullParameter(cons, "cons");
        ArcEventUtilsKt.listenTrigger(EventType$Trigger.draw, cons);
    }
}
