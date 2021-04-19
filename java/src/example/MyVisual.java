  
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
        startListening(); 
        
        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            if (getAudioPlayer().isPlaying() == true)
            {
                getAudioPlayer().pause();
            }
            else
            {
                getAudioPlayer().play();
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
            flag();
            
            fill(255);
		    text("FPS: " + (int) frameRate, 10, 10);

            
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        // wf.render();
        // abv.render();
    }
}
