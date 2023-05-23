package zajavka.pl.service;

import zajavka.pl.domain.CarToBuy;

import java.util.List;

public interface CarToBuyServiceImpl {
    void add(List<CarToBuy> records);
    CarToBuy find(Integer id);

    void delete(CarToBuy record);
}
