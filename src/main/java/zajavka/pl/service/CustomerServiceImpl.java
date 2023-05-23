package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Customer;

import java.util.List;
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    public void add(List<Customer> records){
        customerRepository.add(records);
    }
    public Customer find(Integer id){
        return customerRepository.find(id);
    }

    public void delete(Customer record){
        customerRepository.delete(record);
    }
}
