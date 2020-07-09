package com.example.bike.controller;

import com.example.bike.model.Bike;
import com.example.bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//https://github.com/Lylio/Globomatics-Bikes/tree/master/database
@RestController
@RequestMapping("/api/bike/v1")
public class BikeRestController {

    @Autowired
    private BikeRepository bikeRepository;

      @GetMapping
       public List<Bike> findAll() {
           return  bikeRepository.findAll();
       }

    //Create a new bike
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }


    @GetMapping("/{id}")
    public Bike findById(@PathVariable("id") long id) {
        return  bikeRepository.getOne(id);
    }
}

