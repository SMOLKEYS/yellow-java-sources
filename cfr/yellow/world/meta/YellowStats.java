/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mindustry.world.meta.Stat
 *  mindustry.world.meta.StatCat
 *  mindustry.world.meta.StatUnit
 */
package yellow.world.meta;

import mindustry.world.meta.Stat;
import mindustry.world.meta.StatCat;
import mindustry.world.meta.StatUnit;

public class YellowStats {
    public static final StatCat humanInfo = new StatCat("humanInfo");
    public static final StatUnit yearsOld = new StatUnit("yearsOld");
    public static final StatUnit hp = new StatUnit("hp");
    public static final Stat maxLives = new Stat("maxLives");
    public static final Stat extras = new Stat("extras");
    public static final Stat name = new Stat("name", humanInfo);
    public static final Stat gender = new Stat("gender", humanInfo);
    public static final Stat age = new Stat("age", humanInfo);
    public static final Stat personality = new Stat("personality", humanInfo);
    public static final Stat headpatRating = new Stat("headpatRating", humanInfo);
    public static final Stat loveInterest = new Stat("loveInterest", humanInfo);
    public static final Stat generalAura = new Stat("generalAura", humanInfo);
    public static final Stat likes = new Stat("likes", humanInfo);
    public static final Stat dislikes = new Stat("dislikes", humanInfo);
    public static final Stat itemCapacityAlt = new Stat("itemCapacity");
    public static final Stat weaponsAlt = new Stat("weapons");
    public static final Stat rangeAlt = new Stat("range");
    public static final Stat healing = new Stat("healing");
    public static final Stat healingPercent = new Stat("healingPercent");
    public static final Stat healAllAllies = new Stat("healAllAllies");
}

