/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  arc.math.Mathf
 *  arc.math.geom.Position
 *  arc.util.Time
 *  mindustry.entities.units.AIController
 *  mindustry.gen.Building
 *  mindustry.gen.Groups
 */
package yellow.ai;

import arc.math.Mathf;
import arc.math.geom.Position;
import arc.util.Time;
import mindustry.entities.units.AIController;
import mindustry.gen.Building;
import mindustry.gen.Groups;
import yellow.content.YellowUnitTypes;
import yellow.entities.units.entity.YellowUnitEntity;

public class YellowFollowerAI
extends AIController {
    protected float dist = 80.0f;
    protected float wavedist = 20.0f;
    protected YellowUnitEntity follow;
    protected Building core;

    public void init() {
        this.dist = Mathf.random((float)80.0f, (float)680.0f);
        this.wavedist = Mathf.random((float)20.0f, (float)680.0f);
    }

    public void updateMovement() {
        if (this.follow != null && this.follow.dead) {
            this.follow = null;
        }
        Groups.unit.each(e -> {
            if (e.type == YellowUnitTypes.yellow && this.follow == null) {
                YellowUnitEntity defo = (YellowUnitEntity)e;
                if (defo.team == this.unit.team) {
                    this.follow = defo;
                }
            }
        });
        if (this.follow != null && this.follow.team == this.unit.team) {
            this.circle((Position)this.follow, this.dist + Mathf.absin((float)(Time.time * 0.05f), (float)20.0f, (float)this.wavedist));
        } else if (this.core != null) {
            this.circle((Position)this.core, this.dist + Mathf.absin((float)(Time.time * 0.05f), (float)20.0f, (float)this.wavedist));
        } else {
            this.core = this.unit.team.data().core();
        }
        this.faceMovement();
    }
}

