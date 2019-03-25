package com.alan.testFactory4;

/**
 * @description: 简单工厂模式
 * @author: alan chen
 * @create: 2019-03-25 23:24
 */
public class OperatorFactory {

    public static Operator getOperator(String type) {
        if ("+".equals(type)) {
            return new AddOperator();
        }
        return null;
    }
}
