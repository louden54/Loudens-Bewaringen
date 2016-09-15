package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk603 extends Applet {
    int a;
    int b;


    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 300000000;
        b = 2000000000;

        uitkomst = (a + b);

    }

    public void paint(Graphics g) {
        g.drawString("de uitkomst = : " + uitkomst, 20, 20);


    }
}