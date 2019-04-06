package com.alan.decorator8;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-31 11:41
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
