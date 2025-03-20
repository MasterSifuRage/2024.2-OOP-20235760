import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DaysInMonthGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Days in Month");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        
        JLabel monthLabel = new JLabel("Nhập tháng (1-12):");
        JTextField monthField = new JTextField(5);
        JLabel yearLabel = new JLabel("Nhập năm:");
        JTextField yearField = new JTextField(5);
        JButton checkButton = new JButton("Kiểm tra");
        JTextArea resultArea = new JTextArea(3, 30);
        resultArea.setEditable(false);
        
        checkButton.addActionListener((ActionEvent e) -> {
            try {
                int month = Integer.parseInt(monthField.getText());
                int year = Integer.parseInt(yearField.getText());
                if (month < 1 || month > 12 || year < 0) {
                    resultArea.setText("Tháng hoặc năm không hợp lệ!");
                    return;
                }
                int days;
                switch (month) {
                    case 4: case 6: case 9: case 11:
                        days = 30;
                        break;
                    case 2:
                        days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                        break;
                    default:
                        days = 31;
                }
                resultArea.setText("Tháng " + month + " năm " + year + " có " + days + " ngày.");
            } catch (NumberFormatException ex) {
                resultArea.setText("Vui lòng nhập số nguyên hợp lệ!");
            }
        });
        
        frame.add(monthLabel);
        frame.add(monthField);
        frame.add(yearLabel);
        frame.add(yearField);
        frame.add(checkButton);
        frame.add(resultArea);
        
        frame.setVisible(true);
    }
}