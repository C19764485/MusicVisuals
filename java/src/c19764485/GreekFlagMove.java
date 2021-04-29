package c19764485;

import ie.tudublin.Visual;
import processing.core.*;
import c19764485.MyVisual;

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
            grflgmv.noStroke();
            grflgmv.fill(6, 80, 199);
            grflgmv.rect((width * 3) + 50, (height * 3) + 50 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(255);
            grflgmv.rect((width * 3) + 50, (height * 3) + 70 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(6, 80, 199);
            grflgmv.rect((width * 3) + 50, (height * 3) + 90 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(255);
            grflgmv.rect((width * 3) + 50, (height * 3) + 110 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(6, 80, 199);
            grflgmv.rect((width * 3) + 50, (height * 3) + 130 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(255);
            grflgmv.rect((width * 3) + 50, (height * 3) + 150 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(6, 80, 199);
            grflgmv.rect((width * 3) + 50, (height * 3) + 170 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(255);
            grflgmv.rect((width * 3) + 50, (height * 3) + 190 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            grflgmv.fill(6, 80, 199);
            grflgmv.rect((width * 3) + 50, (height * 3) + 210 - (ab.get(i) * 80), (ab.get(i) * 80) + 270, 20);
            // White Cross
            grflgmv.fill(6, 80, 199);
            grflgmv.rect((width * 3) + 50, (height * 3) + 50 - (ab.get(i) * 80), 80, 80);
            grflgmv.fill(255);
            grflgmv.rect((width * 3) + 80, (height * 3) + 50 - (ab.get(i) * 80), 20, 100);
            grflgmv.fill(255);
            grflgmv.rect((width * 3) + 50, (height * 3) + 90 - (ab.get(i) * 80), 80, 20);

            // grflgmv.noStroke();
            // grflgmv.fill(6, 80, 199);
            // grflgmv.rect(50, 50 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(255);
            // grflgmv.rect(50, 60 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(6, 80, 199);
            // grflgmv.rect(50, 70 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(255);
            // grflgmv.rect(50, 80 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(6, 80, 199);
            // grflgmv.rect(50, 90 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(255);
            // grflgmv.rect(50, 100 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(6, 80, 199);
            // grflgmv.rect(50, 110 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(255);
            // grflgmv.rect(50, 120 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // grflgmv.fill(6, 80, 199);
            // grflgmv.rect(50, 130 - (ab.get(i) * 30), (ab.get(i) * 40) + 140, 10);
            // // White Cross
            // grflgmv.fill(6, 80, 199);
            // grflgmv.rect(50, 50 - (ab.get(i) * 30), 50, 50);
            // grflgmv.fill(255);
            // grflgmv.rect(70, 50 - (ab.get(i) * 30), 10, 50);
            // grflgmv.fill(255);
            // grflgmv.rect(50, 70 - (ab.get(i) * 30), 50, 10);
        }
    }
}
