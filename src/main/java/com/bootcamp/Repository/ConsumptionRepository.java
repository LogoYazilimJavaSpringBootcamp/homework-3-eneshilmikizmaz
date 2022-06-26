package com.bootcamp.Repository;

import com.bootcamp.Model.Consumption;
import com.bootcamp.Model.Product;
import com.bootcamp.Model.Service;
import com.bootcamp.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConsumptionRepository {

    private static List<Consumption> consumptionList = new ArrayList<>();
    public List<Consumption> findAll() {
    return consumptionList;
    }

    public String save(Consumption consumption) {
        consumptionList.add(consumption);
        return consumption + " kaydedildi.";
    }
    public Consumption findById(int id) {
        return consumptionList.stream().filter(consumption -> consumption.getId() == id).findAny().orElseThrow();
    }

    public String delete(int id) {
        consumptionList.remove(id);
        return id + " ID li consumption silindi";
    }

    public String saveProduct(Product product) {
        consumptionList.add(product);
        return product + " kaydedildi.";
    }

    public String saveService(Service service) {
        consumptionList.add(service);
        return service + " kaydedildi.";
    }

    public String updateProduct(Product product) {
        Product oldProduct = (Product) findById(product.getId());
        oldProduct.setBarcode(product.getBarcode());
        oldProduct.setBrand(product.getBrand());
        oldProduct.setName(product.getName());
        oldProduct.setFee(product.getFee());
        return product.getId() + " ID li product'a ait bilgiler güncellendi.";

    }

    public String updateService(Service service) {
        Service oldService = (Service) findById(service.getId());
        oldService.setServiceCode(service.getServiceCode());
        oldService.setName(service.getName());
        oldService.setFee(service.getFee());
        return service.getId() + " ID li service'e ait bilgiler güncellendi.";
    }
}
