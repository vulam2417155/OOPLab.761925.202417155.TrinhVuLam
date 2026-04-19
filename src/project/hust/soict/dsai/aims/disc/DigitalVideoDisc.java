package project.hust.soict.dsai.aims.disc;

import project.hust.soict.dsai.aims.media.Disc;
import project.hust.soict.dsai.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable {

    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // Constructors
    public DigitalVideoDisc() {
        super();
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getters
    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Implement play()
    @Override
    public void play() {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            System.out.println("This DVD cannot be played.");
        }
    }

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory()
                + " - " + getDirector() + " - " + getLength()
                + ": " + getCost() + " $";
    }

    public boolean isMatch(String keyword) {
        String[] words = keyword.split(" ");
        for (String word : words) {
            if (getTitle().toLowerCase().contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}