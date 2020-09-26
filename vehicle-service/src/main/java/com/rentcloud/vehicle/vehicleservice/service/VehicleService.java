package com.rentcloud.vehicle.vehicleservice.service;

import vehicale.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
