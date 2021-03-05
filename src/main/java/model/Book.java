package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String title;
    int published;

    public Book() {
    }

    public Book(Integer id, String title, int published) {
        this.id = id;
        this.title = title;
        this.published = published;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 69 * hash + Objects.hashCode(this.id);
        hash = 69 * hash + Objects.hashCode(this.title);
        hash = 69 * hash + this.published;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.published != other.published) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(this.id);
        sb.append(", title='").append(this.title);
        sb.append(", published=").append(this.published);
        sb.append('}');
        return sb.toString();
    }

}
