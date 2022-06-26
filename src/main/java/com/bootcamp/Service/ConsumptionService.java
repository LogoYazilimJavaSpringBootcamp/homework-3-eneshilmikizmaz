package com.bootcamp.Service;

import com.bootcamp.Model.Consumption;
import com.bootcamp.Model.Invoice;
import com.bootcamp.Model.Product;
import com.bootcamp.Repository.ConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumptionService {
    @Autowired
    ConsumptionRepository consumptionRepository;

    public List<Consumption> findAllConsumptions(){
        return consumptionRepository.findAll();
    }
    public String create(Consumption consumption){
        return consumptionRepository.save(consumption);
    }

    public String deleteConsumption(int id) {
        return consumptionRepository.delete(id);
    }


    public String createProduct(Product product) {
        return consumptionRepository.saveProduct(product);
    }

    public String createService(com.bootcamp.Model.Service service) {
        return consumptionRepository.saveService(service);
    }

    public String updateProduct(Product product) {
        return consumptionRepository.updateProduct(product);
    }

    public String updateService(com.bootcamp.Model.Service service) {
        return consumptionRepository.updateService(service);
    }
}
