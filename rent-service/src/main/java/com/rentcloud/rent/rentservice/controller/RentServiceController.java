package com.rentcloud.rent.rentservice.controller;

import com.rentcloud.rent.rentservice.model.Response;
import com.rentcloud.rent.rentservice.model.SimpleResponse;
import com.rentcloud.rent.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rent.Rent;

import java.util.List;

@RestController
@RequestMapping("/service/rent")
public class RentServiceController {

    @Autowired
    private RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id,
                            @RequestParam(required = false)String type) {

        if(type==null){
            return new SimpleResponse(rentService.findById(id));
        }else{
            return rentService.findDetailsResponse(id);
        }

    }

    @GetMapping
    public List<Rent> getAll() {
        return rentService.findAll();
    }

}
