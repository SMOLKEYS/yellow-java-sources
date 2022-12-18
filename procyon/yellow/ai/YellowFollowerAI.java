// 
// Decompiled by Procyon v0.6.0
// 

package yellow.ai;

import yellow.content.YellowUnitTypes;
import mindustry.gen.Unit;
import arc.math.geom.Position;
import arc.util.Time;
import mindustry.gen.Groups;
import arc.math.Mathf;
import mindustry.gen.Building;
import yellow.entities.units.entity.YellowUnitEntity;
import mindustry.entities.units.AIController;

public class YellowFollowerAI extends AIController
{
    protected float dist;
    protected float wavedist;
    protected YellowUnitEntity follow;
    protected Building core;
    
    public YellowFollowerAI() {
        this.dist = 80.0f;
        this.wavedist = 20.0f;
    }
    
    public void init() {
        this.dist = Mathf.random(80.0f, 680.0f);
        this.wavedist = Mathf.random(20.0f, 680.0f);
    }
    
    public void updateMovement() {
        if (this.follow != null && this.follow.dead) {
            this.follow = null;
        }
        Groups.unit.each(e -> {
            if (e.type == YellowUnitTypes.yellow && this.follow == null) {
                final YellowUnitEntity defo = (YellowUnitEntity)e;
                if (defo.team == this.unit.team) {
                    this.follow = defo;
                }
            }
        });
        if (this.follow != null && this.follow.team == this.unit.team) {
            this.circle((Position)this.follow, this.dist + Mathf.absin(Time.time * 0.05f, 20.0f, this.wavedist));
        }
        else if (this.core != null) {
            this.circle((Position)this.core, this.dist + Mathf.absin(Time.time * 0.05f, 20.0f, this.wavedist));
        }
        else {
            this.core = (Building)this.unit.team.data().core();
        }
        this.faceMovement();
    }
}
