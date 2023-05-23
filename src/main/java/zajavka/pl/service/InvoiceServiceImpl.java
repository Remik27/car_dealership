package zajavka.pl.service;

import lombok.RequiredArgsConstructor;
import zajavka.pl.domain.Invoice;

import java.util.List;
@RequiredArgsConstructor
public class InvoiceServiceImpl {
    private final InvoiceRepository invoiceRepository;
    public void add(List<Invoice> records){
        invoiceRepository.add(records);
    }
    public Invoice find(Integer id){
        return invoiceRepository.find(id);
    }

    public void delete(Invoice record){
        invoiceRepository.delete(record);
    }
}
