package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Book book = new Book("The Hobbit", "Fantasy", 15.50f);
        CompactDisc cd = new CompactDisc("Abbey Road", "Rock", "The Beatles", 12.99f);
        cd.addTrack(new Track("Come Together", 4));
        cd.addTrack(new Track("Something", 3));

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);

        System.out.println("Initial store:");
        store.displayStore();

        store.removeMedia(book);
        System.out.println("\nAfter removing The Hobbit:");
        store.displayStore();
    }
}