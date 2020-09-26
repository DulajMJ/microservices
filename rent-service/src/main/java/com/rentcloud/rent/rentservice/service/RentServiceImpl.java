package com.rentcloud.rent.rentservice.service;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rentcloud.rent.rentservice.model.DetailsResponse;
import com.rentcloud.rent.rentservice.repository.RentServiceRepository;
import customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rent.Rent;
import vehicale.Vehicle;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService{

    @Autowired
    RentServiceRepository serviceRepository;

    @LoadBalanced
    @Bean
    RestTemplate getRestTamplate(RestTemplateBuilder templateBuilder){

        return templateBuilder.build();
    }
    @Autowired
    RestTemplate restTemplate;
    @Override
    public Rent save(Rent rent) {
        return serviceRepository.save(rent);
    }

    @Override
    public Rent findById(int id) {
        Optional<Rent> optional=serviceRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }else {
            return new Rent();
        }

    }

    @Override
    public List<Rent> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public DetailsResponse findDetailsResponse(int id) {

        Rent rent=this.findById(id);
        Customer customer=this.getCustomers(rent.getCustomerId());
        Vehicle vehicle=this.getVehicle(rent.getVehicleId());
        return new DetailsResponse(rent,vehicle,customer);
    }


//    @Override
//    @HystrixCommand(fallbackMethod = "findDetialsResponseFallBack")
//    public DetailsResponse findDetailsResponse(int id) {
//
//        Rent rent=this.findById(id);
//        Customer customer=restTemplate.getForObject("http://customer/service/customer/"+rent.getCustomerId(),Customer.class);
//        Vehicle vehicle=restTemplate.getForObject("http://vehicale/service/vehicle/"+rent.getVehicleId(),Vehicle.class);
//
//        return new DetailsResponse(rent,vehicle,customer);
//    }
    public DetailsResponse findDetialsResponseFallBack(int id){
        return new DetailsResponse(new Rent(),new Vehicle(),new Customer());
    }

    private Customer getCustomers(int customerId){
        Customer customer=restTemplate.getForObject("http://customer/service/customer/"+customerId,Customer.class);
        return customer;
    }
    private Vehicle getVehicle(int vehiclId){
        Vehicle vehicle=restTemplate.getForObject("http://vehicale/service/vehicle/"+vehiclId,Vehicle.class);
        return vehicle;
    }
}
