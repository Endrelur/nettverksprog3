package service;

import model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.AddressRepository;
import service.interfaces.IAddressService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AddressService implements IAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public List<Address> findAll() {
        return (List<Address>) repo.findAll();
    }

    @Override
    public Address findAddress(Integer id) {
        return repo.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void deleteAddress(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public void addAddress(Address address) {
        repo.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        if (repo.existsById(address.getId())) {
            repo.deleteById(address.getId());
            repo.save(address);
        } else
            throw new NoSuchElementException();
    }

}
