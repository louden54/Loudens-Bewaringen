package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk801 extends Applet {
    TextField tekstvak;
    Label label;
    String text;
    Button knop;
    Button knop2;
    String s;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak " +
                "en druk op Ok");
        add(label);
        add(tekstvak);
        knop = new Button();
        knop.setLabel("OK");
        Listener L = new Listener();
        Listener2 L2 = new Listener2();
        knop.addActionListener(L);
        knop2 = new Button();
        knop2.setLabel("Reset");
        knop2.addActionListener(L2);
        add(knop);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80);

    }

    class Listener implements ActionListener
    {
        public void actionPerformed( ActionEvent e){

            s = tekstvak.getText();
            repaint();
        }
    }
    class Listener2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){

            tekstvak.setText("");
            repaint();

        }

    }
}