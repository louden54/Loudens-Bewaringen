package Hoofdstuk13;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.applet.*;


public class Hoofdstuk1304 extends Applet
{
    int muur;
    public void init()
    {

        Button rodemuur = new Button("muur");
        Button betonmuur = new Button("beton");
        Listen1 l1 = new Listen1();
        Listen2 l2 = new Listen2();
        rodemuur.addActionListener(l1);
        betonmuur.addActionListener(l2);
        add(rodemuur);
        add(betonmuur);
    }

    public void paint(Graphics g)
    {
        if(muur ==0)
        {
            for(int teller=0; teller <10; teller++)
            {
                for(int teller1=0; teller1<10; teller1++)
                {
                    muur(g, teller*22+10*(teller1%2),(teller1+5)*12);
                }
            }
        }
        else if(muur ==1)
        {
            for(int teller=0; teller <10; teller++)
            {
                for(int teller1=0; teller1<10; teller1++)
                {
                    beton(g, teller*32+20*(teller1%2),(teller1+5)*22);
                }
            }
        }
    }
    void muur (Graphics g, int x1, int y1)
    {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20,10);
    }
    void beton (Graphics g, int x1, int y1)
    {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 30,20);
    }
    public class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            muur =0;
            repaint();
        }

    }
    public class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            muur =1;
            repaint();
        }
    }

}