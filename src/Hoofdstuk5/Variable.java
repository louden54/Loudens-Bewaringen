package Hoofdstuk5;

import java.awt.*;
import java.applet.*;


public class Variable extends Applet {
    Color backgroundcolor;
    Color TextColor;
    int getal1;
    int getal2;
    private Font Mijnfont;

    @Override
    public void init(){
        super.init();
        backgroundcolor = new Color(255,204,204);
        TextColor = new Color(0,32,120);
        getal1 = 20;
        getal2 = 30;
        setBackground(backgroundcolor);
        Mijnfont = new Font("TimesRoman", Font.BOLD, 18);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(TextColor);
        int x = 50;
        int y = 50;
        g.setFont(Mijnfont);
        g.drawString("som is:" + getal1 + getal2, x , y +50);
        g.drawString("som is:" + getal1 + getal2 , x ,y );
    }
}