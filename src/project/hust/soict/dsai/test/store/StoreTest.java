package project.hust.soict.dsai.test.store;

import project.hust.soict.dsai.aims.store.Store;
import project.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import project.hust.soict.dsai.aims.media.CompactDisc;
import project.hust.soict.dsai.aims.media.Track;
import project.hust.soict.dsai.aims.media.Book;

public class StoreTest {
    public static void main(String[] args) {

        Store store = new Store();

        // Create different media types
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

        // Add all media to store
        System.out.println("--- Adding media to store ---");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(cd);
        store.addMedia(book);

        // Print store
        System.out.println("\n--- Store contents ---");
        store.print();

        // Test search by title
        System.out.println("\n--- Search by title: lion ---");
        store.searchByTitle("lion");

        // Test adding duplicate
        System.out.println("\n--- Adding duplicate ---");
        store.addMedia(dvd1);

        // Remove a media
        System.out.println("\n--- Removing Star Wars ---");
        store.removeMedia(dvd2);

        // Print store after removal
        System.out.println("\n--- Store after removal ---");
        store.print();
    }
}