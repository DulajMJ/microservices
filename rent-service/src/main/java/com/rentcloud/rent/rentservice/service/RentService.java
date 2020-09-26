package com.rentcloud.rent.rentservice.service;

import com.rentcloud.rent.rentservice.model.DetailsResponse;
import com.rentcloud.rent.rentservice.model.Response;
import rent.Rent;

import java.util.List;

public interface RentService {
    Rent save(Rent rent);

    Rent findById(int id);

    List<Rent> findAll();

    DetailsResponse findDetailsResponse(int id);

}
