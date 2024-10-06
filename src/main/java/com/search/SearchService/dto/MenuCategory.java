package com.search.SearchService.dto;

public class MenuCategory {

    String name;
    CategoryItems items;

    public MenuCategory() {
    }

    public MenuCategory(CategoryItems items, String name) {
        this.items = items;
        this.name = name;
    }

    public CategoryItems getItems() {
        return items;
    }

    public void setItems(CategoryItems items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuCategory{" +
                "name=" + name +
                ", items='" + items + '\'' +
                '}';
    }
}
