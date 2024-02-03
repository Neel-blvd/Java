package GUI;

import javax.swing.*;
import java.awt.*;

class GUI_1
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(420,420);
        frame.setTitle("Neel's Frame");
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
