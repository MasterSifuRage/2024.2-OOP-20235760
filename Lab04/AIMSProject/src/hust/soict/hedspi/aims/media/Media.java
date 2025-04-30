package hust.soict.hedspi.aims.media;

import java.io.Serializable;

public abstract class Media implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Media - " + title + " - " + category + ": " + cost + " $";
    }
}