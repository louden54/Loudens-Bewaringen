package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk6praktijkopdracht extends Applet {
    double a ,b ,c, d , e , uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uitkomst=((a+b+c)/d*e);
        uitkomst=(int)uitkomst;
        uitkomst=uitkomst/e;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}