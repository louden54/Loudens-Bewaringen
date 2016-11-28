package Hoofdstuk8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Hoofdstuk802 extends Applet
{
    int man, vrouw, manl, vrouwl;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    public void init()
    {
        setSize(170,200);
        man = 0;
        vrouw = 0;
        manl = 0;
        vrouwl = 0;
        Listen1 M = new Listen1();
        Listen2 V = new Listen2();
        Listen3 ML = new Listen3();
        Listen4 VL = new Listen4();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button1.setLabel("man volwassen");
        button2.setLabel("vrouw volwassen");
        button3.setLabel("man leerling");
        button4.setLabel("Vrouw leerling");
        button1.addActionListener(M);
        button2.addActionListener(V);
        button3.addActionListener(ML);
        button4.addActionListener(VL);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
    public void paint(Graphics g)
    {
        g.drawString("Mannen volwassen: "+man, 20, 130);
        g.drawString("Vrouwen volwassen: "+vrouw, 20, 150);
        g.drawString("Mannen leerlingen: "+manl, 20, 170);
        g.drawString("Vrouwen leerlingen: "+vrouwl, 20, 190);
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            man++;
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vrouw++;
            repaint();
        }
    }
    class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            manl++;
            repaint();
        }
    }
    class Listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vrouwl++;
            repaint();
        }
    }
}