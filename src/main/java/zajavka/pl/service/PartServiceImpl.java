package zajavka.pl.service;

import zajavka.pl.domain.Part;

import java.util.List;

public interface PartServiceImpl {
    void add(List<Part> records);
    Part find(Integer id);

    void delete(Part record);
}
