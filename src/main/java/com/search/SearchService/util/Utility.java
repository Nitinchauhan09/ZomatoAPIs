package com.search.SearchService.util;

import com.search.SearchService.dto.CategoryItems;
import com.search.SearchService.dto.Menu;
import com.search.SearchService.dto.MenuCategory;
import com.search.SearchService.dto.Restaurant;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


public class Utility {


    public static List<Restaurant> createRest(){
        List<Restaurant> resturantList = new ArrayList<>();
        CategoryItems categoryItems = new CategoryItems("Panner Momo", 110);
        MenuCategory menuCategory = new MenuCategory(categoryItems, "Momos");
        Menu menu = new Menu(menuCategory);
        Restaurant restaurant = new Restaurant(1, "Wow Momo", "Haridwar", menu);
        resturantList.add(restaurant);
        return resturantList;
    }
}
