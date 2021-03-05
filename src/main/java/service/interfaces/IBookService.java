package service.interfaces;

import model.Book;

import java.util.List;

public interface IBookService {

    List<Book> findAll();

    Book getBook(Integer id);

    void deleteBook(Integer id);

    void addBook(Book book);

    void updateBook(Book book);
}
