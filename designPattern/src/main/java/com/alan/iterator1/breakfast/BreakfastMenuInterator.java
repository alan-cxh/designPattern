package com.alan.iterator1.breakfast;



import com.alan.iterator1.MenuItem;

import java.util.Iterator;
import java.util.List;

public class BreakfastMenuInterator implements Iterator<MenuItem> {

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

    @Override
    public void remove() {

    }
}
