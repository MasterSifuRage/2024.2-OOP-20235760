package hust.soict.hedspi.aims.media;

import java.io.Serializable;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Serializable {
    private static final long serialVersionUID = 1L;
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    private static int nbCompactDiscs = 0;

    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
        setId(++nbCompactDiscs);
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " +
               artist + " - " + getLength() + ": " + getCost() + " $";
    }

    @Override
    public String play() {
        StringBuilder playMessage = new StringBuilder();
        playMessage.append("Playing CD: ").append(getTitle()).append("\n");
        playMessage.append("Artist: ").append(artist).append("\n");
        for (Track track : tracks) {
            playMessage.append(track.play());
        }
        return playMessage.toString();
    }
}