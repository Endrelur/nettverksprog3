package service;

import model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.AuthorRepository;
import service.interfaces.IAuthorService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuthorService implements IAuthorService {

    @Autowired
    AuthorRepository repo;

    @Override
    public List<Author> findAll() {
        return (List<Author>) repo.findAll();
    }

    @Override
    public Author getAuthor(Integer id) {
        return repo.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void deleteAuthor(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public void addAuthor(Author author) {
        repo.save(author);
    }

    @Override
    public void updateAuthor(Author author) {
        if (repo.existsById(author.getId())) {
            repo.deleteById(author.getId());
            repo.save(author);
        } else
            throw new NoSuchElementException();
    }
}
