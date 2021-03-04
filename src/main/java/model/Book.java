package model;

public class Book {
    long id;
    String title;
    int published;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublished() {
        return published;
    }

    Book(long id, String title, int published){
        this.title = title;
        this.id = id;
        this.published = published;
    }
}
