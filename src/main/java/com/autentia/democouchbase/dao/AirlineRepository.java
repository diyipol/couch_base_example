package com.autentia.democouchbase.dao;

import com.autentia.democouchbase.entity.Airline;
import org.springframework.data.repository.CrudRepository;

public interface AirlineRepository extends CrudRepository<Airline, String> {
}
