package com.alan.iterator1.cafe;

import com.alan.iterator1.MenuItem;
import com.alan.iterator1.interfaces.Menu;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable<String, Object> menuItems = new Hashtable<>();

    public CafeMenu() {
        addItem("cafe", "des", false, 3);
        addItem("burruto", "des", false, 3);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem( name,  description,  vegetarian,  price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIntertor() {
        return menuItems.values().iterator();
    }
}
