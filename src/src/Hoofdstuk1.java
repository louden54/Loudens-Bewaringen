package src;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Louden Bout", 50, 60 );
    }
}