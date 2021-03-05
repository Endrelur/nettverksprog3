package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(BookAuthorId.class)
public class BookAuthor implements Serializable {

    @Id
    private Integer bookId;

    @Id
    private Integer authorId;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public BookAuthor(Integer bookId, Integer authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }

    public BookAuthor() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthor bookAuthor = (BookAuthor) o;
        return this.authorId.equals(bookAuthor.authorId) &&
                this.bookId.equals(bookAuthor.bookId);
    }
}
