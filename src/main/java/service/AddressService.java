package service;

import model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import repo.AddressRepository;
import service.interfaces.IAddressService;

import java.util.List;

public class AddressService implements IAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public List<Address> findAll() {
        return (List<Address>) repo.findAll();
    }
}
