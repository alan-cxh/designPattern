package com.alan.singleton;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-26 22:47
 */
public class Person {

    public static final Person person = new Person();
    private String name;

    // 非单例模式
    // 构造函数
    public Person (){}

    /**
     * 提供一个全局的静态方法
     *
     * 单例模式
     * 1. 饿汉单例模式
     *      a. 实现定义一个静态变量Person
     *      b.
     * @return
     */
    public static Person getPerson() {
        return person;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
