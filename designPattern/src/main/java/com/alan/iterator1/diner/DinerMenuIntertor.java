package com.alan.iterator1.diner;


import com.alan.iterator1.MenuItem;

import java.util.Iterator;

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

    @Override
    public void remove() {
        if (pos <= 0) {
            throw new IllegalStateException(" You can't remove an item until you have done at least one next()");
        }
        if (menuItems[pos - 1] != null) {
            for (int i = pos - 1; i < (menuItems.length - 1); i ++) {
                menuItems[pos] = menuItems[pos + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }

}
