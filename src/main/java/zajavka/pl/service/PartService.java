package zajavka.pl.service;

import zajavka.pl.domain.Part;

import java.util.List;

public interface PartService {
    void add(List<Part> records);
    Part find(Integer id);

    void delete(Part record);

    void add(String values);
}
