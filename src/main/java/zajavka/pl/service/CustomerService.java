package zajavka.pl.service;

import zajavka.pl.domain.Customer;

import java.util.List;

public interface CustomerService {
    void add(List<Customer> records);
    Customer find(Integer id);

    void delete(Customer record);

    Customer findByEmail(String value);

    Customer create(String[] customerInString);
}
