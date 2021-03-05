package repo;

import model.BookAuthor;
import model.BookAuthorId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookAuthorRepo extends CrudRepository<BookAuthor, BookAuthorId> {
    List<BookAuthor> findByAuthorId(Integer authorId);

    List<BookAuthor> findByBookId(Integer bookId);
}
