package service.interfaces;

import model.Author;
import model.Book;

import java.util.List;

public interface IBookAuthorService {
    List<Book> findBooksByAuthor(Integer id);

    List<Author> findAuthorsOfBook(Integer id);

    void saveBookAuthor(Integer authorId, Integer bookId);

    void deleteBooksByAuthor(Integer authorId);

    void deleteAuthorFromBook(Integer authorId, Integer bookId);
}
