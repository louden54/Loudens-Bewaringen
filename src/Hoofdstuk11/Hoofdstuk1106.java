package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;


public class Hoofdstuk1106 extends Applet {


    public void paint (Graphics g)
    {
        int i = 0;
        int x = 50;
        int y = 50;
        int width = 10;
        int height = 10;
        while (i < 6)
        {

            g.drawOval(x, y, width, height);
            width += 10;
            x -= 5;
            y -= 5;
            height += 10;
            i++;
        }
    }
}