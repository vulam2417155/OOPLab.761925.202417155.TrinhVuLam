package project.hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
    }

    // Getters
    public int getLength() { return length; }
    public String getDirector() { return director; }

    // Setters
    public void setLength(int length) { this.length = length; }
    public void setDirector(String director) { this.director = director; }
}