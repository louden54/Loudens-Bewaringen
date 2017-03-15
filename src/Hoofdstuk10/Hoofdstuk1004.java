
package h10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Hoofdstuk1004 extends Applet
{
    TextField tekstvak1;
    TextField tekstvak2;
    Label label;
    String text,s,dagen, jaars;
    int maand, jaar, schrikkel, schrikkelfalse;

    public void init()
    {
        Vaklisten vl = new Vaklisten();
        tekstvak1 = new TextField("maand",20);
        tekstvak2 = new TextField("jaar" ,20);
        label = new Label("typ een getal");
        tekstvak1.addActionListener(vl);
        tekstvak2.addActionListener(vl);
        add (label);
        add (tekstvak1);
        add (tekstvak2);
    }
    public void paint(Graphics g)
    {
        g.drawString("maand: "+ text, 40, 100);
        g.drawString("dagen "+dagen, 40, 120);

    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = tekstvak1.getText();
            jaars = tekstvak2.getText();
            maand = Integer.parseInt(s);
            jaar = Integer.parseInt(jaars);
            schrikkel = jaar%4;
            schrikkelfalse = jaar%400;
            switch(maand)
            {
                case 1:
                    text = "januari";
                    dagen = "31";
                    break;
                case 2:
                    text = "februari";
                    if (schrikkel == 0 &&!( schrikkelfalse == 0)){
                        dagen = "29";
                    }
                    else
                    {
                        dagen = "28";
                    }

                    break;
                case 3:
                    text = "maart";
                    dagen = "31";
                    break;
                case 4:
                    text = "april";
                    dagen = "30";
                    break;
                case 5:
                    text = "mei";
                    dagen = "31";
                    break;
                case 6:
                    text = "juni";
                    dagen = "30";
                    break;
                case 7:
                    text = "juli";
                    dagen = "31";
                    break;
                case 8:
                    text = "augustus";
                    dagen = "31";
                    break;
                case 9:
                    text = "september";
                    dagen = "30";
                    break;
                case 10:
                    text = "oktober";
                    dagen = "31";
                    break;
                case 11:
                    text = "november";
                    dagen = "30";
                    break;
                case 12:
                    text = "december";
                    dagen = "31";
                    break;
                default:
                    text = "Ongeldige maand";
                    dagen = null;
                    break;

            }
            repaint();
        }
    }
}