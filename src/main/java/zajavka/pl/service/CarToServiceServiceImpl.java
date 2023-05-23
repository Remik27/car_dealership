package zajavka.pl.service;

import zajavka.pl.domain.CarToService;

import java.util.List;

public interface CarToServiceServiceImpl {
    void add(List<CarToService> records);
    CarToService find(Integer id);

    void delete(CarToService record);
}
