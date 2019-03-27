package com.alan.singleton;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-26 22:47
 */
public class Person3 {

    private String name;
    private static Person3 person ;

    // 非单例模式
    // 构造函数
    public Person3(){}

    /**
     * 提供一个全局的静态方法
     *
     * 单例模式
     * 1. 饿汉单例模式
     *      a. 实现定义一个静态变量Person
     *      b.
     * @return
     */
    // 在多线下是无法实现单例，需要使用同步关键字
    public static synchronized Person3 getPerson() {
        if (person == null) {
            person = new Person3();
        }
        return person;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
