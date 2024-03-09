package com.JDBC.demo.controller;

import com.JDBC.demo.domain.Trip;
import com.JDBC.demo.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/travel")
public class TripWithIshaController {

    @Autowired
    TripRepository tripRepository;

    @PostMapping("/hello")
    public void addTraveller(@RequestBody Trip details) {
        tripRepository.save(details);
    }

    @GetMapping("{key}")
    public void getTravellerDetails(@PathVariable("key") String key) {
        Trip fetchedData = tripRepository.findById(key).orElseThrow();
    }

}
