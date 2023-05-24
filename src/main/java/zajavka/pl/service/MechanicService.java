package zajavka.pl.service;

import zajavka.pl.domain.Mechanic;

import java.util.List;

public interface MechanicService {
    void add(List<Mechanic> records);
    Mechanic find(Integer id);

    void delete(Mechanic record);

    void add(String values);
}
