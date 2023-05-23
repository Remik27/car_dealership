package zajavka.pl.service;

import zajavka.pl.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    void add(List<Customer> records);
    Customer find(Integer id);

    void delete(Integer id);
}
