package service;

import model.Address;
import model.Author;
import model.AuthorAddress;
import org.springframework.beans.factory.annotation.Autowired;
import repo.AddressRepository;
import repo.AuthorAddressRepo;
import service.interfaces.IAuthorAddressService;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class AuthorAddressService implements IAuthorAddressService {

    @Autowired
    AuthorAddressRepo authorAddressRepo;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> getAuthorAddress(Integer authorId) {
        List<AuthorAddress> authorAddresses = authorAddressRepo.findByAuthorId(authorId);
        List<Address> addresses = new ArrayList<>();
        authorAddresses.forEach(authorAddress -> {
            addresses.add(addressRepository.
                    findById(authorAddress.getAddressId()).orElseThrow(NoSuchElementException::new));
        });
        return addresses;
    }

    @Override
    public void saveAuthorAddress(Author author, Address address) {
        AuthorAddress aa = new AuthorAddress(author.getId(), address.getId());
        authorAddressRepo.save(aa);
    }

    @Override
    public void deleteAuthorAddress(Integer authorId) {
        List<AuthorAddress> aa = authorAddressRepo.findByAuthorId(authorId);
        authorAddressRepo.deleteAll(aa);
    }
}
