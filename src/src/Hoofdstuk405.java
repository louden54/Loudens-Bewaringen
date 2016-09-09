package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk405 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
       setBackground(Color.blue);
        g.drawOval(20,20, 120, 80);
        g.setColor(Color.yellow);
        g.fillArc(20,20,120, 80, 90, 155);
    }
}