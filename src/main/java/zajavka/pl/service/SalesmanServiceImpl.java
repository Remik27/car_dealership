package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Salesman;

import java.util.List;
@RequiredArgsConstructor
public class SalesmanServiceImpl implements SalesmanService{
    private final SalesmanRepository salesmanRepository;
    public void add(List<Salesman> records){
        salesmanRepository.add(records);
    }
    public Salesman find(Integer id){
        return salesmanRepository.find(id);
    }

    public void delete(Salesman record){
        salesmanRepository.delete(record);
    }
}
