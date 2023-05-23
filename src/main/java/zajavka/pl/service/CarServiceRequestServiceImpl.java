package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.CarServiceRequest;

import java.util.List;
@RequiredArgsConstructor
public class CarServiceRequestServiceImpl implements CarServiceRequestService {
    private final CarServiceRequestRepository carServiceRequestRepository;
    public void add(List<CarServiceRequest> records){
        carServiceRequestRepository.add(records);
    }
    public CarServiceRequest find(Integer id){
        return carServiceRequestRepository.find(id);
    }

    public void delete(CarServiceRequest record){
        carServiceRequestRepository.delete(record);
    }
}
