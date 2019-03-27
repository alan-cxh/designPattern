package com.alan.singleton;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-26 22:47
 */
public class Person2 {

    private String name;
    private static Person2 person ;

    // 非单例模式
    // 构造函数
    public Person2(){}

    /**
     * 提供一个全局的静态方法
     *
     * 单例模式
     * 1. 饿汉单例模式
     *      a. 实现定义一个静态变量Person
     *      b.
     * @return
     */
    public static Person2 getPerson() {
        if (person == null) {
            person = new Person2();
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
