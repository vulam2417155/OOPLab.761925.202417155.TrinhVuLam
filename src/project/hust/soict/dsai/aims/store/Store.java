package project.hust.soict.dsai.aims.store;

import java.util.ArrayList;
import project.hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Add media to store
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media already exists in store: " + media.getTitle());
        } else {
            itemsInStore.add(media);
            System.out.println("Added to store: " + media.getTitle());
        }
    }

    // Remove media from store
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in store: " + media.getTitle());
        }
    }

    // Print all items in store
    public void print() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }

    // Search by title
    public void searchByTitle(String keyword) {
        boolean found = false;
        for (Media m : itemsInStore) {
            if (m.getTitle() != null &&
                m.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + m.toString());
                found = true;
            }
        }
        if (!found) System.out.println("No item found with title: " + keyword);
    }

    // Getter for itemsInStore
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}