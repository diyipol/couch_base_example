package com.autentia.democouchbase.controller;

import com.autentia.democouchbase.dao.AirportRepository;
import com.autentia.democouchbase.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirportController {

    private final AirportRepository airportRepository;

    @Autowired
    public AirportController(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @GetMapping("/airport")
    public Iterable<Airport> all() {
        return airportRepository.findAll();
    }

}
