package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Mechanic;

import java.util.List;
@RequiredArgsConstructor
public class MechanicServiceImpl implements MechanicService {
    private final MechanicRepository mechanicRepository;
    public void add(List<Mechanic> records){
        mechanicRepository.add(records);
    }
    public Mechanic find(Integer id){
        return mechanicRepository.find(id);
    }

    public void delete(Mechanic record){
        mechanicRepository.delete(record);
    }

    @Override
    public void add(String values) {

    }
}
