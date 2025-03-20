import javax.swing.*;

public class FirstDialogV2 {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("First Dialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // Tạo JLabel hiển thị thông báo
        JLabel label = new JLabel("Hello World! How are you?", SwingConstants.CENTER);
        
        // Thêm JLabel vào JFrame
        frame.add(label);
        frame.setVisible(true);
    }
}
