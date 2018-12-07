package com.autentia.democouchbase.dao;

import com.autentia.democouchbase.entity.Airport;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AirportRepository extends PagingAndSortingRepository<Airport, String> {

    @Query("#{#n1ql.selectEntity} WHERE #{#n1ql.filter} AND country = $country")
    Page<Airport> list(String country, Pageable pageable);

    Page<Airport> findByCountry(String country, Pageable pageable);
}
