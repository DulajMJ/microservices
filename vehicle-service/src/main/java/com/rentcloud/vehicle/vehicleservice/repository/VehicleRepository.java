package com.rentcloud.vehicle.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicale.Vehicle;

public interface VehicleRepository  extends JpaRepository<Vehicle,Integer> {
}
