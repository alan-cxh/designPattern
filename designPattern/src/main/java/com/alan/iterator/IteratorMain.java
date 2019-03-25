package com.alan.iterator;

public class IteratorMain {

    public static void main(String[] arg){
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(breakfastMenu, dinerMenu );
        waitress.printMenu();
    }
}
