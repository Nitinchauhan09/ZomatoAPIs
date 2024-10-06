package com.search.SearchService.controller;

import com.search.SearchService.dto.Restaurant;
import com.search.SearchService.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/allRest")
    public List<Restaurant> getAllRestaurant(){
        return searchService.getAllRest();
    }
}
