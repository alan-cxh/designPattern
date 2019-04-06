package com.alan.decorator8;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-31 11:42
 */
public abstract  class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
