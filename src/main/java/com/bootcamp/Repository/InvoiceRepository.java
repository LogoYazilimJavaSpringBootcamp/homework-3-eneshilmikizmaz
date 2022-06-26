package com.bootcamp.Repository;

import com.bootcamp.Model.Consumption;
import com.bootcamp.Model.Invoice;
import com.bootcamp.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InvoiceRepository {

    private static List<Invoice> invoiceList = new ArrayList<>();
    public List<Invoice> findAll() {
        return invoiceList;
    }

    public String save(Invoice invoice) {
        invoiceList.add(invoice);
        return invoice + " kaydedildi.";
    }
    private Invoice findById(int id) {
        return invoiceList.stream().filter(user -> user.getId() == id).findAny().orElseThrow();
    }
    public String update(Invoice invoice) {
        Invoice oldInvoice = findById(invoice.getId());
        oldInvoice.setInvoiceDate(invoice.getInvoiceDate());
        oldInvoice.setInvoiceAmount(invoice.getInvoiceAmount());
        return invoice.getId() + " ID li invoice'a ait bilgiler güncellendi.";
    }

    public String delete(int id) {
        invoiceList.remove(findById(id));
        return id + " ID li invoice silindi";
    }

    public String addConsumption(int id,Consumption consumption) {
        Invoice oldInvoice = findById(id);
        oldInvoice.addConsumptionObjList(consumption);
        return consumption + " faturaya eklendi";
    }
}
