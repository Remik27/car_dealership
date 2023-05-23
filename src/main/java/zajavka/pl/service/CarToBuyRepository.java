package zajavka.pl.service;

import zajavka.pl.domain.CarToBuy;

import java.util.List;

public interface CarToBuyRepository {
    void add(List<CarToBuy> records);
    CarToBuy find(Integer id);

    void delete(Integer id);
}
