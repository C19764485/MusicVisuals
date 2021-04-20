  
package example;

import example.*;
import ie.tudublin.*;
import processing.core.PApplet;

public class MyVisual extends Visual
{    
    WaveForm wf;
    AudioBandsVisual abv;
    Turbine trb;
    GreekFlagMove grkflgmv;
    IrishFlagMove irsflgmv;
    Flags flgz;
    int value = 0;
    String filename;
    
    public void settings()
    {
        size(1024, 900, P3D);

        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        // fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        frameRate(75);
        startMinim();
        
        // Call loadAudio to load an audio file to process 
        loadAudio("greek.mp3");

        // Call this instead to read audio from the microphone
        // startListening(); 

        grkflgmv = new GreekFlagMove(this);
        irsflgmv = new IrishFlagMove(this);
        flgz = new Flags(this);
        trb = new Turbine(this);
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
            
            fill(255);
		    text("FPS: " + (int) frameRate, 30, 10);

            textAlign(CENTER, CENTER);
            text("Please press '1' for Greek or '2' for Irish flag.\n\n Press 'Space' to play and pause music.\n\n Press 'r' to rewind.", 150, height - 50);
            
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        // calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        // calculateAverageAmplitude();
       

        if (getAudioPlayer().isPlaying() == false)
        {
            flgz.render();
        }

        switch(value) {
            case 0:
            {
                break;
            }
            case 1:
            {
                grkflgmv.render();
                break;
            }
            case 2:
            {
                irsflgmv.render();
                break;
            }
        } 
        
        // wf.render();
        // abv.render();
        trb.render();
    }
}
