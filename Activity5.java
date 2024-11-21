import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class MenuExample {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenu fileMenu = new JMenu("File");
        JMenuItem item = new JMenuItem("Close");

        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showOptionDialog(
                    frame, 
                    "Do you really want to close?", 
                    "Close", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    null, 
                    null
                );
                
                if (n == JOptionPane.YES_OPTION) {
                    frame.dispose();
                }
            }
        });

        fileMenu.add(item);

        JMenuBar menubar = new JMenuBar();
        menubar.add(fileMenu);

        frame.setJMenuBar(menubar);

        frame.setVisible(true);
    }
}
