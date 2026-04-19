package project.hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import project.hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // Add a single media
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added: " + media.getTitle());
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Remove a media
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed: " + media.getTitle());
        } else {
            System.out.println("Media not found in cart.");
        }
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (Media m : itemsOrdered) {
            total += m.getCost();
        }
        return total;
    }

    // Print cart contents
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    // Search by ID
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (i + 1 == id) {
                System.out.println("Found: " + itemsOrdered.get(i).toString());
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No item found with ID: " + id);
    }

    // Search by title
    public void searchByTitle(String keyword) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.getTitle() != null && 
                m.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + m.toString());
                found = true;
            }
        }
        if (!found) System.out.println("No item found with title: " + keyword);
    }
}