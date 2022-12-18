// 
// Decompiled by Procyon v0.6.0
// 

package yellow.content;

import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.Pal;
import mindustry.graphics.g3d.GenericMesh;
import yellow.maps.planet.AzenoPlanetGenerator;
import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.type.Planet;

public class YellowPlanets
{
    public static Planet azeno;
    
    public static void load() {
        YellowPlanets.azeno = new Planet("azeno", Planets.sun, 1.3f, 3) {
            {
                this.accessible = true;
                this.alwaysUnlocked = true;
                this.atmosphereColor = Color.gray;
                this.atmosphereRadIn = 0.01f;
                this.atmosphereRadOut = 0.28f;
                this.orbitTime = 600.0f;
                this.startSector = 27;
                this.generator = new AzenoPlanetGenerator();
                this.landCloudColor = Color.yellow.cpy().a(0.3f);
                this.meshLoader = (() -> new HexMesh((Planet)this, 5));
                this.cloudMeshLoader = (() -> new MultiMesh(new GenericMesh[] { (GenericMesh)new HexSkyMesh((Planet)this, 11, 0.15f, 0.13f, 5, new Color().set(Pal.accent).mul(0.8f).a(0.65f), 2, 0.45f, 0.9f, 0.38f), (GenericMesh)new HexSkyMesh((Planet)this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Pal.accent, 0.55f).a(0.65f), 3, 0.46f, 1.0f, 0.41f) }));
            }
        };
    }
}
