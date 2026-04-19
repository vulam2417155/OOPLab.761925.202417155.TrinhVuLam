package project.hust.soict.dsai.test.cart;

import project.hust.soict.dsai.aims.cart.Cart;
import project.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
                "Animation", 18.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        // Test print
        cart.print();

        // Test search by ID
        cart.searchByID(2);

        // Test search by title
        cart.searchByTitle("lion");
    }
}