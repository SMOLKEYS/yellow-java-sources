/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.graphics.Color
 *  arc.graphics.g2d.Draw
 *  arc.graphics.g2d.Fill
 *  arc.graphics.g2d.Lines
 *  arc.math.Angles
 *  arc.math.Interp
 *  arc.util.Time
 *  mindustry.entities.Effect
 *  mindustry.ui.Fonts
 */
package yellow.content;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.math.Angles;
import arc.math.Interp;
import arc.util.Time;
import mindustry.entities.Effect;
import mindustry.ui.Fonts;
import yellow.entities.effect.RandomEffect;

public class YellowFx {
    public static final Effect ghostDespawn = new Effect(10.0f, e -> {
        Draw.z((float)110.0f);
        Draw.alpha((float)(e.fout() * 3.0f));
        Lines.stroke((float)(e.fout() * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 10.0f));
    });
    public static final Effect ghostDespawn2 = new Effect(15.0f, e -> {
        Draw.z((float)110.0f);
        Draw.alpha((float)(e.fout() * 3.0f));
        Lines.stroke((float)(e.fout() * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 17.0f));
    });
    public static final Effect ghostDespawn3 = new Effect(15.0f, e -> {
        Draw.z((float)110.0f);
        Draw.alpha((float)(e.fout() * 3.0f));
        Lines.stroke((float)(e.fout() * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 23.0f));
    });
    public static final Effect ghostDespawnMulti = new RandomEffect(ghostDespawn, ghostDespawn2, ghostDespawn3);
    public static final Effect yellowExplosionOutIn = new Effect(120.0f, e -> {
        Draw.color((Color)Color.yellow);
        Lines.stroke((float)(e.fout() * 15.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 25.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 50.0f), (float)(Time.time * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 100.0f), (float)(Time.time * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 25.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 50.0f), (float)(-Time.time * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 100.0f), (float)(-Time.time * 7.0f));
        Lines.stroke((float)(e.fin() * 15.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fout() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fout() * 100.0f), (float)(Time.time * 7.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fout() * 75.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fout() * 150.0f), (float)(-Time.time * 7.0f));
    });
    public static final Effect yellowExplosionOut = new Effect(120.0f, e -> {
        Draw.color((Color)Color.yellow);
        Lines.stroke((float)(e.fout() * 15.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 25.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 50.0f), (float)(Time.time * 9.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 100.0f), (float)(Time.time * 9.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 25.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 50.0f), (float)(-Time.time * 9.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fin() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fin() * 100.0f), (float)(-Time.time * 9.0f));
    });
    public static final Effect yellowExplosionIn = new Effect(120.0f, e -> {
        Draw.color((Color)Color.yellow);
        Lines.stroke((float)(e.fin() * 15.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fout() * 25.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fout() * 50.0f), (float)(Time.time * 9.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fout() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fout() * 100.0f), (float)(Time.time * 9.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fout() * 25.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fout() * 50.0f), (float)(-Time.time * 9.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.fout() * 50.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.fout() * 100.0f), (float)(-Time.time * 9.0f));
    });
    public static final Effect yellowDeathEffect = new Effect(210.0f, e -> {
        Draw.color((Color)Color.yellow, (Color)Color.orange, (float)e.finpow());
        Lines.stroke((float)(e.fout() * 5.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.finpow() * 90.0f), (float)(e.finpow() * 180.0f));
        Lines.square((float)e.x, (float)e.y, (float)(e.finpow() * 90.0f), (float)(e.foutpow() * 180.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.finpow() * 130.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.finpow() * 120.0f));
        Lines.circle((float)e.x, (float)e.y, (float)(e.finpow() * 110.0f));
        Angles.randLenVectors((long)e.id, (int)50, (float)(e.finpow() * 100.0f), (x, y) -> {
            Lines.stroke((float)1.0f);
            Draw.color((Color)Color.yellow, (Color)Color.orange, (float)e.finpow());
            Fill.circle((float)(e.x + x), (float)(e.y + y), (float)(e.fout() * 10.0f));
        });
        Draw.alpha((float)(e.fout() * 4.0f));
        Draw.rect((String)"yellow-java-yellow", (float)e.x, (float)e.y, (float)(e.finpow() * 200.0f), (float)(e.finpow() * 200.0f));
    });
    public static final Effect bullethellShootEffect = new Effect(60.0f, e -> {
        Draw.z((float)110.001f);
        Draw.color((Color)Color.white);
        Draw.alpha((float)e.fout());
        Lines.square((float)e.x, (float)e.y, (float)40.0f, (float)(Time.time * 6.0f));
        Lines.square((float)e.x, (float)e.y, (float)40.0f, (float)(-Time.time * 6.0f));
        Lines.square((float)e.x, (float)e.y, (float)80.0f, (float)(Time.time * 6.0f));
        Lines.square((float)e.x, (float)e.y, (float)80.0f, (float)(-Time.time * 6.0f));
        Lines.stroke((float)10.0f);
        Lines.poly((float)e.x, (float)e.y, (int)3, (float)(e.fin((Interp)Interp.pow5Out) * 130.0f), (float)(Time.time * 6.0f));
        Lines.poly((float)e.x, (float)e.y, (int)3, (float)(e.fin((Interp)Interp.pow5Out) * 130.0f), (float)(Time.time * 6.0f - 180.0f));
    });
    public static final Effect textIndicator = new Effect(25.0f, e -> {
        if (!(e.data instanceof String)) {
            return;
        }
        Draw.z((float)115.0f);
        Fonts.def.draw((CharSequence)((String)e.data), e.x, e.y + e.fin((Interp)Interp.pow3Out) * 15.0f);
    });
}

