package com.autentia.democouchbase.controller;

import com.autentia.democouchbase.command.CreateAirportCommand;
import com.autentia.democouchbase.dao.AirportRepository;
import com.autentia.democouchbase.entity.Airport;
import com.autentia.democouchbase.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
