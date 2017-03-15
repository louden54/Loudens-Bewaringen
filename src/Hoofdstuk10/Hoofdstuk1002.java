package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


public class Hoofdstuk1002 extends Applet {
    TextField tekstvak;
    Label label;
    String s, cijfer;
    long cijfer1, cijfer2, cijfer3;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("typ een getal");
        tekstvak.addActionListener(new Vaklisten());
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("het hoogste cijfer is: " + cijfer1, 40, 80);
        g.drawString("het laagste cijfer is: " + cijfer3, 40, 95);
    }

    class Vaklisten implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer2 = Long.parseLong(tekstvak.getText());
            if (cijfer3 == 0) {
                cijfer3 = cijfer2;
            }
            if ((cijfer2 > cijfer1)) {
                cijfer1 = cijfer2;
                tekstvak.setText(null);
                repaint();
            }
            if ((cijfer2 < cijfer1) && (cijfer2 < cijfer3)) {
                cijfer3 = cijfer2;
                tekstvak.setText(null);
                repaint();
            }
        }
    }
}