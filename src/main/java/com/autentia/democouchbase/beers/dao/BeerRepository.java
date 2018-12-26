package com.autentia.democouchbase.beers.dao;

import com.autentia.democouchbase.beers.entity.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, String> {
}
