package com.autentia.democouchbase.beers.dao.impl;

import com.autentia.democouchbase.beers.dao.CustomSaveRepository;
import com.autentia.democouchbase.beers.entity.Beer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.couchbase.core.CouchbaseOperations;

public class BeerRepositoryImpl implements CustomSaveRepository<Beer> {

    private final CouchbaseOperations beerSampleTemplate;

    public BeerRepositoryImpl(CouchbaseOperations beerSampleTemplate) {
        this.beerSampleTemplate = beerSampleTemplate;
    }

    @Override
    public Beer save(Beer beer) {

        String id = generateId(beer);
        beer.setId(id);

        beerSampleTemplate.save(beer);

        return beer;
    }

    private String generateId(Beer beer) {
        String idPrefix = StringUtils.replace(beer.getBreweryId(), " ", "_");
        idPrefix = StringUtils.lowerCase(idPrefix);
        String idSuffix = StringUtils.replace(beer.getName(), " ", "_");
        idSuffix = StringUtils.lowerCase(idSuffix);
        return new StringBuilder(idPrefix).append("_").append(idSuffix).toString();
    }
}
