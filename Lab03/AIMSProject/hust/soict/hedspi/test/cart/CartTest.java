package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", null, 90, 18.99f);

        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        System.out.println("Testing print method:");
        cart.print();

        // Test search by ID
        System.out.println("\nTesting search by ID (ID = 2):");
        cart.searchById(2);

        // Test search by title
        System.out.println("\nTesting search by title (containing 'Star'):");
        cart.searchByTitle("Star");

        // Test search with non-existent ID
        System.out.println("\nTesting search by ID (ID = 999):");
        cart.searchById(999);

        // Test search with non-existent title
        System.out.println("\nTesting search by title (containing 'Harry'):");
        cart.searchByTitle("Harry");
    }
}