package project.hust.soict.dsai.aims;

import project.hust.soict.dsai.aims.cart.Cart;
import project.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import project.hust.soict.dsai.aims.media.CompactDisc;
import project.hust.soict.dsai.aims.media.Track;
import project.hust.soict.dsai.aims.media.Book;

public class Aims {

    public static void main(String[] args) {

        // ===== CART SECTION =====
        Cart anOrder = new Cart();

        // Create different types of media
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                "Sci-Fi", "George Lucas", 87, 24.95f);

        CompactDisc cd = new CompactDisc("Abbey Road", "Rock", 
                "The Beatles", "George Martin", 29.99f);
        Track t1 = new Track("Come Together", 259);
        Track t2 = new Track("Something", 182);
        cd.addTrack(t1);
        cd.addTrack(t2);

        Book book = new Book("Clean Code", "Programming", 35.99f);
        book.addAuthor("Robert Martin");

        anOrder.addMedia(book);

        // Add all media types to cart using addMedia()
        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(cd);
        anOrder.addMedia(book);

        // Display cart
        System.out.println("--- Cart ---");
        anOrder.print();

        // Search by ID
        System.out.println("\n--- Search by ID: 2 ---");
        anOrder.searchByID(2);

        // Search by title
        System.out.println("\n--- Search by title: lion ---");
        anOrder.searchByTitle("lion");

        // Remove a media
        anOrder.removeMedia(dvd2);

        // Display cart after removal
        System.out.println("\n--- Cart after removal ---");
        anOrder.print();

        // ===== PLAY SECTION =====
        System.out.println("\n--- Play DVD ---");
        dvd1.play();

        System.out.println("\n--- Play CD ---");
        cd.play();
    }
}