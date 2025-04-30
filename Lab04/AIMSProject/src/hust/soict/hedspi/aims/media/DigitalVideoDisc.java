package hust.soict.hedspi.aims.media;

import java.io.Serializable;

public class DigitalVideoDisc extends Disc implements Playable, Serializable {
    private static final long serialVersionUID = 1L;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        setId(++nbDigitalVideoDiscs);
    }

    public static int getTotalDVDs() {
        return nbDigitalVideoDiscs;
    }

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " +
               getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }

    @Override
    public String play() {
        if (getLength() <= 0) {
            return "This DVD cannot be played because its length is 0 or less.\n";
        } else {
            return "Playing DVD: " + getTitle() + "\nDVD length: " + getLength() + "\n";
        }
    }
}