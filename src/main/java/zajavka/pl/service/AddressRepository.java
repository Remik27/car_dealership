package zajavka.pl.service;

import zajavka.pl.domain.Address;

import java.util.List;

public interface AddressRepository {
    void add(List<Address> records);
    Address find(Integer id);

    void delete(Integer id);
}
