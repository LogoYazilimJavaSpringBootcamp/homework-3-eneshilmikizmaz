package com.bootcamp.Repository;

import com.bootcamp.Model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CustomerRepository {

    private static List<Customer> customerList = new ArrayList<>();


    public List<Customer> findAll() {
        return customerList;
    }

    public String save(Customer customer) {
        customerList.add(customer);
        return customer + " kaydedildi.";
    }

    public Customer findById(int id) {
        return customerList.stream().filter(customer -> customer.getId() == id).findAny().orElseThrow();
    }

    public String update(Customer customer) {
        Customer oldCustomer = findById(customer.getId());
        oldCustomer.setName(customer.getName());
        oldCustomer.setCity(customer.getCity());
        oldCustomer.setPhoneNumber(customer.getPhoneNumber());
        oldCustomer.setBalance(customer.getBalance());
        oldCustomer.setIsActive(customer.getIsActive());
        oldCustomer.setCustomerType(customer.getCustomerType());
        return customer.getId() + " ID li customer'a ait bilgiler güncellendi.";
    }

    public String delete(int id) {
        customerList.remove(findById(id));
        return id + " ID li customer silindi";
    }

    public List<Customer> findByStatus(Boolean status) {
        return customerList.stream().filter(customer -> customer.getIsActive() == status).collect(Collectors.toList());
    }

}
