package zajavka.pl.service;

import zajavka.pl.domain.Salesman;

import java.util.List;

public interface SalesmanRepository {
    void add(List<Salesman> records);
    Salesman find(Integer id);

    void delete(Salesman record);
}
