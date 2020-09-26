package com.rentcloud.rent.rentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rent.Rent;

public interface RentServiceRepository extends JpaRepository<Rent,Integer> {
}
