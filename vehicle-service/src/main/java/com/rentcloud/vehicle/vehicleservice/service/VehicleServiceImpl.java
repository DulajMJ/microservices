package com.rentcloud.vehicle.vehicleservice.service;

import com.rentcloud.vehicle.vehicleservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vehicale.Vehicle;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle findById(int id) {
        Optional<Vehicle> optionalVehicle=vehicleRepository.findById(id);
        if(optionalVehicle.isPresent()){
            return optionalVehicle.get();
        }else{
            return new Vehicle();
        }

    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }
}
