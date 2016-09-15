package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk602 extends Applet {
    int a;
    int b;
    int c;
    int d;

    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomst = (a * b);
        uitkomst2 = (a * b * c);
        uitkomst3 = (a * b * c *d);
    }

    public void paint(Graphics g) {
        g.drawString("een uur is 60 secondes keer 60: " + uitkomst, 20, 20);
        g.drawString("een dag is 60x60x24= " + uitkomst2, 20, 30);
        g.drawString("een jaar is 60x60x24x365= : " + uitkomst3, 20, 40);

    }
}