import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MatrixAdditionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Matrix Addition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);
        frame.setLayout(new FlowLayout());
        
        JLabel sizeLabel = new JLabel("Nhập kích thước ma trận (hàng x cột):");
        JTextField rowsField = new JTextField(3);
        JTextField colsField = new JTextField(3);
        JButton generateButton = new JButton("Tạo ma trận");
        JTextArea matrixArea = new JTextArea(10, 35);
        matrixArea.setEditable(false);
        
        generateButton.addActionListener((ActionEvent e) -> {
            try {
                int rows = Integer.parseInt(rowsField.getText());
                int cols = Integer.parseInt(colsField.getText());
                int[][] matrix1 = new int[rows][cols];
                int[][] matrix2 = new int[rows][cols];
                int[][] resultMatrix = new int[rows][cols];
                
                // Tạo giá trị ngẫu nhiên cho ma trận
                StringBuilder output = new StringBuilder("Ma trận 1:\n");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix1[i][j] = (int) (Math.random() * 10);
                        output.append(matrix1[i][j]).append(" ");
                    }
                    output.append("\n");
                }
                
                output.append("\nMa trận 2:\n");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix2[i][j] = (int) (Math.random() * 10);
                        output.append(matrix2[i][j]).append(" ");
                    }
                    output.append("\n");
                }
                
                output.append("\nTổng hai ma trận:\n");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        output.append(resultMatrix[i][j]).append(" ");
                    }
                    output.append("\n");
                }
                
                matrixArea.setText(output.toString());
            } catch (NumberFormatException ex) {
                matrixArea.setText("Vui lòng nhập kích thước hợp lệ!");
            }
        });
        
        frame.add(sizeLabel);
        frame.add(rowsField);
        frame.add(colsField);
        frame.add(generateButton);
        frame.add(new JScrollPane(matrixArea));
        
        frame.setVisible(true);
    }
}