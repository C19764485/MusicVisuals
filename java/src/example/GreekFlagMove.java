package example;

import ie.tudublin.Visual;
import processing.core.*;
import example.MyVisual;

public class GreekFlagMove extends Visual
{
    MyVisual grflgmv;
    float angle = 0;

    public GreekFlagMove(MyVisual grflgmv)
    {
        this.grflgmv = grflgmv; 
    }

    public void render() {
        grflgmv.colorMode(RGB);
        lerpedBuffer = new float[width];
        float halfHeight = height / 2;
        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < ab.size(); i++) {
            sum += abs( ab.get(i));
        }
        average = sum / Visual.ab.size();
        // Move lerpedAverage 10% closer to average every frame
        lerpedAverage = lerp(lerpedAverage, average, 0.1f);

        for (int i = 0; i < ab.size(); i++) 
        {
            // grflgmv.rotateY(angle);
            // grflgmv.rotateX(angle);
            grflgmv.noStroke();
            grflgmv.fill(6, 80, 199);
            grflgmv.rect(50, 50 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(255);
            grflgmv.rect(50, 60 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(6, 80, 199);
            grflgmv.rect(50, 70 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(255);
            grflgmv.rect(50, 80 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(6, 80, 199);
            grflgmv.rect(50, 90 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(255);
            grflgmv.rect(50, 100 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(6, 80, 199);
            grflgmv.rect(50, 110 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(255);
            grflgmv.rect(50, 120 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            grflgmv.fill(6, 80, 199);
            grflgmv.rect(50, 130 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            // Cross
            grflgmv.fill(6, 80, 199);
            grflgmv.rect(50, 50 - (ab.get(i) * 30), 50, 50);
            grflgmv.fill(255);
            grflgmv.rect(70, 50 - (ab.get(i) * 30), 10, 50);
            grflgmv.fill(255);
            grflgmv.rect(50, 70 - (ab.get(i) * 30), 50, 10);
        }
        // angle =+ 0.01f;
    }
}
