package com.search.SearchService.dto;

public class Menu {

    private MenuCategory menuCategory;

    public Menu() {
    }

    public Menu(MenuCategory menuCategory) {
        this.menuCategory = menuCategory;
    }

    public MenuCategory getCategoryType() {
        return menuCategory;
    }

    public void setCategoryType(MenuCategory menuCategory) {
        this.menuCategory = menuCategory;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "category=" + menuCategory +
                '}';
    }
}
