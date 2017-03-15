package Hoofdstuk8;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk1301 extends Applet {
    Label label;
    TextField vak1;
    Button buttonGroen, buttonRood, buttonGeel, buttonBlauw, buttonOrange;
    String s;
    Boolean start;
    public void init() {
        start = false;
        setSize(500, 50);
        label = new Label("");
        vak1 = new TextField("", 20);
        buttonGroen = new Button();
        buttonRood = new Button();
        buttonBlauw = new Button();
        buttonGeel = new Button();
        buttonOrange = new Button();
        buttonGroen.setLabel("Groen");
        buttonRood.setLabel("Rood");
        buttonBlauw.setLabel("Blauw");
        buttonGeel.setLabel("Geel");
        buttonOrange.setLabel("Orange");
        ListenOrange orange = new ListenOrange();
        ListenBlauw blauw = new ListenBlauw();
        ListenGeel geel = new ListenGeel();
        ListenGroen groen = new ListenGroen();
        ListenRood rood = new ListenRood();
        add(label);
        add(vak1);
        add(buttonBlauw);
        add(buttonGeel);
        add(buttonRood);
        add(buttonGroen);
        add(buttonOrange);
        buttonGroen.addActionListener(groen);
        buttonRood.addActionListener(rood);
        buttonBlauw.addActionListener(blauw);
        buttonGeel.addActionListener(geel);
        buttonOrange.addActionListener(orange);
        buttonGroen.setBackground(Color.green);
        buttonRood.setBackground(Color.red);
        buttonBlauw.setBackground(Color.blue);
        buttonGeel.setBackground(Color.yellow);
        buttonOrange.setBackground(Color.orange);

    }

    class ListenGroen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start = true;
            vak1.setText("Groen");
            repaint();
        }
    }

    class ListenRood implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           start = true;
           vak1.setText("Rood");
            repaint();
        }
    }

    class ListenBlauw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start = true;
            vak1.setText("Blauw");
            repaint();
        }
    }

    class ListenGeel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start = true;
            vak1.setText("Geel");
            repaint();
        }
    }

    class ListenOrange implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start = true;
            vak1.setText("Oranje");
            repaint();
        }
    }
}