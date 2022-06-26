package com.bootcamp.Model;

import lombok.ToString;

@ToString
public class Service extends Consumption {

    private int serviceCode;

    public Service(int id, String name, int fee, int serviceCode) {
        super(id, name, fee);
        this.serviceCode = serviceCode;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }


}
