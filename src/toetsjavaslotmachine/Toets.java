package toetsjavaslotmachine;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.applet.AudioClip;
import java.awt.Image;


public class Toets extends Applet {
    private Image[] plaatjes = new Image[20];
    private Image[] plaatjes3 = new Image[3];
    Image r1;
    Image r2;
    Image r3;
    private double math1, math2, math3;
    private Button Koop, Speel;
    private int krediet, nummer1, nummer2, nummer3;
    private boolean start;
    private boolean win;
    double plaatje1, plaatje2, plaatje3;
    private boolean win20;
    private AudioClip sound, sound2;
    private URL pad;

    public void init() {
        start = false;
        pad = Toets.class.getResource("/recources/");
        for (int i = 0; i < plaatjes.length; i++) {
            plaatjes[i] = getImage(pad, "fruit_" + i + ".jpg");
        }
        sound = getAudioClip(pad, "slot.wav");
        sound2 = getAudioClip(pad, "slot.mp3");
        krediet = 10;
        Speel = new Button("Speel");
        Koop = new Button("Koop 10 kredietpunten");
        Listen1 ko = new Listen1();
        Listen2 sp = new Listen2();
        Speel.addActionListener(sp);
        Koop.addActionListener(ko);
        add(Speel);
        add(Koop);
    }

    public void paint(Graphics g) {
        int x = 30;
        int y = 80;
        r1 = getImage(pad, "/recources/"+ plaatjes[nummer1]);
        r2 = getImage(pad, "/recources/"+ plaatjes[nummer2]);
        r3= getImage(pad, "/recources/"+ plaatjes[nummer3]);
        g.drawImage(r1, 20, 40, 40, 60, this);
        g.drawImage(r2, 60, 40, 40, 60, this);
        g.drawImage(r3, 100, 40, 40, 60, this);


        g.drawString("krediet : " + krediet, 30, 200);


        if (win == true) {
            g.drawString("Gewonnen : 4 punten!", 30, 220);
            win = false;

        }
        if (win20 == true) {
            g.drawString("Gewonnen : 20 punten!", 30, 220);
            win = false;

        }

    }

    //* Speel knop
    class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start = true;
            if (krediet > 0) {
                krediet--;
                plaatje1 = Math.random();
                nummer1 = (int) (plaatje1 * 20);
                plaatje2 = Math.random();
                nummer2 = (int) (plaatje2 * 20);
                plaatje3 = Math.random();
                nummer3 = (int) (plaatje3 * 20);
                repaint();
                if (nummer1 == nummer2 && start == true) {
                    sound2.play();
                    krediet = krediet + 4;
                    win = true;
                }
                if (nummer1 == nummer2 && nummer1 == nummer3 && start == true) {
                    sound2.play();
                    krediet = krediet + 20;
                    win20 = true;
                }
            }

            if (krediet < 1) {
                Koop.setEnabled(true);
            } else {
                Koop.setEnabled(false);
            }
        }


    }


    //* Koop knop
    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            krediet = 10;
            repaint();

        }
    }
}

