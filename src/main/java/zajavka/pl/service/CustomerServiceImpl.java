package zajavka.pl.service;

import zajavka.pl.domain.Customer;

import java.util.List;

public interface CustomerServiceImpl {
    void add(List<Customer> records);
    Customer find(Integer id);

    void delete(Customer record);
}
