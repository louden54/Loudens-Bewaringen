
package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk404 extends Applet {
    public void init() {
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
        g.fillRect(35,130,20,90);
        g.drawString("V", 40 , 240);
        g.setColor(Color.red);
        g.drawString("J", 80 , 240);
        g.fillRect(75, 20 ,20, 200);
        g.setColor(Color.green);
        g.fillRect(115 , 50, 20, 170);
        g.drawString("H", 120 , 240);
    }
}