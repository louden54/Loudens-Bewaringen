package src;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk402 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 120, 150, 120);
        g.drawLine(50, 120, 100, 50);
        g.drawLine(100, 50, 150, 120);
        g.setColor(Color.black);
        g.drawRect(50, 120, 100, 50);
        g.drawRect(60,130,20,40);
        g.drawRect(100,125,30,35);
    }
}


