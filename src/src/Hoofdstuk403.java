package src;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk403 extends Applet{ public void init(){setBackground(Color.green);}
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(50,50,50,25);
        g.fillRect(50,50,50,25);
        g.setColor(Color.white);
        g.drawRect(50,75,50,25);
        g.fillRect(50,75,50,25);
        g.setColor(Color.blue);
        g.drawRect(50,100,50,25);
        g.fillRect(50,100,50,25);
        g.setColor(Color.darkGray);
        g.drawRect(45,50,5,120);
        g.fillRect(45,50,5,120);

    }


}