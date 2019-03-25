package com.alan.simpleFactory;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-25 20:37
 */
public class MainClass {

    public static void main(String[] a) throws InstantiationException, IllegalAccessException {
        /*//1 实例化一个Apple
        Apple apple = new Apple();
        // 实例化一个Banana
        Banana banana = new Banana();
        apple.get();
        banana.get();*/

        // 2实例化一个Apple， 用到多态
        /*Fruit apple = new Apple();
        apple.get();
        Fruit banana = new Banana();
        banana.get();*/


        // 3 实例化一个Apple
        /*Fruit apple =  FruitFactory.getApple();
        apple.get();

        Fruit banana = FruitFactory.getBanana();
        banana.get();
*/
        // 4 同样是静态工厂模式
       /* try {
            Fruit apple = FruitFactory.getFruit("apple");
            apple.get();
            Fruit banana = FruitFactory.getFruit("banana");
            banana.get();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }*/

       Fruit apple = FruitFactory.getFruit("com.alan.simpleFactory.Apple");
       apple.get();


    }
}
