package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    int birthdate;

    public Author() {
    }

    public Author(Integer id, String name, int birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 33 * hash + Objects.hashCode(this.id);
        hash = 33 * hash + Objects.hashCode(this.name);
        hash = 33 * hash + this.birthdate;
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
        final Author other = (Author) obj;
        if (this.birthdate != other.birthdate) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("id=").append(this.id);
        sb.append(", name='").append(this.name);
        sb.append(", birthdate=").append(this.birthdate);
        sb.append('}');
        return sb.toString();
    }
}
