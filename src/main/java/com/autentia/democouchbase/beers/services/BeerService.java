package com.autentia.democouchbase.beers.services;

import com.autentia.democouchbase.beers.dao.BeerRepository;
import com.autentia.democouchbase.beers.entity.Beer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public List<Beer> list(int pageNumber, int pageSize) {

        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);

        Page<Beer> beers = beerRepository.findAll(pageRequest);

        return beers.getContent();
    }
}
