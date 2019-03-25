package com.alan.testFactory4;

import java.util.Scanner;

/**
 * @description: 写一个简单的计算器
 * @author: alan chen
 * @create: 2019-03-25 22:59
 */
public class MainClass {

    public static void main(String[] a){

        // 1 接受控制台输入
        System.out.println("---计算器程序---");
        System.out.println("输入第一个操作数：");
        Scanner scanner = new Scanner(System.in);
        String strNum1 = scanner.nextLine();

        System.out.println("输入运算符");
        String oper = scanner.nextLine();

        System.out.println("输入第二个操作数：");
        String strNum2 = scanner.nextLine();
        double result = 0;
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        // 2.进行运算
        if ("+".equals(oper)) {
            // 1. 原始方式
//            result = num1 + num2;

            // 对上式方法的封装
           /* Operator operator = new AddOperator();
            operator.setNum1(num1);
            operator.setNum2(num2);
            result = operator.getResult();*/

           // 简单工厂模式
            Operator operator = OperatorFactory.getOperator("+");
            operator.setNum1(num1);
            operator.setNum2(num2);
            operator.getResult();




        } else if ("-".equals(oper)) {
            result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
        } else if ("*".equals(oper)) {
            result = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
        } else if ("/".equals(oper)) {
            result = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
        }

//        返回结果
        System.out.println(strNum1 + oper + strNum2 + "= " + result);


    }
}
