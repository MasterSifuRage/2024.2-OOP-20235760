package hust.soict.hedspi.aims.media;

import java.io.Serializable;

public abstract class Disc extends Media implements Serializable {
    private static final long serialVersionUID = 1L;
    private int length;
    private String director;

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}