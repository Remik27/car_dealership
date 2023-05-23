package zajavka.pl.service;

import zajavka.pl.domain.Mechanic;

import java.util.List;

public interface MechanicReposotory {
    void add(List<Mechanic> records);
    Mechanic find(Integer id);

    void delete(Mechanic record);
}
