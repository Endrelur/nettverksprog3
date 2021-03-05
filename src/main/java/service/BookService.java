package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.BookRepository;
import service.interfaces.IBookService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository repo;


    @Override
    public List<Book> findAll() {
        return (List<Book>) repo.findAll();
    }

    @Override
    public Book getBook(Integer id) {
        return repo.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void deleteBook(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public void addBook(Book book) {
        repo.save(book);
    }

    @Override
    public void updateBook(Book book) {
        if (repo.existsById(book.getId())) {
            repo.deleteById(book.getId());
            repo.save(book);
        }
    }
}
