package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;

    public DigitalVideoDisc(String title) {
        super(title);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        setId(++nbDigitalVideoDiscs);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        setId(++nbDigitalVideoDiscs);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public static int getTotalDVDs() {
        return nbDigitalVideoDiscs;
    }
}