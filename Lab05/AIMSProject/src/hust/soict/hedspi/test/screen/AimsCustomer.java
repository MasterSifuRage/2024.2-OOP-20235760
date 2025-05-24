package hust.soict.hedspi.test.screen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;

public class AimsCustomer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Tạo một đối tượng Store để quản lý danh sách media
        Store store = new Store();
        // Thêm một số media mẫu để kiểm tra
        store.addMedia(new hust.soict.hedspi.aims.media.DigitalVideoDisc(1, "Inception", "Sci-Fi", "Christopher Nolan", 148, 22.99f));
        store.addMedia(new hust.soict.hedspi.aims.media.DigitalVideoDisc(2, "The Matrix", "Action", "Wachowski Brothers", 136, 19.75f));
        store.addMedia(new hust.soict.hedspi.aims.media.CompactDisc(3, "Abbey Road", "Rock", "The Beatles", 12.99f));
        store.addMedia(new hust.soict.hedspi.aims.media.Book(4, "Harry Potter", "Fantasy", 29.99f));

        // Tải file FXML và gắn controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/hedspi/aims/screen/customer/view/Store.fxml"));
        loader.setController(new ViewStoreController(store)); // Truyền Store vào controller
        Parent root = loader.load();

        // Thiết lập Scene và Stage
        Scene scene = new Scene(root);
        stage.setTitle("AIMS Store - " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("hh:mm a dd/MM/yyyy")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}