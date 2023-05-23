package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Address;

import java.util.List;
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{
    private final AddressRepository addressRepository;
    public void add(List<Address> records){
        addressRepository.add(records);
    }
    public Address find(Integer id){
        return addressRepository.find(id);
    }

    public void delete(Address record){
        addressRepository.delete(record);
    }
}
