package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {

    public UI()
    {
        super("Магазин одежды");
        Container container = this.getContentPane();
        this.setResizable(false);
        this.setBounds(300, 300, 1280 ,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        container.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(4, 3, 100, 100));
        MyButton [] buttons = new MyButton[12];
        JPanel [] panels = new JPanel[2];
        for (int i = 0; i < buttons.length; i++)
        {
                buttons[i] = new MyButton();
                container.add(buttons[i]);
            if ((i == 0) || (i == 2) || (i == 9) || (i == 11))
                buttons[i].setVisible(false);
        }
    }

    public class MyButton extends JButton{
        public MyButton()
        {
            super("Одежда");
            this.setFont(new Font ("TimesRoman", Font.BOLD, 20));
            this.setSize(300, 80);
            this.setBackground(Color.CYAN);
            this.setForeground(Color.RED);
            this.setBorder(new UI.RoundedBorder(50));
            this.addActionListener(new ButtonEventListener());
        }
    }

    public class RoundedBorder implements Border {
        private int radius;
        public RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(getForeground());
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    public class ButtonEventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Description app1 = new Description();
            app1.setVisible(true);
        }
    }


}

