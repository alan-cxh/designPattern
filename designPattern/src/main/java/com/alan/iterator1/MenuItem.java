package com.alan.iterator1;

public class MenuItem {

    private String name;
    private String description;
    private boolean vegetarin;
    private double price;

    public MenuItem(String name, String description, boolean vegetarin, double price) {
        this.name = name;
        this.description = description;
        this.vegetarin = vegetarin;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarin;
    }

    public String getDescription() {
        return description;
    }
}
