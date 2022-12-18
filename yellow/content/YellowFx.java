// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import yellow.entities.effect.RandomEffect;
import arc.graphics.g2d.Fill;
import arc.math.Angles;
import arc.graphics.g2d.Lines;
import arc.util.Time;
import arc.graphics.Color;
import arc.math.Interp;
import mindustry.ui.Fonts;
import arc.graphics.g2d.Draw;
import mindustry.entities.Effect;

public class YellowFx
{
    public static final Effect ghostDespawn;
    public static final Effect ghostDespawn2;
    public static final Effect ghostDespawn3;
    public static final Effect ghostDespawnMulti;
    public static final Effect yellowExplosionOutIn;
    public static final Effect yellowExplosionOut;
    public static final Effect yellowExplosionIn;
    public static final Effect yellowDeathEffect;
    public static final Effect bullethellShootEffect;
    public static final Effect textIndicator;
    
    static {
        ghostDespawn = new Effect(10.0f, e -> {
            Draw.z(110.0f);
            Draw.alpha(e.fout() * 3.0f);
            Lines.stroke(e.fout() * 7.0f);
            Lines.circle(e.x, e.y, e.fin() * 10.0f);
        });
        ghostDespawn2 = new Effect(15.0f, e -> {
            Draw.z(110.0f);
            Draw.alpha(e.fout() * 3.0f);
            Lines.stroke(e.fout() * 7.0f);
            Lines.circle(e.x, e.y, e.fin() * 17.0f);
        });
        ghostDespawn3 = new Effect(15.0f, e -> {
            Draw.z(110.0f);
            Draw.alpha(e.fout() * 3.0f);
            Lines.stroke(e.fout() * 7.0f);
            Lines.circle(e.x, e.y, e.fin() * 23.0f);
        });
        ghostDespawnMulti = new RandomEffect(new Effect[] { YellowFx.ghostDespawn, YellowFx.ghostDespawn2, YellowFx.ghostDespawn3 });
        yellowExplosionOutIn = new Effect(120.0f, e -> {
            Draw.color(Color.yellow);
            Lines.stroke(e.fout() * 15.0f);
            Lines.circle(e.x, e.y, e.fin() * 25.0f);
            Lines.square(e.x, e.y, e.fin() * 50.0f, Time.time * 7.0f);
            Lines.circle(e.x, e.y, e.fin() * 50.0f);
            Lines.square(e.x, e.y, e.fin() * 100.0f, Time.time * 7.0f);
            Lines.circle(e.x, e.y, e.fin() * 25.0f);
            Lines.square(e.x, e.y, e.fin() * 50.0f, -Time.time * 7.0f);
            Lines.circle(e.x, e.y, e.fin() * 50.0f);
            Lines.square(e.x, e.y, e.fin() * 100.0f, -Time.time * 7.0f);
            Lines.stroke(e.fin() * 15.0f);
            Lines.circle(e.x, e.y, e.fout() * 50.0f);
            Lines.square(e.x, e.y, e.fout() * 100.0f, Time.time * 7.0f);
            Lines.circle(e.x, e.y, e.fout() * 75.0f);
            Lines.square(e.x, e.y, e.fout() * 150.0f, -Time.time * 7.0f);
        });
        yellowExplosionOut = new Effect(120.0f, e -> {
            Draw.color(Color.yellow);
            Lines.stroke(e.fout() * 15.0f);
            Lines.circle(e.x, e.y, e.fin() * 25.0f);
            Lines.square(e.x, e.y, e.fin() * 50.0f, Time.time * 9.0f);
            Lines.circle(e.x, e.y, e.fin() * 50.0f);
            Lines.square(e.x, e.y, e.fin() * 100.0f, Time.time * 9.0f);
            Lines.circle(e.x, e.y, e.fin() * 25.0f);
            Lines.square(e.x, e.y, e.fin() * 50.0f, -Time.time * 9.0f);
            Lines.circle(e.x, e.y, e.fin() * 50.0f);
            Lines.square(e.x, e.y, e.fin() * 100.0f, -Time.time * 9.0f);
        });
        yellowExplosionIn = new Effect(120.0f, e -> {
            Draw.color(Color.yellow);
            Lines.stroke(e.fin() * 15.0f);
            Lines.circle(e.x, e.y, e.fout() * 25.0f);
            Lines.square(e.x, e.y, e.fout() * 50.0f, Time.time * 9.0f);
            Lines.circle(e.x, e.y, e.fout() * 50.0f);
            Lines.square(e.x, e.y, e.fout() * 100.0f, Time.time * 9.0f);
            Lines.circle(e.x, e.y, e.fout() * 25.0f);
            Lines.square(e.x, e.y, e.fout() * 50.0f, -Time.time * 9.0f);
            Lines.circle(e.x, e.y, e.fout() * 50.0f);
            Lines.square(e.x, e.y, e.fout() * 100.0f, -Time.time * 9.0f);
        });
        yellowDeathEffect = new Effect(210.0f, e -> {
            Draw.color(Color.yellow, Color.orange, e.finpow());
            Lines.stroke(e.fout() * 5.0f);
            Lines.square(e.x, e.y, e.finpow() * 90.0f, e.finpow() * 180.0f);
            Lines.square(e.x, e.y, e.finpow() * 90.0f, e.foutpow() * 180.0f);
            Lines.circle(e.x, e.y, e.finpow() * 130.0f);
            Lines.circle(e.x, e.y, e.finpow() * 120.0f);
            Lines.circle(e.x, e.y, e.finpow() * 110.0f);
            Angles.randLenVectors((long)e.id, 50, e.finpow() * 100.0f, (x, y) -> {
                Lines.stroke(1.0f);
                Draw.color(Color.yellow, Color.orange, e.finpow());
                Fill.circle(e.x + x, e.y + y, e.fout() * 10.0f);
            });
            Draw.alpha(e.fout() * 4.0f);
            Draw.rect("yellow-java-yellow", e.x, e.y, e.finpow() * 200.0f, e.finpow() * 200.0f);
        });
        bullethellShootEffect = new Effect(60.0f, e -> {
            Draw.z(110.001f);
            Draw.color(Color.white);
            Draw.alpha(e.fout());
            Lines.square(e.x, e.y, 40.0f, Time.time * 6.0f);
            Lines.square(e.x, e.y, 40.0f, -Time.time * 6.0f);
            Lines.square(e.x, e.y, 80.0f, Time.time * 6.0f);
            Lines.square(e.x, e.y, 80.0f, -Time.time * 6.0f);
            Lines.stroke(10.0f);
            Lines.poly(e.x, e.y, 3, e.fin((Interp)Interp.pow5Out) * 130.0f, Time.time * 6.0f);
            Lines.poly(e.x, e.y, 3, e.fin((Interp)Interp.pow5Out) * 130.0f, Time.time * 6.0f - 180.0f);
        });
        textIndicator = new Effect(25.0f, e -> {
            if (!(e.data instanceof String)) {
                return;
            }
            Draw.z(115.0f);
            Fonts.def.draw((CharSequence)(String)e.data, e.x, e.y + e.fin((Interp)Interp.pow3Out) * 15.0f);
        });
    }
}
