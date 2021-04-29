package c19764485;

import ie.tudublin.Visual;
import processing.core.*;

public class Flags extends Visual
{
    MyVisual flgz;

    public Flags (MyVisual flgz)
    {
        this.flgz = flgz;
    }

    public void render()
    {
        // Static Greek flag
        flgz.colorMode(PApplet.RGB);
        flgz.noStroke();
        flgz.fill(6, 80, 199);
        flgz.rect(50, 50, 140, 10);
        flgz.fill(255);
        flgz.rect(50, 60, 140, 10);
        flgz.fill(6, 80, 199);
        flgz.rect(50, 70, 140, 10);
        flgz.fill(255);
        flgz.rect(50, 80, 140, 10);
        flgz.fill(6, 80, 199);
        flgz.rect(50, 90, 140, 10);
        flgz.fill(255);
        flgz.rect(50, 100, 140, 10);
        flgz.fill(6, 80, 199);
        flgz.rect(50, 110, 140, 10);
        flgz.fill(255);
        flgz.rect(50, 120, 140, 10);
        flgz.fill(6, 80, 199);
        flgz.rect(50, 130, 140, 10);
        //Cross
        flgz.fill(6, 80, 199);
        flgz.rect(50, 50, 50, 50);
        flgz.fill(255);
        flgz.rect(70, 50, 10, 50);
        flgz.fill(255);
        flgz.rect(50, 70, 50, 10);


        // Static Irish Flag
        flgz.noStroke();
        flgz.fill(15, 105, 16);
        flgz.rect(800, 40, 50, 90);
        flgz.fill(255);
        flgz.rect(850, 40, 50, 90);
        flgz.fill(196, 100, 4);
        flgz.rect(900, 40, 50, 90);
    }
}
