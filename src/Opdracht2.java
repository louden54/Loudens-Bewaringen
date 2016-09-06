import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Louden Bout", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Bout", 50, 80 ); }
}