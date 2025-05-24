package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.exception.PlayerException;
import javax.swing.JOptionPane;

public class Aims {
    // Phương thức để phát media và xử lý ngoại lệ
    public static void playMedia(Media media) {
        try {
            media.play();
        } catch (PlayerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();

        // Create various media items
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Inception", "Sci-Fi", "Christopher Nolan", 148, 22.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Interstellar", "Sci-Fi", "Christopher Nolan", 169, 24.50f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "The Matrix", "Action", "Wachowski Brothers", 136, 19.75f);
        Book book = new Book(4, "Harry Potter", "Fantasy", 29.99f);
        CompactDisc cd = new CompactDisc(5, "Abbey Road", "Rock", "The Beatles", 12.99f);
        cd.addTrack(new Track("Come Together", 4));

        // Add media to cart
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.addMedia(book);
        cart.addMedia(cd);

        // Display cart before removal
        System.out.println("Total cost before removal: " + cart.totalCost() + "$\n");
        cart.print();

        // Remove a media item
        cart.removeMedia(dvd2);

        // Display cart after removal
        System.out.println("Total cost after removal: " + cart.totalCost() + "$\n");
        cart.print();

        // Display IDs and total DVDs
        System.out.println("DVD 1 ID: " + dvd1.getId());
        System.out.println("DVD 2 ID: " + dvd2.getId());
        System.out.println("Total DVDs created: " + DigitalVideoDisc.getTotalDVDs());

        // Test play functionality with exception handling
        System.out.println("\nTesting play functionality:");
        playMedia(dvd1); // Nên phát thành công
        playMedia(cd);   // Nên phát thành công
        DigitalVideoDisc dvdInvalid = new DigitalVideoDisc(6, "Invalid DVD", "Test", "Unknown", 0, 9.99f);
        playMedia(dvdInvalid); // Nên hiển thị dialog lỗi
    }
}