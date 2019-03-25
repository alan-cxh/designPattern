package com.alan.iterator1;

import com.alan.iterator1.breakfast.BreakfastMenu;
import com.alan.iterator1.cafe.CafeMenu;
import com.alan.iterator1.diner.DinerMenu;
import com.alan.iterator1.interfaces.Menu;

public class IteratorMain {

    public static void main(String[] arg){
        Menu breakfastMenu = new BreakfastMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(breakfastMenu, dinerMenu, cafeMenu );
        waitress.printMenu();
    }
}
