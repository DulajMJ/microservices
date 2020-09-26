package com.rentcloud.customer.customerservice.controler;

import com.rentcloud.customer.customerservice.service.CustomerService;
import customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerServiceController {

    @Autowired
    private CustomerService customerService;


    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable int id){

        return customerService.findById(id);
    }
    @GetMapping
    public List<Customer> getAllCustomers(){

        return customerService.findAll();
    }
}
