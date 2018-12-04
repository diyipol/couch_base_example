package com.autentia.democouchbase.controller;

import com.autentia.democouchbase.dao.AirlineRepository;
import com.autentia.democouchbase.entity.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirlineController {

    private final AirlineRepository airlineRepository;

    @Autowired
    public AirlineController(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    @GetMapping("/airline")
    public Iterable<Airline> all() {
        return airlineRepository.findAll();
    }

}
