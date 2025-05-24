package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCategory(String category) { this.category = category; }
    public void setCost(float cost) { this.cost = cost; }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Media)) return false;
        Media other = (Media) obj;
        return this.title.equals(other.title) && this.cost == other.cost;
    }

    @Override
    public int compareTo(Media other) {
        if (other == null) throw new NullPointerException("Cannot compare with null");
        return this.title.compareTo(other.title);
    }
}