package com.search.SearchService.dto;

import java.io.Serializable;

public class Restaurant implements Serializable {

    private int id;

    private String name;

    private String location;

    private Menu menu;

    public Restaurant() {
    }

    public Restaurant(int id, String name, String location, Menu menu) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", menu=" + menu +
                '}';
    }
}
