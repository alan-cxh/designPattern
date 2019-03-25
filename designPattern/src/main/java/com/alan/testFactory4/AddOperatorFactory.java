package com.alan.testFactory4;

/**
 * @description:  简单工厂模式 -- 具体实现类
 * @author: alan chen
 * @create: 2019-03-25 23:37
 */
public class AddOperatorFactory extends Operator {
    @Override
    public double getResult() {
        return this.getNum1() + this.getNum2();
    }
}
