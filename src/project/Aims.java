package project;

public class Aims {

    public static void main(String[] args) {

        // Create cart
        Cart anOrder = new Cart();

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sci-Fi", "Star Wars", 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);

        // Add DVDs to cart
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        // Display cart
        anOrder.displayCart();

        // Remove one DVD
        anOrder.removeDigitalVideoDisc(dvd2);

        // Display cart again
        System.out.println("\nAfter removing one DVD:");
        anOrder.displayCart();
    }
}