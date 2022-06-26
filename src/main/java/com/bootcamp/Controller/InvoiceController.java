package com.bootcamp.Controller;

import com.bootcamp.Model.Consumption;
import com.bootcamp.Model.Invoice;
import com.bootcamp.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("invoices")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping
    public List<Invoice> getAllInvoices(){
        return invoiceService.findAllInvoices();
    }

    @PostMapping
    public String createInvoice(@RequestBody Invoice invoice) {
        return invoiceService.create(invoice);
    }

    @PutMapping
    public String updateInvoice(@RequestBody Invoice invoice){
        return invoiceService.updateInvoice(invoice);
    }
    @PostMapping("/{id}")
    public String updateInvoiceConsumptionList(@PathVariable int id, @RequestBody Consumption consumption){
        return invoiceService.updateByConsumptions(id,consumption);
    }

    @DeleteMapping("/{id}")
    public String deleteInvoice(@PathVariable int id){
        return  invoiceService.deleteInvoice(id);
    }
}
