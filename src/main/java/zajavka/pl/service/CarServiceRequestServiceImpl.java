package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.CarServiceRequest;
import zajavka.pl.domain.CarToBuy;
import zajavka.pl.domain.CarToService;
import zajavka.pl.domain.Customer;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CarServiceRequestServiceImpl implements CarServiceRequestService {
    private final CarServiceRequestRepository carServiceRequestRepository;
    private final CustomerService customerService;
    private final CarToServiceService carToServiceService;

    public void add(List<CarServiceRequest> records) {
        carServiceRequestRepository.add(records);
    }

    public CarServiceRequest find(Integer id) {
        return carServiceRequestRepository.find(id);
    }

    public void delete(CarServiceRequest record) {
        carServiceRequestRepository.delete(record);
    }

    @Override
    public void add(String[] values) {
        Customer customer = getCustomer(values);
        CarToService carToService = getCar(values);
        String customerComment = values[values.length - 1];
        CarServiceRequest carServiceRequest = CarServiceRequest.builder()
                .customer(customer)
                .carToService(carToService)
                .customerComment(customerComment)
                .build();
    carServiceRequestRepository.add(List.of(carServiceRequest));

    }

    private CarToService getCar(String[] values) {
        String[] carInString = values[4].split(";");
        if (carInString.length > 1) {
            return carToServiceService.create(carInString);
        } else if (carInString.length == 1) {
            return carToServiceService.addFromBought(carInString[0]);
        } else {
            throw new RuntimeException("None information about car");
        }
    }

    private Customer getCustomer(String[] values) {
        String[] customerInString = values[2].split(";");
        if (customerInString.length > 1) {
            return customerService.create(customerInString);
        } else if (customerInString.length == 1) {
            return customerService.findByEmail(customerInString[0]);
        } else {
            throw new RuntimeException("None information about customer");
        }
    }
}
