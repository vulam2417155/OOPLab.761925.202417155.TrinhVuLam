package project.hust.soict.dsai.aims.media;

public abstract class Media {
    private String title;
    private String category;
    private float cost;

    public Media() {}

    // Getters
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setCategory(String category) { this.category = category; }
    public void setCost(float cost) { this.cost = cost; }
}