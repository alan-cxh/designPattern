package com.alan.proxy.DynamicProxy;

/**
 * @program: LeetCode
 * @description:
 * @author: alan chen
 * @create: 2019-03-17 14:49
 */
public class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse() {
        System.out.println("BuyHouseImpl.buyHouse");
    }

    @Override
    public void soldHouse() {
        System.out.println("BuyHouseImpl.soldHouse");
    }
}
