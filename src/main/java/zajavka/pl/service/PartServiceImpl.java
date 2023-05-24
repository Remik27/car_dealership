package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Part;

import java.util.List;
@RequiredArgsConstructor
public class PartServiceImpl implements PartService {
    private final PartRepository partRepository;
    public void add(List<Part> records){
        partRepository.add(records);
    }
    public Part find(Integer id){
        return partRepository.find(id);
    }

    public void delete(Part record){
        partRepository.delete(record);
    }

    @Override
    public void add(String values) {

    }
}
