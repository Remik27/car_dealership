package zajavka.pl.service;

import zajavka.pl.domain.Address;

import java.util.List;

public interface AddressServiceImpl {
    void add(List<Address> records);
    Address find(Integer id);

    void delete(Address record);
}
