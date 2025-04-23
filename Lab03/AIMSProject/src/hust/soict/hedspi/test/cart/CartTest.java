package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Harry Potter", "Fantasy", 29.99f);
        CompactDisc cd = new CompactDisc("Greatest Hits", "Pop", "Various Artists", 15.99f);
        cd.addTrack(new Track("Song 1", 3));
        cd.addTrack(new Track("Song 2", 4));

        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        System.out.println("Initial cart:");
        cart.print();

        System.out.println("\nSearch by ID (ID = " + dvd.getId() + "):");
        cart.searchById(dvd.getId());

        System.out.println("\nSearch by title (containing 'Harry'):");
        cart.searchByTitle("Harry");

        System.out.println("\nAfter sorting by title then cost:");
        cart.sortByTitleCost();
        cart.print();

        System.out.println("\nAfter sorting by cost then title:");
        cart.sortByCostTitle();
        cart.print();

        cart.removeMedia(book);
        System.out.println("\nAfter removing Harry Potter:");
        cart.print();
    }
}