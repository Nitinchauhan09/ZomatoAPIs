package com.search.SearchService.service;

import com.search.SearchService.dto.Restaurant;
import com.search.SearchService.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class SearchServiceImpl implements SearchService{


    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Restaurant> getAllRest() {

        Restaurant[] forObject = restTemplate.getForObject("http://localhost:9090/restaurant/getAll", Restaurant[].class);
        return Arrays.asList(forObject);
    }
}
