package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rekenmachine extends Applet {

    TextField vak1;
    TextField vak2;
    Button keerknop;
    Button deelknop;
    Button minknop;
    Button plusknop;

    double getal1;
    double getal2;
    double uitkomst;

    @Override

    public void init() {
        super.init();
        vak1 = new TextField("", 20);
        add(vak1);

        vak2 = new TextField("", 20);
        add(vak2);

        keerknop = new Button("X" );
        add(keerknop);
        KeerKnopListener kkl = new KeerKnopListener();
        keerknop.addActionListener(kkl);

        deelknop = new Button("/" );
        add(deelknop);
        DeelKnopListener dkl = new DeelKnopListener();
        deelknop.addActionListener(dkl);

        minknop = new Button("-" );
        add(minknop);
        MinKnopListener mkl = new MinKnopListener();
        minknop.addActionListener(mkl);

        plusknop = new Button("+" );
        PlusKnopListener pkl = new PlusKnopListener();
        add(plusknop);
        plusknop.addActionListener(pkl);
    }


    class KeerKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 * getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("" );
        }
    }

    class DeelKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 / getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("" );
        }
    }

    class MinKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 - getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("" );
        }
    }

    class PlusKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 + getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("" );
        }
    }



}