package example;

import ie.tudublin.Visual;
import processing.core.*;
import example.MyVisual;


public class IrishFlagMove extends Visual
{
    MyVisual irsflgmv;

    public IrishFlagMove(MyVisual irsflgmv)
    {
        this.irsflgmv = irsflgmv; 
    }

    public void render()
    {
        irsflgmv.colorMode(RGB);
        lerpedBuffer = new float[width];
        float halfHeight = height / 2;
        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < ab.size(); i++) {
            sum += abs(ab.get(i));
        }
        average = sum / Visual.ab.size();
        // Move lerpedAverage 10% closer to average every frame
        lerpedAverage = lerp(lerpedAverage, average, 1f);

        for (int i = 0; i < ab.size(); i++) {
            irsflgmv.noStroke();
            irsflgmv.fill(15, 105, 16);
            irsflgmv.rect(800 - (ab.get(i) * 30), 40, 50, 90);
            irsflgmv.fill(255);
            irsflgmv.rect(850 - (ab.get(i) * 30), 40, 50, 90);
            irsflgmv.fill(196, 100, 4);
            irsflgmv.rect(900 - (ab.get(i) * 30), 40, 50, 90);
        }
    }
}
