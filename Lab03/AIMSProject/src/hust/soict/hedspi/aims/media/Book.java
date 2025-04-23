package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();
    private static int nbBooks = 0;

    public Book(String title) {
        super(title);
        setId(++nbBooks);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        setId(++nbBooks);
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + " - " +
               authors + ": " + getCost() + " $";
    }
}