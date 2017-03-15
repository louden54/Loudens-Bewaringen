package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Hoofdstuk1005 extends Applet
{
    double nieuwcijfer;
    double gemiddelde;
    double gemiddeldcijfer;
    double cijfer;
    Button Ok;
    Button reset;
    TextField tekstvak;
    public void init()
    {
        gemiddelde = 0;
        nieuwcijfer = 0;
        cijfer = 0;
        tekstvak = new TextField("",10);
        reset = new Button("Reset");
        Ok = new Button("Ok");
        Listen1 ok = new Listen1();
        Listen2 re = new Listen2();
        Ok.addActionListener(ok);
        reset.addActionListener(re);
        add(Ok);
        add(tekstvak);
        add(reset);
    }
    public void paint(Graphics g)
    {
        if (gemiddeldcijfer >5.4 && gemiddeldcijfer <10.1)
        {
            g.drawString("U bent geslaagd", 100, 200);
        }
        if (gemiddeldcijfer >10.1)
        {
            g.drawString("Verkeerde invoer", 100, 200);
        }
        else if (gemiddeldcijfer < 5.5)
        {
            g.drawString("U bent gezakt", 100, 200);
        }

        g.drawString("uw gemiddelde is: "+(String.format("%.2f", Double.valueOf(gemiddeldcijfer))), 100, 180);
    }
    class Listen1  implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            nieuwcijfer = Double.parseDouble(tekstvak.getText());
            gemiddelde++;
            cijfer = cijfer + nieuwcijfer;
            gemiddeldcijfer = cijfer/gemiddelde;
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            cijfer =0;
            nieuwcijfer = 0;
            gemiddelde = 0;
            gemiddeldcijfer =0;
            repaint();
        }
    }
}