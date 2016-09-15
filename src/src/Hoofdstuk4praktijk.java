
package src;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk4praktijk extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20, 10, 70, 10);
        g.drawString("lijn", 30, 25);
        g.drawRect(20, 30, 100, 70);
        g.drawString("rechthoek", 40, 110);
        g.setColor(Color.magenta);
        g.fillArc(240, 30, 100, 50, 0, 45);
        g.fillOval(130, 120, 110, 70);
        g.fillRect(130, 30, 110, 70);
        g.setColor(Color.black);
        g.drawOval(130, 30, 100, 70);
        g.drawString("met ovaal", 140, 110);
        g.drawOval(240, 30, 100, 50);
        g.drawString("punt met ovaal", 240, 110);
        g.drawRoundRect(20, 120, 100, 70, 30, 30);
        g.drawString("ronde randen", 30, 200);
        g.drawString("gevulde ovaal", 140, 200);
        g.drawOval(265, 120, 50, 50);
        g.drawString("cirkel", 270, 190);

    }
}

