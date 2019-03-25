package com.alan.iterator1.diner;

import com.alan.iterator1.interfaces.Menu;
import com.alan.iterator1.MenuItem;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static int Max_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    int pos = 0;

    public DinerMenu() {
        menuItems = new MenuItem[Max_ITEMS];
        AddItem("香菇豆腐饭", "香菇豆腐", false, 10.5);
        AddItem("蛋炒饭","哈哈",false,8.5);
        AddItem("鱼香肉丝","你猜",true,15.5);
    }

    public void AddItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems>Max_ITEMS) {
            System.out.println("菜单已满");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    public MenuItem[] getMenuItems()
    {
        return menuItems;
    }


    @Override
    public Iterator<Object> createIntertor() {
        return new DinerMenuIntertor(menuItems);
    }


}
