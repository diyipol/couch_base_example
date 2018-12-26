package com.autentia.democouchbase.beers.services;

import com.autentia.democouchbase.beers.command.CreateBeerCommand;
import com.autentia.democouchbase.beers.dao.BeerRepository;
import com.autentia.democouchbase.beers.entity.Beer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    public Beer create(CreateBeerCommand command) {

        BigDecimal abv = command.getAbv();
        String breweryId = command.getBreweryId();
        String category = command.getCategory();
        String description = command.getDescription();
        Long ibu = command.getIbu();
        String name = command.getName();
        Long srm = command.getSrm();
        String style = command.getStyle();
        Long upc = command.getUpc();

        Beer beer = new Beer(abv, breweryId, category, description, ibu, name, srm, style, upc);

        beerRepository.save(beer);

        return beer;
    }
}
