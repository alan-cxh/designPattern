package com.alan.iterator1.breakfast;

import com.alan.iterator1.interfaces.Menu;
import com.alan.iterator1.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu implements Menu {

    private ArrayList<MenuItem> menuItems;
    private int pos = 0;

    public BreakfastMenu() { // 初始化数据
        menuItems = new ArrayList();
        addItem("牛奶", "牛奶description", false, 3.0);
        addItem("油条","油条description",false,1.0);
        addItem("馒头","馒头description",true,1.0);
        addItem("豆浆", "DoujiangDescription", true, 1.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem( name,  description,  vegetarian,  price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }


    @Override
    public Iterator createIntertor() {
        return menuItems.iterator();
//        return new BreakfastMenuInterator(menuItems);
    }


}
