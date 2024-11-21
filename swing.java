import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World!");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);

        JButton button = new JButton("Hello world!");
        button.addActionListener(new MyActionListener());
        button.setLocation(30, 30);
        button.setSize(150, 100);
        contentPane.add(button);

        frame.setVisible(true);
    }
}