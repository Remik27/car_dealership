package zajavka.pl.service;

import zajavka.pl.domain.ServiceMechanic;

import java.util.List;

public interface ServiceMechanicServiceImpl {
    void add(List<ServiceMechanic> records);
    ServiceMechanic find(Integer id);

    void delete(ServiceMechanic record);
}
