package com.alan.decorator8;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-31 11:44
 */
public class MainClass {

    public static void main(String[] a) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
