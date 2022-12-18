// 
// Decompiled by Procyon v0.6.0
// 

package yellow.world.meta;

import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;
import mindustry.world.meta.StatCat;

public class YellowStats
{
    public static final StatCat humanInfo;
    public static final StatUnit yearsOld;
    public static final StatUnit hp;
    public static final Stat maxLives;
    public static final Stat extras;
    public static final Stat name;
    public static final Stat gender;
    public static final Stat age;
    public static final Stat personality;
    public static final Stat headpatRating;
    public static final Stat loveInterest;
    public static final Stat generalAura;
    public static final Stat likes;
    public static final Stat dislikes;
    public static final Stat itemCapacityAlt;
    public static final Stat weaponsAlt;
    public static final Stat rangeAlt;
    public static final Stat healing;
    public static final Stat healingPercent;
    public static final Stat healAllAllies;
    
    static {
        humanInfo = new StatCat("humanInfo");
        yearsOld = new StatUnit("yearsOld");
        hp = new StatUnit("hp");
        maxLives = new Stat("maxLives");
        extras = new Stat("extras");
        name = new Stat("name", YellowStats.humanInfo);
        gender = new Stat("gender", YellowStats.humanInfo);
        age = new Stat("age", YellowStats.humanInfo);
        personality = new Stat("personality", YellowStats.humanInfo);
        headpatRating = new Stat("headpatRating", YellowStats.humanInfo);
        loveInterest = new Stat("loveInterest", YellowStats.humanInfo);
        generalAura = new Stat("generalAura", YellowStats.humanInfo);
        likes = new Stat("likes", YellowStats.humanInfo);
        dislikes = new Stat("dislikes", YellowStats.humanInfo);
        itemCapacityAlt = new Stat("itemCapacity");
        weaponsAlt = new Stat("weapons");
        rangeAlt = new Stat("range");
        healing = new Stat("healing");
        healingPercent = new Stat("healingPercent");
        healAllAllies = new Stat("healAllAllies");
    }
}
