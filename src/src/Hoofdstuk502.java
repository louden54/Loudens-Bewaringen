
package src;

import java.applet.Applet;
import java.awt.*;


public class Hoofdstuk502 extends Applet {
    int V, J, H, Johangewicht,Valeriegewicht,Henkgewicht;
    public void init() {
        V=40;
        H=80;
        J=120;
        Johangewicht=200;
        Valeriegewicht=90;
        Henkgewicht=170;

    }

    public void paint(Graphics g) {
        g.drawLine(20, 15, 20, 220);
        g.drawString("100", 0 ,15);
        g.drawString("80", 0 ,55);
        g.drawString("60", 0 ,95);
        g.drawString("40", 0 ,135);
        g.drawString("20", 0 ,175);
        g.drawString("0", 5 ,225);
        g.drawLine(20,220, 140,220);
        g.setColor(Color.blue);
        g.fillRect(35,130,20,Valeriegewicht);
        g.drawString("V", V , 240);
        g.setColor(Color.green);
        g.drawString("H", H , 240);
        g.fillRect(75, 20 ,20, Johangewicht);
        g.setColor(Color.red);
        g.fillRect(115 , 50, 20, Henkgewicht);
        g.drawString("J", J , 240);
    }
}