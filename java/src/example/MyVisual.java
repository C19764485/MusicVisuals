  
package example;

import example.*;
import ie.tudublin.*;
import processing.core.PApplet;

public class MyVisual extends Visual
{    
    WaveForm wf;
    AudioBandsVisual abv;
    Turbine trb;
    Sheet sht;
    GreekFlagMove grkflgmv;
    IrishFlagMove irsflgmv;
    Flags flgz;
    int value = 0;
    String filename;
    
    public void settings()
    {
        size(1024, 950, P3D);

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
        loadAudio("greek2.mp3");

        // Call this instead to read audio from the microphone
        // startListening(); 

        grkflgmv = new GreekFlagMove(this);
        irsflgmv = new IrishFlagMove(this);
        flgz = new Flags(this);
        trb = new Turbine(this);
        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        sht = new Sheet(this);
    }

    public void keyPressed()
    {
        switch(key)
        {
            case '1':
            {
                value = 1;
                break;
            }
            case '2':
            {
                value = 2;
                break;
            }
            case '3':
            {
                value = 3;
                break;
            }
            case '4':
            {
                value = 4;
                break;
            }
            case '5':
            {
                value = 5;
                break;
            }
            case '6':
            {
                value = 6;
                break;
            }
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
            text("Press '1': Greek flag.\nPress '2': Irish flag.\nPress '3': 'Turbine'\nPress '4': 'Moving Sheet'.\n\nPress 'Space' to play/pause music.\nPress 'r' to rewind.", 150, height - 50);

            if (getAudioPlayer().isPlaying() == false)
            {
                flgz.render();
            }

            switch(value)
            {
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
                case 3:
                {
                    trb.render();
                    break;
                }
                case 4:
                {
                    sht.render();
                    break;
                }
                case 5:
                {
                    wf.render();
                    break;
                }
                case 6:
                {
                    abv.render();
                    break;
                }
            }  
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
    }
}
