package zajavka.pl.service;

import zajavka.pl.domain.CarToBuy;

import java.util.List;

public interface CarToBuyService {
    void add(List<CarToBuy> records);
    CarToBuy find(Integer id);

    void delete(CarToBuy record);

    void add(String values);
}
