package com.alan.factoryMethod;

/**
 *  工厂方法模式 又称
 *
 *
 * @description:
 * @author: alan chen
 * @create: 2019-03-25 20:37
 */
public class MainClass {

    public static void main(String[] a) {

        // 获得AppleFactory
        FruitFactory ff = new AppleFactory();
        // 通过AppleFactory来获得Apple实例对象
        Fruit apple = ff.getFruit();
        apple.get();

        FruitFactory ff2 = new BananaFactory();
        // 通过AppleFactory来获得Apple实例对象
        Fruit banana = ff2.getFruit();
        banana.get();


    }
}
