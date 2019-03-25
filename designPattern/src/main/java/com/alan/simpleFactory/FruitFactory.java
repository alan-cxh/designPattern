package com.alan.simpleFactory;

/**
 * @description: 静态工厂
 * @author: alan chen
 * @create: 2019-03-25 20:47
 */
public class FruitFactory {
    /*public static Fruit getApple () {
        return new Apple();
    }

    public static Fruit getBanana() {
        return new Banana();
    }*/


    /**
     * get方法，获取所有产品对象
     *
     * 该方法是对上式方法作出相应的改进
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
//        该方式对于参数输入比较灵活，但代码比较冗余
        /*if (type.equalsIgnoreCase("apple")) {
//            return new Apple();
            return Apple.class.newInstance();
        } else if (type.equalsIgnoreCase("banana")) {
            return Banana.class.newInstance();
        }*/

        // 对上式的另外一种优化， 该方式的优势在于是对代码的简化
        try {
            Class fruitClass = Class.forName(type);
            return (Fruit) fruitClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("找不到相应的实例化类");
        return null;
    }
}
