package src;


import java.awt.*;
import java.applet.*;

public class Hoofdstuk406 extends Applet{ public void init(){setBackground(Color.gray);}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(30,20,50,240);
        g.fillRect(30,20,50,240);
        g.setColor(Color.black);
         g.drawRect(20,20,70,190);
         g.fillRect(20,20,70,190);
         g.setColor(Color.green);
         g.drawOval(30, 30, 50, 50);
         g.fillOval(30, 30, 50, 50);
         g.setColor(Color.orange);
         g.drawOval(30, 90, 50, 50);
         g.fillOval(30, 90, 50, 50);
         g.setColor(Color.red);
         g.drawOval(30, 145, 50, 50);
         g.fillOval(30, 145, 50, 50);

    }

}

