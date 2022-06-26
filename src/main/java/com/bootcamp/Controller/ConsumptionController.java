package com.bootcamp.Controller;

import com.bootcamp.Model.Consumption;
import com.bootcamp.Model.Product;
import com.bootcamp.Model.Service;
import com.bootcamp.Service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("consumptions")
public class ConsumptionController {
    @Autowired
    ConsumptionService consumptionService;
    @GetMapping
    public List<Consumption> getAllUser(){
        return consumptionService.findAllConsumptions();
    }

    @PostMapping("/{product}")
    public String createConsumption(@RequestBody Product product) {
        return consumptionService.createProduct(product);
    }

    @PostMapping("/{service}")
    public String createConsumption(@RequestBody Service service) {
        return consumptionService.createService(service);
    }

    @PutMapping("/{product}")
    public String updateConsumption(@RequestBody Product product){
        return consumptionService.updateProduct(product);
    }
    @PutMapping("/{service}")
    public String updateConsumption(@RequestBody Service service){
        return consumptionService.updateService(service);
    }

    @DeleteMapping("/{id}")
    public String deleteConsumption(@PathVariable int id){
        return  consumptionService.deleteConsumption(id);
    }



}
