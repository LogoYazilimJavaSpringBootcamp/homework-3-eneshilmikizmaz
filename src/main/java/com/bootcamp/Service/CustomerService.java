package com.bootcamp.Service;

import com.bootcamp.Model.Customer;
import com.bootcamp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public String create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(int id) {
        return customerRepository.findById(id);
    }

    public String updateCustomer(Customer customer) {
        return customerRepository.update(customer);
    }

    public String deleteCustomer(int id) {
        return customerRepository.delete(id);
    }

    public List<Customer> findByStatus(Boolean status) {
        return customerRepository.findByStatus(status);
    }
}
