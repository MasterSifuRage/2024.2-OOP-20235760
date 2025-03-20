import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosingOptionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Choose an Option");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Do you want to continue?");
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        
        yesButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "You chose YES!"));
        noButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "You chose NO!"));
        
        frame.add(label);
        frame.add(yesButton);
        frame.add(noButton);
        
        frame.setVisible(true);
    }
}
