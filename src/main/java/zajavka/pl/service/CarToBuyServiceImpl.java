package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.CarToBuy;

import java.util.List;
@RequiredArgsConstructor
public class CarToBuyServiceImpl implements CarToBuyService {
    private final CarToBuyRepository carToBuyRepository;
    public void add(List<CarToBuy> records){
        carToBuyRepository.add(records);
    }
    public CarToBuy find(Integer id){
        return carToBuyRepository.find(id);
    }

    public void delete(CarToBuy record){
        carToBuyRepository.delete(record);
    }
}
