package com.alan.testFactory4;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-25 23:06
 */
public abstract class Operator {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}
