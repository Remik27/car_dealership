package zajavka.pl.service;

import zajavka.pl.domain.Salesman;

import java.util.List;

public interface SalesmanService {
    void add(List<Salesman> records);
    Salesman find(Integer id);

    void delete(Salesman record);

    void add(String values);
}
