package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Service;

import java.util.List;
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService{
    private final ServiceRepository serviceRepository;
    public void add(List<Service> records){
        serviceRepository.add(records);
    }
    public Service find(Integer id){
        return serviceRepository.find(id);
    }

    public void delete(Service record){
        serviceRepository.delete(record);
    }
}
