package com.bootcamp.Model;

import lombok.ToString;

@ToString
public class Product extends Consumption {
    private String brand;
    private int barcode;

    public Product(int id, String name, int fee, String brand, int barcode) {
        super(id, name, fee);
        this.brand = brand;
        this.barcode = barcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }



}
