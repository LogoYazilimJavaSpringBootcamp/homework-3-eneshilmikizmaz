package com.bootcamp.Service;

import com.bootcamp.Model.Consumption;
import com.bootcamp.Model.Invoice;
import com.bootcamp.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    public List<Invoice> findAllInvoices() {
        return invoiceRepository.findAll();
    }

    public String create(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public String updateInvoice(Invoice invoice) {
        return invoiceRepository.update(invoice);
    }

    public String deleteInvoice(int id) {
        return invoiceRepository.delete(id);
    }

    public String updateByConsumptions(int id,Consumption consumption) {
        return invoiceRepository.addConsumption(id, consumption);
    }
}
