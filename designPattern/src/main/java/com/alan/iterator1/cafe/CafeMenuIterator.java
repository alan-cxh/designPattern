package com.alan.iterator1.cafe;


import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenuIterator implements Iterable {
    Hashtable<String, Object> menuItems = null;

    public CafeMenuIterator( Hashtable<String, Object> menuItems){
        this.menuItems = menuItems;
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
