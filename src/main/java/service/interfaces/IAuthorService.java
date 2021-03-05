package service.interfaces;

import model.Author;

import java.util.List;

public interface IAuthorService {

    List<Author> findAll();

    Author getAuthor(Integer id);

    void deleteAuthor(Integer id);

    void addAuthor(Author author);

    void updateAuthor(Author author);

}
