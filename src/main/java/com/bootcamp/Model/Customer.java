package com.bootcamp.Model;

import com.bootcamp.Model.Enums.CustomerType;
import com.bootcamp.Repository.UserRepository;
import lombok.ToString;

import java.util.List;
@ToString
public class Customer {
    private int id;
    private String name;
    private String city;
    private String phoneNumber;
    private int balance;
    private Boolean isActive;
    private CustomerType customerType;
    private List<Invoice> invoiceList;

    public Customer(int id, String name, String city, String phoneNumber, int balance, Boolean isActive, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.isActive = isActive;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
}
