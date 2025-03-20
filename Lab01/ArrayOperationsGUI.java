import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class ArrayOperationsGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Array Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        
        JLabel inputLabel = new JLabel("Nhập các số, cách nhau bằng dấu phẩy:");
        JTextField inputField = new JTextField(20);
        JButton processButton = new JButton("Tính toán");
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        
        processButton.addActionListener((ActionEvent e) -> {
            try {
                String[] input = inputField.getText().split(",");
                int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
                Arrays.sort(numbers);
                int sum = Arrays.stream(numbers).sum();
                double avg = (double) sum / numbers.length;
                
                resultArea.setText("Mảng sau khi sắp xếp: " + Arrays.toString(numbers) +
                        "\nTổng: " + sum + "\nTrung bình: " + avg);
            } catch (NumberFormatException ex) {
                resultArea.setText("Vui lòng nhập các số hợp lệ!");
            }
        });
        
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(processButton);
        frame.add(resultArea);
        
        frame.setVisible(true);
    }
}
