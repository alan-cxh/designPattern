package com.alan.decorator8;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-31 11:43
 */
public class RedShapeDecorator extends ShapeDecorator  {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
