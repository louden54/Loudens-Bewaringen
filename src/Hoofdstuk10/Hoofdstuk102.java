package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk102 extends Applet {


    TextField tekstveld;
    Button knop;
    int hoogsteGetal;
    int laagsteGetal;
    boolean geklikt;



    public void init() {
        super.init();
        geklikt = false;
        tekstveld = new TextField("", 10);
        add(tekstveld);

        knop = new Button("ok");
        add(knop);
        knoplistener KL = new knoplistener();
        knop.addActionListener(KL);
        hoogsteGetal = Integer.MIN_VALUE;
        laagsteGetal = Integer.MAX_VALUE;
    }

    public void paint(Graphics g) {
        super.paint(g);
        int x = 50;
        int y = 70;
        if (geklikt) {

            g.drawString("hoogstegetal: " + hoogsteGetal, x, y);
            y = y + 20;
            g.drawString("laagstegetal: " + laagsteGetal, x, y);
        }
    }
    class knoplistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        geklikt=true;
            String getalString = tekstveld.getText();
            int getal = Integer.parseInt(getalString);

            if (getal > hoogsteGetal) {
                hoogsteGetal = getal;
            }
            if (getal < laagsteGetal) {
                laagsteGetal = getal;
            }

        repaint();
        }
    }
}
