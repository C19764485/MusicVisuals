package c19764485;

import ie.tudublin.Visual;

public class IrishFlagMove extends Visual
{
    MyVisual irsflgmv;

    public IrishFlagMove(MyVisual irsflgmv)
    {
        this.irsflgmv = irsflgmv; 
    }

    public void render()
    {
        irsflgmv.colorMode(RGB);
        irsflgmv.translate(width / 2, height / 2);
    
        for (int i = 0; i < ab.size(); i++) 
        {
            irsflgmv.noStroke();
            irsflgmv.fill(15, 105, 16);
            irsflgmv.rect((width * 3) + (ab.get(i) * 80), (height * 3) + (ab.get(i) * 80) + 40, 120, (ab.get(i) * 80) + 200);
            irsflgmv.fill(255);
            irsflgmv.rect((width * 3) + 120 + (ab.get(i) * 80), (height * 3) + (ab.get(i) * 80) + 40, 120, (ab.get(i) * 80) + 200);
            irsflgmv.fill(196, 100, 4);
            irsflgmv.rect((width * 3) + 240 + (ab.get(i) * 80), (height * 3) + (ab.get(i) * 80) + 40, 120, (ab.get(i) * 80) + 200);
        }
    }
}
