  
package example;

import example.AudioBandsVisual;
import example.WaveForm;
import ie.tudublin.*;
import processing.core.PApplet;
import example.Flag;

public class MyVisual extends Flag 
{    
    WaveForm wf;
    AudioBandsVisual abv;
    int value = 0;
    float time;
    String filename = "heroplanet.mp3";

    public void settings()
    {
        size(1024, 900);

        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        frameRate(75);
        startMinim();
        
        // Call loadAudio to load an audio file to process 
        loadAudio("greek2.mp3");

        // Call this instead to read audio from the microphone
        // startListening(); 
        
        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
    }

    public void keyPressed()
    {
        if (key == '1')
        {
            value = 1;
            filename = "greek2.mp3";
        }
        else if (key == '2')
        {
            value = 2;
            filename = "irish.mp3";
        }
        if (key == ' ')
        {
            if (getAudioPlayer().isPlaying() == true)
            {
                getAudioPlayer().pause();
            }
            else
            {
                if (value != 0)
                {
                    getAudioPlayer().play();
                }
                else
                {
                    text("You must choose between 1 or 2.\n", width / 5, height / 3);
                }
            }
        }
        if (key == 'r')
        {
            getAudioPlayer().rewind();
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
            
            fill(255);
		    text("FPS: " + (int) frameRate, width + 30, height + 30);

            textAlign(CENTER, CENTER);
            text("Please press '1' for greek or '2' for irish.\n\n Press 'Space' to play and pause music.\n\n Press 'r' to rewind.", width / 2, height / 2);
            
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
       
        if (getAudioPlayer().isPlaying() == false)
        {
            flagStatic();
        }

        switch(value) {
            case 0:
            {
                flagStatic(); 
                break;
            }
            case 1:
            {
                flagMovingGreek();
                break;
            }
            case 2:
            {
                flagMovingIrish();
                break;
            }
        } 
        
        // wf.render();
        // abv.render();
    }
}
