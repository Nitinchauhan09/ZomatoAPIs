package com.search.SearchService.dto;

public class CategoryItems {

    private String items;

    private int price;

    public CategoryItems() {
    }

    public CategoryItems(String items, int price) {
        this.items = items;
        this.price = price;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CategoryItems{" +
                "items='" + items + '\'' +
                ", price=" + price +
                '}';
    }
}
