package model;

import java.io.Serializable;
import java.util.Objects;


public class BookAuthorId implements Serializable {

    private Integer bookId;
    private Integer authorId;

    public BookAuthorId(Integer bookId, Integer authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }

    public BookAuthorId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthorId bookAuthorId = (BookAuthorId) o;
        return this.authorId.equals(bookAuthorId.authorId) &&
                this.bookId.equals(bookAuthorId.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bookId, this.authorId);
    }
}
