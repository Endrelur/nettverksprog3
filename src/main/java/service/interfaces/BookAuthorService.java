package service.interfaces;

import model.Author;
import model.Book;
import model.BookAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import repo.AuthorRepository;
import repo.BookAuthorRepo;
import repo.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BookAuthorService implements IBookAuthorService {

    @Autowired
    BookAuthorRepo bookAuthorRepo;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Book> findBooksByAuthor(Integer authorId) {
        List<BookAuthor> bookAuthorList = bookAuthorRepo.findByAuthorId(authorId);
        List<Book> books = new ArrayList<>();
        bookAuthorList.forEach(bookAuthor -> {
            books.add(bookRepository
                    .findById(bookAuthor.getBookId()).orElseThrow(NoSuchElementException::new));
        });
        return books;
    }

    @Override
    public List<Author> findAuthorsOfBook(Integer id) {
        List<BookAuthor> bookAuthorList = bookAuthorRepo.findByBookId(id);
        List<Author> authors = new ArrayList<>();
        bookAuthorList.forEach(bookAuthor -> {
            authors.add(authorRepository.
                    findById(bookAuthor.getBookId()).orElseThrow(NoSuchElementException::new));
        });
        return authors;
    }

    @Override
    public void saveBookAuthor(Integer authorId, Integer bookId) {
        BookAuthor ba = new BookAuthor(authorId, bookId);
    }

    @Override
    public void deleteBooksByAuthor(Integer authorId) {
        //TODO: implementer
    }

    @Override
    public void deleteAuthorFromBook(Integer authorId, Integer bookId) {
        //TODO:: implementer
    }
}
