package hust.soict.hedspi.aims.screen.customer.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.Media;
import java.io.IOException;

public class ViewStoreController {
    @FXML
    private GridPane gridPane;

    private Store store;

    public ViewStoreController(Store store) {
        this.store = store;
    }

    @FXML
    public void initialize() {
        int column = 0;
        int row = 0;
        for (int i = 0; i < store.getItemsInStore().size(); i++) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/hust/soict/globalict/aims/screen/customer/view/Item.fxml"));
                AnchorPane anchorPane = loader.load();
                ItemController controller = loader.getController();
                controller.setData(store.getItemsInStore().get(i));
                gridPane.add(anchorPane, column, row);
                column++;
                if (column == 3) {
                    column = 0;
                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void btnViewCartPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/globalict/aims/screen/customer/view/Cart.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}