package com.alan.singleton;

/**
 *
 * 单例模式只能保证保
 *
 * @description: 单例模式客户端
 * @author: alan chen
 * @create: 2019-03-26 22:46
 */
public class MainClass {

    public static void main(String[] a) {

        // 饿汉式单例模式
        // 单例模式的实现，使p1/p2 变量指向同一个对象
        /*Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();*/

        // 懒汉式单例模式
        Person2 p1 = Person2.getPerson();
        Person2 p2 = Person2.getPerson();


        p1.setName("haha");
        p2.setName("hehe"); // 覆盖

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
