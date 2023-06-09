package zajavka.pl.service;

import zajavka.pl.domain.CarServiceRequest;

import java.util.List;

public interface CarServiceRequestRepository {
    void add(List<CarServiceRequest> records);
    CarServiceRequest find(Integer id);

    void delete(CarServiceRequest record);
}
