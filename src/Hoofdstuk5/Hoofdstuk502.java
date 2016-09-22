
package Hoofdstuk5;

import java.applet.Applet;
import java.awt.*;


public class Hoofdstuk502 extends Applet {
    int V,H,J;
    public void init() {

        V=80;
        H=80;
        J=100;
    }

    public void paint(Graphics g) {
        g.drawLine(20, 15, 20, 220);
        g.drawString("100", 0 ,25);
        g.drawString("80", 0 ,65);
        g.drawString("60", 0 ,105);
        g.drawString("40", 0 ,145);
        g.drawString("20", 0 ,185);
        g.drawString("0", 5 ,225);
        g.drawLine(20,220, 140,220);
        g.setColor(Color.blue);
        g.fillRect(35, 220 - (V * 2), 20, V * 2);
        g.drawString("V", 40 , 240);
        g.setColor(Color.green);
        g.drawString("H", 80 , 240);
        g.fillRect(75, 220 - (H * 2), 20, H * 2);
        g.setColor(Color.red);
        g.fillRect(120, 220 - (J * 2), 20, J * 2);
        g.drawString("J", 120 , 240);
    }
}