import javax.swing.*;

public class SolveEquationsGUI {
    public static void main(String[] args) {
        // Giải phương trình bậc nhất ax + b = 0
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số b:"));
        
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiệm của phương trình: x = " + x);
        }
        
        // Giải phương trình bậc hai ax^2 + bx + c = 0
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số a (bậc 2):"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số c:"));
        
        if (a2 == 0) {
            JOptionPane.showMessageDialog(null, "Không phải phương trình bậc hai.");
        } else {
            double delta = b2 * b2 - 4 * a2 * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b2 / (2 * a2);
                JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
                double x2 = (-b2 - Math.sqrt(delta)) / (2 * a2);
                JOptionPane.showMessageDialog(null, "Nghiệm của phương trình: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}