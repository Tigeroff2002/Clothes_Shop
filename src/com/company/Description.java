package com.company;

import javax.swing.*;
import java.awt.*;

public class Description extends JFrame {
    public Description()
    {
        super("Описание товаров");
        Container container = this.getContentPane();
        this.setResizable(false);
        this.setBounds(300, 300, 1280 ,720);
        Canvas canva = new Canvas();
        container.add(canva);
        try {
            canva.paint(container.getGraphics());
        }
        catch (NullPointerException e)
        {

        }
    }

    public class canva extends Canvas{
        //FIELDS
        public int WIDTH  = 1024;
        public int HEIGHT = WIDTH / 16 * 9;

        public void paint(Graphics g){
            Dimension size = new Dimension (WIDTH, HEIGHT);
            setPreferredSize(size);
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(Color.BLACK);
            g.fillOval(100, 100, 30, 30);
        }
    }
}
