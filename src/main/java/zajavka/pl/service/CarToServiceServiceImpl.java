package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.CarToService;

import java.util.List;
@RequiredArgsConstructor
public class CarToServiceServiceImpl implements CarToServiceService {
    private final CarToServiceRepository carToServiceRepository;
    public void add(List<CarToService> records){
        carToServiceRepository.add(records);
    }
    public CarToService find(Integer id){
        return carToServiceRepository.find(id);
    }

    public void delete(CarToService record){
        carToServiceRepository.delete(record);
    }
}
