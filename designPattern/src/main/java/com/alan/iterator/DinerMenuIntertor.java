package com.alan.iterator;


public class DinerMenuIntertor implements Iterator {

    MenuItem[] menuItems;
    int pos = 0;

    public DinerMenuIntertor(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (pos >= menuItems.length || menuItems[pos] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[pos];
        pos ++;
        return menuItem;
    }

}
