package com.alan.testFactory4;

/**
 * @description:  工厂方法模式
 * @author: alan chen
 * @create: 2019-03-25 23:08
 */
public class AddOperator extends Operator {
    @Override
    public double getResult() {
        double result = this.getNum1() + this.getNum2();
        return result;
    }
}
