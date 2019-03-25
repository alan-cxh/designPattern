package com.alan.abstractFactory;



/**
 *  抽象工厂模式
 *
 *  角色：
 *      1. 抽象工厂角色：抽象工厂模式的核心，饱含对多个产品结构的申明，任何工厂类都必须实现该接口
 *      2. 具体工厂角色：具体工厂类是抽象工厂的一个实现，负责实例化谋和产品族中的产品对象。
 *      3. 抽象角色：抽象模式所长假你的所有对象的父类，它负责描述所有实例所共有的公共接口；
 *      4. 抽象产品角色：具体实例对象
 *
 *
 *
 *  特点：存在明显的产品链结构
 *
 *  总结：抽象工厂中方法对应产品结构，具体工厂对应产品族
 *
 *
 *
 *
 * @description:
 * @author: alan chen
 * @create: 2019-03-25 20:37
 */
public class MainClass {

    public static void main(String[] a) {
        // 获取具体类型的工厂实例 -- 南方水果工厂
       FruitFactory ff = new NorthFruitFactory();
       Fruit apple = ff.getApple();
       apple.get();
       Fruit banana = ff.getBanana();
       banana.get();;

        FruitFactory sf = new SouthFruitFactory();
        Fruit apple1 = sf.getApple();
        apple1.get();
        Fruit banana1 = sf.getBanana();
        banana1.get();
    }
}
