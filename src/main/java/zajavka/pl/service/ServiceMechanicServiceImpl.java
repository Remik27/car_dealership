package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.ServiceMechanic;

import java.util.List;
@RequiredArgsConstructor
public class ServiceMechanicServiceImpl implements ServiceMechanicService {
    private final ServiceMechanicRepository serviceMechanicServiceRepository;
    public void add(List<ServiceMechanic> records){
        serviceMechanicServiceRepository.add(records);
    }
    public ServiceMechanic find(Integer id){
        return serviceMechanicServiceRepository.find(id);
    }

    public void delete(ServiceMechanic record){
        serviceMechanicServiceRepository.delete(record);
    }

    @Override
    public void doTheService(String[] values) {

    }
}
