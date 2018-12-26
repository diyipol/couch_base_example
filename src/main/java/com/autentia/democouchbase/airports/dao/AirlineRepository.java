package com.autentia.democouchbase.airports.dao;

import com.autentia.democouchbase.airports.entity.Airline;
import org.springframework.data.repository.CrudRepository;

public interface AirlineRepository extends CrudRepository<Airline, String> {
}
