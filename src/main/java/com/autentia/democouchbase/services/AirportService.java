package com.autentia.democouchbase.services;

import com.autentia.democouchbase.dao.AirportRepository;
import com.autentia.democouchbase.entity.Airport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AirportService {

    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> list() {
        Iterable<Airport> airportIterable = airportRepository.findAll();
        List<Airport> airports = new ArrayList<>();
        airportIterable.forEach(airports::add);
        return airports;
    }

    public List<Airport> list(String country, int pageNumber, int pageSize) {

        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);

        Page<Airport> page = airportRepository.list(country, pageRequest);

        return page.getContent();
    }
}
