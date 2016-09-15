package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk601 extends Applet {
    int a;
    int b;

    int uitkomst;

    public void init() {
        a = 113;
        b = 4;

        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst, 20, 20);
        g.drawString("Ali krijgt: " + uitkomst, 20, 30);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 40);
        g.drawString("ik krijg: " + uitkomst, 20, 50);
    }
}