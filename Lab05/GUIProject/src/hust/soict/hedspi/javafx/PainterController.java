package hust.soict.hedspi.javafx;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton penRadioButton;

    @FXML
    private RadioButton eraserRadioButton;

    private boolean isPen = true; // Mặc định là Pen

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Color color = isPen ? Color.BLACK : Color.WHITE;
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, color);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void toolSelected(ActionEvent event) {
        isPen = penRadioButton.isSelected();
    }
}