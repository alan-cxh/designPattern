package com.alan.iterator;



import java.util.List;

public class BreakfastMenuInterator implements Iterator {

    private List<MenuItem> menuItems;
    private int pos = 0;

    public BreakfastMenuInterator(List menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return pos != menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(pos);
        pos ++;
        return menuItem;
    }
}
