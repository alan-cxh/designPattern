package com.alan.proxy.cglib;

import com.alan.proxy.jdk.Person;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-04-07 20:58
 */
public class Test {

    public static void main(String[] a) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save(new Person("alan", "28"));
    }
}
