package zajavka.pl.service;

import zajavka.pl.domain.Service;

import java.util.List;

public interface ServiceRepository {
    void add(List<Service> records);
    Service find(Integer id);

    void delete(Service record);
}
