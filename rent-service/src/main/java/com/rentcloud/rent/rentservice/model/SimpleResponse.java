package com.rentcloud.rent.rentservice.model;

import lombok.Data;
import rent.Rent;

@Data
public class SimpleResponse implements Response {

    Rent rent;

    public SimpleResponse(Rent rent){
        this.rent=rent;
    }
}
