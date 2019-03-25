package com.alan.abstractFactory;


/**
 * @description: 抽象工厂
 * @author: alan chen
 * @create: 2019-03-25 20:47
 */
public interface FruitFactory {
// 实例化Apple
    public Fruit getApple();
//    实例化Banana
    public Fruit getBanana();
}
