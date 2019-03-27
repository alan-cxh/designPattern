package com.alan.singleton;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-26 22:47
 */
public class Person4 {

    private String name;
    private static Person4 person ;

    // 非单例模式
    // 构造函数
    public Person4(){}

    /**
     * 提供一个全局的静态方法
     *
     * 单例模式
     * 1. 饿汉单例模式
     *      a. 实现定义一个静态变量Person
     *      b.
     * @return
     */
    // 相比Person3类，做性能优化，并不需要对整个方法枷锁，而只针对公共访问资源加锁即可
    public static Person4 getPerson() {
        if (person == null) {
            synchronized (Person4.class) {
                if (person == null) // 双重校验
                    person = new Person4();
            }

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
