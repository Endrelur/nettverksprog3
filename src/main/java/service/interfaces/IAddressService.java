package service.interfaces;

import model.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();

    Address findAddress(Integer id);

    void deleteAddress(Integer id);

    void addAddress(Address address);

    void updateAddress(Address address);
}
