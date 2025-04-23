package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Create various media items
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 22.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 24.50f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski Brothers", 136, 19.75f);
        Book book = new Book("Harry Potter", "Fantasy", 29.99f);
        CompactDisc cd = new CompactDisc("Abbey Road", "Rock", "The Beatles", 12.99f);
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
    }
}