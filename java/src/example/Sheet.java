package example;

import ddf.minim.AudioBuffer;
import ie.tudublin.Visual;
import processing.core.PApplet;
import processing.core.*;

public class Sheet extends Visual
{
    MyVisual sht;
    float angle = 0;

    public Sheet(MyVisual sht)
    {
        this.sht = sht; 
    }

    public void render()
    {
        sht.translate(width / 2, height / 2);
        sht.colorMode(PApplet.RGB);
        int w = 1000;
        int h = 1000;
        int scl = 20;
        int cols = w / scl;
        int rows = h / scl;

        sht.noFill();
        // sht.translate(width * (float) 2.3, height * 3);
        sht.rotateX(angle);
        sht.rotateY(angle);
        
        for(int i = 0; i < 255; i++)
        {
            float c = map(i, 0, ab.size(), 0, 255); //This doesn't seem to work correctly
            // sht.stroke(0, 134, 255);
            sht.stroke(c, 255, 255);
        }

        for(int x = 0; x < cols; x++)
        {
            sht.beginShape(TRIANGLE_STRIP);
            for(int y = 0; y < rows; y++)
            {
                
                sht.vertex(x * scl, y * scl, ab.get(x) * 300);
                sht.vertex(x * scl, (y + 1) * scl, ab.get(y) * 300);
            }
            sht.endShape(CLOSE);
        }
        angle += 0.002f;
    }
}
