package com.alan.abstractFactory;

/**
 * @description: 产品链结构。。。。南方水果工厂
 * @author: alan chen
 * @create: 2019-03-25 22:37
 */
public class SouthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
