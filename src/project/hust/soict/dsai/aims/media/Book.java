package project.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book() {}

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Added author: " + authorName);
        } else {
            System.out.println("Author already exists.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Removed author: " + authorName);
        } else {
            System.out.println("Author not found.");
        }
    }
    public Book(String title, String category, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }
}