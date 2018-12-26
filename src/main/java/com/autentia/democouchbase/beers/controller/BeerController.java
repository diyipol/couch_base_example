package com.autentia.democouchbase.beers.controller;

import com.autentia.democouchbase.beers.entity.Beer;
import com.autentia.democouchbase.beers.services.BeerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/beer")
    public List<Beer> list(@RequestParam int pageNumber, @RequestParam int pageSize) {
        return beerService.list(pageNumber, pageSize);
    }

}
