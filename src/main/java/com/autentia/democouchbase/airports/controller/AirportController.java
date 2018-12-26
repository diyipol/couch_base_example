package com.autentia.democouchbase.airports.controller;

import com.autentia.democouchbase.airports.command.CreateAirportCommand;
import com.autentia.democouchbase.airports.entity.Airport;
import com.autentia.democouchbase.airports.services.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirportController {

    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/airport")
    public List<Airport> list() {
        return airportService.list();
    }

    @GetMapping("/airport/{country}")
    public List<Airport> list(@PathVariable String country, @RequestParam int pageNumber, @RequestParam int pageSize) {
        return airportService.list(country, pageNumber, pageSize);
    }

    @PostMapping("/airport")
    public Airport create(@RequestBody CreateAirportCommand command) {
        return airportService.create(command);
    }

}
