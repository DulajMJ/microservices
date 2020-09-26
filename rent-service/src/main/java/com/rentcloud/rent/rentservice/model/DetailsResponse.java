package com.rentcloud.rent.rentservice.model;

import customer.Customer;
import lombok.Data;
import rent.Rent;
import vehicale.Vehicle;

@Data
public class DetailsResponse implements Response {

    Rent rent;
    Vehicle vehicle;
    Customer customer;

    public DetailsResponse(Rent rent,Vehicle vehicle,Customer customer){
        this.rent=rent;
        this.vehicle=vehicle;
        this.customer=customer;
    }
}
