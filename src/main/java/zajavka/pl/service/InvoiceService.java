package zajavka.pl.service;

import zajavka.pl.domain.Invoice;

import java.util.List;

public interface InvoiceService {
    void add(List<Invoice> records);
    Invoice find(Integer id);

    void delete(Invoice record);
}
