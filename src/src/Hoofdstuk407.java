package src;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk407 extends Applet {
    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20, 20, 150, 150, 10, 10);
        g.setColor(Color.white);
        g.fillRoundRect(20, 20, 150, 150, 10, 10);
        g.setColor(Color.black);
        g.drawOval(30, 30, 50, 50);
        g.fillOval(30, 30, 50, 50);
        g.drawOval(30, 100, 50, 50);
        g.fillOval(30, 100, 50, 50);
        g.drawOval(100, 30, 50, 50);
        g.fillOval(100, 30, 50, 50);
        g.drawOval(100, 100, 50, 50);
        g.fillOval(100, 100, 50, 50);

    }
}