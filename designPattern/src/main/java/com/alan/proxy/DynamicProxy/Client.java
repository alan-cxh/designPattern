package com.alan.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @program: LeetCode
 * @description:
 * @author: alan chen
 * @create: 2019-03-17 14:52
 */
public class Client {

    public static void main(String[] a) {

        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyHouse = (BuyHouse) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyHouse.buyHouse();
        proxyHouse.soldHouse();
    }


    public static void test() {

        throw new RuntimeException("run fail exception");
    }
}
