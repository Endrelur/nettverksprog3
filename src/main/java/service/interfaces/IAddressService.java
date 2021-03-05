package service.interfaces;

import model.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();
    Address findAddress(Integer id);
    Address deleteAddress(Integer id);
    void addAddress(Address address);
    void updateAddress(Integer id, Address address);
}
