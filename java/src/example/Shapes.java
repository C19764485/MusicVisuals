package example;

import ddf.minim.AudioBuffer;
import ie.tudublin.Visual;
import processing.core.PApplet;
import processing.core.*;

public class Shapes extends Visual
{  
    MyVisual shp;
    float wave = sin(radians(frameCount));
    float w = wave * map(mouseX, 0, height, 2500, 0);
    float angle = 0;

    public Shapes(MyVisual shp)
    {
        this.shp = shp; 
    } 

    public void render()
    {
        shp.translate(width * 5, height * 4);
        shp.colorMode(PApplet.HSB);
        shp.strokeWeight(2);
        // noFill();

        for (int i = 0; i < 255; i++)
        {
            float c = map(i, 0, 255, 0, 255);
            shp.stroke(c, 255, 255);
            shp.rotate(angle / 3);
            shp.line(850, i - w / 2, -850, i++);
            shp.line(-850, i + w, -850, i++);
            shp.line(-850, i - w, -850, i++);    
        }
        angle += 0.01f;
    }
}
