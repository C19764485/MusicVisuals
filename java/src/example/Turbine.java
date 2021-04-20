package example;

import ddf.minim.AudioBuffer;
import ie.tudublin.Visual;
import processing.core.PApplet;
import processing.core.*;

public class Turbine extends Visual
{
    float angle = 0;

    MyVisual trb;

    public Turbine(MyVisual trb)
    {
        this.trb = trb; 
    }

    public void render()
    {
        trb.translate(width * (float) 4.5, height * (float) 4.5);
        trb.colorMode(PApplet.HSB);
        trb.rotateX(angle);
        trb.rotateY(angle);

        for(int i = 0; i < trb.getAudioBuffer().size(); i++)
        {
            trb.rotateX(50 + trb.getAudioBuffer().get(i) / 100);
            trb.rotateY(50 + trb.getAudioBuffer().get(i) / 100);
            trb.fill(PApplet.map(trb.getAudioBuffer().get(i), 0, 100, 0, 0), 100, 0);
            trb.strokeWeight(1 + trb.getAudioBuffer().get(i));
            trb.stroke(PApplet.map(i, 0, trb.getAudioBuffer().size(), 255, 0), 255, 255);
            trb.ellipse(200, 30, 10 + trb.getAudioBuffer().get(i) * 100, 20);
            trb.ellipse(100, 10, 10, 55 + trb.getAudioBuffer().get(i) * 200);
            trb.box(100 + trb.getAudioBuffer().get(i) * 50, 50, 20);
            trb.box(100, 55 + trb.getAudioBuffer().get(i) * 50, 10);
        }
        angle += 0.01f;
    }
}
