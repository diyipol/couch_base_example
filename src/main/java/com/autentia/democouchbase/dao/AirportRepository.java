package com.autentia.democouchbase.dao;

import com.autentia.democouchbase.entity.Airport;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.List;

public interface AirportRepository extends CouchbaseRepository<Airport, String> {

}
