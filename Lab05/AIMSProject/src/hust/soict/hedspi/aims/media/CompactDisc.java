package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;
import java.util.ArrayList;
import java.util.Iterator;

public class CompactDisc extends Media {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);
        this.artist = artist;
    }

    // Getters
    public String getArtist() { return artist; }
    public ArrayList<Track> getTracks() { return tracks; }

    // Setters
    public void setArtist(String artist) { this.artist = artist; }
    public void addTrack(Track track) { tracks.add(track); }
    public void removeTrack(Track track) { tracks.remove(track); }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD length: " + this.getLength() + " minutes");
            Iterator<Track> iter = tracks.iterator();
            while (iter.hasNext()) {
                Track track = iter.next();
                try {
                    track.play();
                } catch (PlayerException e) {
                    throw e;
                }
            }
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }
}