package Hoofdstuk8;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Hoofdstuk803 extends Applet
{
    double belasting;
    double prijs;
    Label label;
    TextField vak1;
    Button buttonOK;
    Button buttonreset;
    String s;
    public void init() {
        belasting = 1.21;
        setSize(200,200);
        label = new Label("€");
        vak1 = new TextField("",20);
        buttonOK = new Button();
        buttonreset = new Button();
        buttonOK.setLabel("OK");
        buttonreset.setLabel("reset");
        knop ok = new knop();
        knopreset reset = new knopreset();
        knopenter vak = new knopenter();
        add(label);
        add(vak1);
        add(buttonOK);
        add(buttonreset);
        vak1.addActionListener(vak);
        buttonOK.addActionListener(ok);
        buttonreset.addActionListener(reset);
    }

    class knop implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            prijs = Double.parseDouble(vak1.getText());
            prijs = prijs* belasting;
            vak1.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }

    class knopreset implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vak1.setText(null);
            repaint();
        }
    }

    class knopenter implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            prijs = Double.parseDouble(vak1.getText());
            prijs = prijs* belasting;
            vak1.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }
}