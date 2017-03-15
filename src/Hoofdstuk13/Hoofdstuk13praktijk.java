package Hoofdstuk13;

import java.applet.*;
import java.awt.*;

public class Hoofdstuk13praktijk extends Applet
{
    public void init()
    {
        setSize(300,300);
    }
    void boom(Graphics g,int x,int y)
    {
        g.setColor(new Color(51,25,0));
        g.fillRect(x, y, 20, 40);
        g.setColor(Color.green);
        g.fillOval(x-20, y-30, 60, 40);
    }
    public void paint(Graphics g)
    {
        for(int teller=0; teller <5; teller++)
        {
            for(int teller1=0; teller1<2; teller1++)
            {
                boom(g, teller*50+10*(teller1%2),(teller1+3)*50);
            }
        }
    }
}