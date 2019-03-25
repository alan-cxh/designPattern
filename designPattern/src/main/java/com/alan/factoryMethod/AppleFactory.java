package com.alan.factoryMethod;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-25 21:54
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
