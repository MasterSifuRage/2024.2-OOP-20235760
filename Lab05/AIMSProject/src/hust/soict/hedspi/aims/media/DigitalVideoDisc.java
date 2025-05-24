package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length; // Độ dài (phút)

    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    // Getters
    public String getDirector() { return director; }
    public int getLength() { return length; }

    // Setters
    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength() + " minutes");
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }
}