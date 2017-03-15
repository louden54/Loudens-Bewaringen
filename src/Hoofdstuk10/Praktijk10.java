package Hoofdstuk10;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


public class Praktijk10 extends Applet
{
    TextField tekstvak;
    Label label;
    String text;
    String s;
    String cijfer;
    int geval;

    public void init()
    {
        tekstvak = new TextField("",20);
        label = new Label("typ een getal");
        tekstvak.addActionListener(new Vaklisten());
        add (label);
        add (tekstvak);
    }
    public void paint(Graphics g)
    {
        g.drawString("uw cijfer is :"+ text, 40, 80);
        g.drawString("ingevoerd cijfer: "+cijfer,40, 100);

    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = tekstvak.getText();
            geval = Integer.parseInt(s);
            switch(geval)
            {
                case 1:
                    text = "slecht";
                    cijfer = "1";
                    break;
                case 2:
                    text = "slecht";
                    cijfer = "2";
                    break;
                case 3:
                    text = "slecht";
                    cijfer = "3";
                    break;
                case 4:
                    text = "onvoldoende";
                    cijfer = "4";
                    break;
                case 5:
                    text = "matig";
                    cijfer = "5";
                    break;
                case 6:
                    text = "voldoende";
                    cijfer = "6";
                    break;
                case 7:
                    text = "voldoende";
                    cijfer = "7";
                    break;
                case 8:
                    text = "goed";
                    cijfer = "8";
                    break;
                case 9:
                    text = "goed";
                    cijfer = "9";
                    break;
                case 10:
                    text = "goed";
                    cijfer = "10";
                    break;

                default:
                    text = "Verkeerd Cijfer";
                    cijfer = null;
                    break;

            }
            repaint();
        }
    }
}