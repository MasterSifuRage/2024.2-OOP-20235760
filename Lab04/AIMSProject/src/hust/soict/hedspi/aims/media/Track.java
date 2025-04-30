package hust.soict.hedspi.aims.media;

import java.io.Serializable;
import java.util.Objects;

public class Track implements Playable, Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String play() {
        return "Playing track: " + title + "\nTrack length: " + length + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return title.equals(other.title) && length == other.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}