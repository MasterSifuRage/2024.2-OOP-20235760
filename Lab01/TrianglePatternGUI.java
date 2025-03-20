import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianglePatternGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Nhập chiều cao của tam giác:");
        JTextField inputField = new JTextField(5);
        JButton drawButton = new JButton("Vẽ tam giác");
        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        
        drawButton.addActionListener(e -> {
            int n;
            try {
                n = Integer.parseInt(inputField.getText());
                StringBuilder triangle = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < n - i; j++) {
                        triangle.append(" ");
                    }
                    for (int k = 0; k < 2 * i - 1; k++) {
                        triangle.append("*");
                    }
                    triangle.append("\n");
                }
                outputArea.setText(triangle.toString());
            } catch (NumberFormatException ex) {
                outputArea.setText("Vui lòng nhập một số nguyên hợp lệ.");
            }
        });
        
        frame.add(label);
        frame.add(inputField);
        frame.add(drawButton);
        frame.add(new JScrollPane(outputArea));
        
        frame.setVisible(true);
    }
}