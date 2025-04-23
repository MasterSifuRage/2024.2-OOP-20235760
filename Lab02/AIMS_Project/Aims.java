public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 22.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 24.50f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski Brothers", 136, 19.75f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost before removal: " + cart.totalCost() + "$\n");
        cart.displayCart();
        
        cart.removeDigitalVideoDisc(dvd2);
        
        System.out.println("Total cost after removal: " + cart.totalCost() + "$\n");
        cart.displayCart();
        
        System.out.println("DVD 1 ID: " + dvd1.getId());
        System.out.println("DVD 2 ID: " + dvd2.getId());
        System.out.println("Total DVDs created: " + DigitalVideoDisc.getTotalDVDs());
    }
}