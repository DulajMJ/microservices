package com.rentcloud.vehicle.vehicleservice.controller;

import com.rentcloud.vehicle.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicale.Vehicle;

import java.util.List;

@RestController
@RequestMapping("/service/vehicle")
public class VehicleServiceController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle){return vehicleService.save(vehicle);}

    @GetMapping(value = "/{id}")
    public Vehicle getVehicle(@PathVariable int id){return vehicleService.findById(id);}

    @GetMapping
    public List<Vehicle> getAllVehicle(){return vehicleService.findAll();}


}
