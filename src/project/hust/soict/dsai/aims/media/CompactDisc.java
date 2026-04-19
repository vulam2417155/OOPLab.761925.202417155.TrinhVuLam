package project.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {
        super();
    }

    public CompactDisc(String title, String category, String artist, String director, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.artist = artist;
        this.setDirector(director);
        this.setCost(cost);
    }

    // Getter
    public String getArtist() { return artist; }

    // Override getLength() to sum all track lengths
    @Override
    public int getLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    // Implement play()
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track t : tracks) {
            t.play();
        }
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory()
            + " - " + artist + " - " + getDirector()
            + " - " + getLength() + ": " + getCost() + " $";
    }
}