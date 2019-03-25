package com.alan.abstractFactory;

/**
 *  具体工厂对象
 *
 * @description: 产品链结构。。。。北方水果工厂
 * @author: alan chen
 * @create: 2019-03-25 22:37
 */
public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
