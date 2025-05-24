package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track {
    private String title;
    private int length; // Độ dài (giây)

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() { return title; }
    public int getLength() { return length; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setLength(int length) { this.length = length; }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength() + " seconds");
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    }
}