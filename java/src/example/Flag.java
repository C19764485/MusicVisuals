package example;

import ie.tudublin.Visual;
import processing.core.PApplet;

public class Flag extends Visual {

    public void flag() 
	{
		colorMode(RGB);
		Visual.lerpedBuffer = new float[width];
		float halfHeight = height / 2;
        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < Visual.ab.size(); i ++)
        {
            sum += abs(Visual.ab.get(i));
        }
        average = sum / Visual.ab.size();
        // Move lerpedAverage 10% closer to average every frame
        Visual.lerpedAverage = lerp(Visual.lerpedAverage, average, 0.1f);

		for (int i = 0; i < Visual.ab.size(); i++) 
		{
			fill(6, 80, 199);
			rect(100, 50, 120, 10);
			fill(255);
			rect(100, 60, 120, 10);
			fill(6, 80, 199);
			rect(100, 70, 120, 10);
			fill(255);
			rect(100, 80, 120, 10);
			fill(6, 80, 199);
			rect(100, 90, 120, 10);
			fill(255);
			rect(100, 100, 120, 10);
			fill(6, 80, 199);
			rect(100, 110, 120, 10);
			fill(255);
			rect(100, 120, 120, 10);
			fill(6, 80, 199);
			rect(100, 130, 120, 10);
			fill(6, 80, 199);
			rect(100, 50, 50, 50);
			fill(255);
			rect(120, 50, 10, 50);
			fill(255);
			rect(100, 70, 50, 10);
			Visual.lerpedBuffer[i] = lerp(Visual.lerpedBuffer[i], Visual.ab.get(i), 0.1f);
		}

		//Static Greek flag
        noStroke();
		fill(6, 80, 199);
		rect(50, 50, 130, 10);
		fill(255);
		rect(50, 60, 130, 10);
		fill(6, 80, 199);
		rect(50, 70, 130, 10);
		fill(255);
		rect(50, 80, 130, 10);
		fill(6, 80, 199);
		rect(50, 90, 130, 10);
		fill(255);
		rect(50, 100, 130, 10);
		fill(6, 80, 199);
		rect(50, 110, 130, 10);
		fill(255);
		rect(50, 120, 130, 10);
		fill(6, 80, 199);
		rect(50, 130, 130, 10);
		fill(6, 80, 199);
		rect(50, 50, 50, 50);
		fill(255);
		rect(70, 50, 10, 50);
		fill(255);
		rect(50, 70, 50, 10);

        //Static Irish Flag
        noStroke();
        fill(15, 105, 16);
		rect(width - 180, 40, 50, 90);
        fill(255);
		rect(width - 130, 40, 50, 90);
        fill(196, 100, 4);
		rect(width - 80, 40, 50, 90);
        
	}

}
