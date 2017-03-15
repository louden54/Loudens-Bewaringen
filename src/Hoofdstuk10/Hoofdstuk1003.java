package Hoofdstuk10;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


public class Hoofdstuk1003 extends Applet
{
    TextField tekstvak;
    Label label;
    String text,s,dagen;
    int maand;

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
        g.drawString("maand: "+ text, 40, 80);
        g.drawString("dagen:"+dagen,40, 100);

    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch(maand)
            {
                case 1:
                    text = "januari";
                    dagen = "31";
                    break;
                case 2:
                    text = "februari";
                    dagen = "28";
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