package example;

import ie.tudublin.Visual;
import processing.core.PApplet;

public class Flag extends Visual {

    public void flagMovingGreek() {
        colorMode(RGB);
        lerpedBuffer = new float[width];
        float halfHeight = height / 2;
        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < Visual.ab.size(); i++) {
            sum += abs(Visual.ab.get(i));
        }
        average = sum / Visual.ab.size();
        // Move lerpedAverage 10% closer to average every frame
        lerpedAverage = lerp(lerpedAverage, average, 0.1f);

        for (int i = 0; i < ab.size(); i++) {
            noStroke();
            fill(6, 80, 199);
            rect(50, 50 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(255);
            rect(50, 60 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(6, 80, 199);
            rect(50, 70 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(255);
            rect(50, 80 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(6, 80, 199);
            rect(50, 90 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(255);
            rect(50, 100 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(6, 80, 199);
            rect(50, 110 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(255);
            rect(50, 120 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            fill(6, 80, 199);
            rect(50, 130 - (ab.get(i) * 30), 140, (ab.get(i) * 10));
            //Cross
            fill(6, 80, 199);
            rect(50, 50 - (ab.get(i) * 30), 50, 50);
            fill(255);
            rect(70, 50 - (ab.get(i) * 30), 10, 50);
            fill(255);
            rect(50, 70 - (ab.get(i) * 30), 50, 10);
        }
    }

    public void flagMovingIrish() {
        colorMode(RGB);
        lerpedBuffer = new float[width];
        float halfHeight = height / 2;
        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < Visual.ab.size(); i++) {
            sum += abs(Visual.ab.get(i));
        }
        average = sum / Visual.ab.size();
        // Move lerpedAverage 10% closer to average every frame
        lerpedAverage = lerp(lerpedAverage, average, 1f);

        for (int i = 0; i < ab.size(); i++) {
            noStroke();
            fill(15, 105, 16);
            rect(width - 180 - (ab.get(i) * 30), 40, 50, 90);
            fill(255);
            rect(width - 130 - (ab.get(i) * 30), 40, 50, 90);
            fill(196, 100, 4);
            rect(width - 80 - (ab.get(i) * 30), 40, 50, 90);
        }
    }

    public void flagStatic() {
        // Static Greek flag
        noStroke();
        fill(6, 80, 199);
        rect(50, 50, 140, 10);
        fill(255);
        rect(50, 60, 140, 10);
        fill(6, 80, 199);
        rect(50, 70, 140, 10);
        fill(255);
        rect(50, 80, 140, 10);
        fill(6, 80, 199);
        rect(50, 90, 140, 10);
        fill(255);
        rect(50, 100, 140, 10);
        fill(6, 80, 199);
        rect(50, 110, 140, 10);
        fill(255);
        rect(50, 120, 140, 10);
        fill(6, 80, 199);
        rect(50, 130, 140, 10);
        //Cross
        fill(6, 80, 199);
        rect(50, 50, 50, 50);
        fill(255);
        rect(70, 50, 10, 50);
        fill(255);
        rect(50, 70, 50, 10);


        // Static Irish Flag
        noStroke();
        fill(15, 105, 16);
        rect(width - 180, 40, 50, 90);
        fill(255);
        rect(width - 130, 40, 50, 90);
        fill(196, 100, 4);
        rect(width - 80, 40, 50, 90);
    }
}
