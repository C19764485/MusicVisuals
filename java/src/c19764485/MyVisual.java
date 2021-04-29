package c19764485;

import example.*;
import ie.tudublin.*;

public class MyVisual extends Visual
{    
    Flags flgz;
    GreekFlagMove grkflgmv;
    IrishFlagMove irsflgmv;
    Turbine trb;
    Sheet sht;
    Shapes shp;
    MovingObjects mvobjs;

    //Default classes
    WaveForm wf;
    AudioBandsVisual abv;

    //Global variables
    int value = 0;
    // Shapes[] shp = new Shapes[100];

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
        // Framerate set up to 75
        // frameRate(75);

        startMinim();
        
        // Call loadAudio to load an audio file to process 
        loadAudio("greek.mp3");

        // Call this instead to read audio from the microphone
        // startListening(); 

        // All inctances from all created classes
        flgz = new Flags(this);
        grkflgmv = new GreekFlagMove(this);
        irsflgmv = new IrishFlagMove(this);
        trb = new Turbine(this);
        sht = new Sheet(this);
        shp = new Shapes(this);
        mvobjs = new MovingObjects(this);
    }

    // Function for pressed keys assigns 'value' variable to each numbered visual
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
            case '7':
            {
                // value = 7;
                break;
            }
            case '8':
            {
                // value = 8;
                break;
            }
        } 

        /* 
            If statement that allows to pause the music by pressing 'Space' key
            in case music is playing.
        */
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

        // If statement that rewinds the song back to the beginning.
        if (key == 'r')
        {
            getAudioPlayer().rewind();
        }
    }

    // Draw method that all visuals are called onto.
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
            text("Press '1': Greek flag.\nPress '2': Irish flag.\nPress '3': 'Turbine'\nPress '4': 'Moving Sheet'.\nPress '5': 'Shapes'.\nPress '6': 'Moving Objects'.\n\nPress 'Space' to play/pause music.\nPress 'r' to rewind.", 120, height - 70);

            if (getAudioPlayer().isPlaying() == false)
            {
                flgz.render();
            }

            // Switch statement that cooperated with keypressed() function with the 'value' variable.
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
                    shp.render();
                    break;
                }
                case 6:
                {
                    mvobjs.render();
                    break;
                }
                case 7:
                {
                
                    break;
                }
                case 8:
                {
                    
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
