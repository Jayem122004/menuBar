import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

public class MenuExample implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        // Show a message dialog with the current time of the event and the source of the action
        JOptionPane.showMessageDialog(null, 
            "Got an ActionEvent at " + new Date(e.getWhen()) + 
            " from " + e.getSource().getClass(), 
            "Action Event", JOptionPane.INFORMATION_MESSAGE);
    }
}
