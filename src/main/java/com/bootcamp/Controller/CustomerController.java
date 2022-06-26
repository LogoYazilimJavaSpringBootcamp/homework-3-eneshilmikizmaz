package com.bootcamp.Controller;

import com.bootcamp.Model.Customer;
import com.bootcamp.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        return customerService.create(customer);
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id){
       return customerService.findCustomerById(id);
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id){
        return  customerService.deleteCustomer(id);
    }
    //Aktif Pasif Müşterileri listeler.
    @GetMapping("/{isActive}")
    public List<Customer> getCustomerByStatus(@PathVariable Boolean status){
        return customerService.findByStatus(status);
    }
}
