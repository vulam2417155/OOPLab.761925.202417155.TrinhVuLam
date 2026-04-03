package project;

public class Aims {
    public static void main(String[] args) {

        // Create a new cart
        Cart anOrder = new Cart();

        // Create DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Add DVDs to cart
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        // Display cart before removal
        System.out.println("--- Cart before removal ---");
        anOrder.displayCart();

        // Remove a DVD (section 13)
        anOrder.removeDigitalVideoDisc(dvd2);

        // Display cart after removal
        System.out.println("--- Cart after removal ---");
        anOrder.displayCart();
    }
}