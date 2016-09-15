package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk501 extends Applet {
    Color Vulkleur;
    Color lijnkleur;
    int Width;
    int Highth;
    public void init(){
        Vulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        Width = 100;
        Highth = 70;}


    public void paint(Graphics g){
        g.drawLine(20, 10, 70, 10);
        g.drawString("lijn", 25, 25);
        g.drawRect(20, 30, Width, Highth);
        g.drawString("rechthoek", 30, 110);
        g.setColor(Vulkleur);
        g.fillArc(240, 30, Width, Highth, 0, 45);
        g.fillOval(130, 120, Width, Highth);
        g.fillRect(130, 30, Width, Highth);
        g.setColor(lijnkleur);
        g.drawOval(130, 30, Width, Highth);
        g.drawString("met ovaal", 130, 110);
        g.drawOval(240, 30, Width, Highth);
        g.drawString("punt met ovaal", 240, 110);
        g.drawRoundRect(20, 120, Width, Highth, 30, 30);
        g.drawString("ronde randen", 30, 200);
        g.drawString("gevulde ovaal", 130, 200);
        g.drawOval(265, 120, 50, 50);
        g.drawString("cirkel", 270, 200);
    }
}