package c19764485;

// import java.util.ArrayList;
import ie.tudublin.Visual;
import processing.core.PApplet;

public class MovingObjects extends Visual
{
    float x, y, w, dx, dy;

    MyVisual mvobjs;
    float angle = 0;
    float x1 = 300;
    float y1 = 400;

    public MovingObjects(MyVisual mvobjs) 
    {
        this.mvobjs = mvobjs;
    }

    void render()
    {
        mvobjs.translate(width * 5, height * 5);
        mvobjs.colorMode(PApplet.HSB);
        // mvobjs.strokeWeight(1);

        for(int i = 0; i < 255; i++)
        {
            float c = map(i, 0, 255, 0, 255);
            // mvobjs.stroke(c, 255, 255);
            // mvobjs.noFill();
            mvobjs.noStroke();
            mvobjs.fill(c, 255, 255);
            mvobjs.rotate(radians(10));
            mvobjs.ellipse(width * 2, getSmoothedAmplitude() * 400, ab.get(i) * 500, ab.get(i) * height);
            mvobjs.triangle(ab.get(i) * lerpedAverage, ab.get(i) * 100, ab.get(i) * 500, 20, ab.get(i) * lerpedAverage, ab.get(i) * 20);
        }
    }
}