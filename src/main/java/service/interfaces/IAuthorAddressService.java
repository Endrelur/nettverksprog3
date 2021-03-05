package service.interfaces;

import model.Address;
import model.Author;

import java.util.List;

public interface IAuthorAddressService {

    List<Address> getAuthorAddress(Integer authorId);

    void saveAuthorAddress(Author author, Address address);

    void deleteAuthorAddress(Integer authorId);
}
