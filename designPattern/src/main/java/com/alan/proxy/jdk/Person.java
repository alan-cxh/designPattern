package com.alan.proxy.jdk;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-04-07 20:45
 */
public class Person {

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
