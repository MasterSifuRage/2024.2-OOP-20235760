import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFromKeyboardGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());
        
        JLabel nameLabel = new JLabel("Nhập tên của bạn:");
        JTextField nameField = new JTextField(15);
        
        JLabel ageLabel = new JLabel("Nhập tuổi của bạn:");
        JTextField ageField = new JTextField(5);
        
        JButton submitButton = new JButton("Submit");
        JTextArea outputArea = new JTextArea(3, 25);
        outputArea.setEditable(false);
        
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            outputArea.setText("Tên: " + name + "\nTuổi: " + age);
        });
        
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(submitButton);
        frame.add(outputArea);
        
        frame.setVisible(true);
    }
}