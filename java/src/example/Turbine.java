package example;

import ddf.minim.AudioBuffer;
import ie.tudublin.Visual;
import processing.core.PApplet;
import processing.core.*;

public class Turbine extends Visual
{
    float angle = 0;
    float CameraX = 800;
    float CameraY = 1500;
    float CameraZ = 300;

    MyVisual trb;

    public Turbine(MyVisual trb)
    {
        this.trb = trb; 
    }

    public void render()
    {
        trb.translate(width * 5, height * (float) 4.5);
        trb.colorMode(PApplet.HSB);
        trb.lights();
        trb.rotateX(angle);
        trb.rotateY(angle);

        for(int i = 0; i < ab.size(); i++)
        {
            trb.rotateX(50 + ab.get(i) / 100);
            trb.rotateY(50 + ab.get(i) / 100);
            trb.fill(PApplet.map(ab.get(i), 0, 100, 0, 0), 100, 0);
            trb.strokeWeight(1 + ab.get(i));
            trb.stroke(PApplet.map(i, 0, ab.size(), 255, 0), 255, 255);
            trb.ellipse(200, 30, 10 + ab.get(i) * 100, 20);
            trb.ellipse(100, 10, 10, 55 + ab.get(i) * 200);
            trb.box(100 + ab.get(i) * 50, 50, 20);
            trb.box(100, 55 + ab.get(i) * 50, 10);
        }
        angle += 0.01f;
    }
}
