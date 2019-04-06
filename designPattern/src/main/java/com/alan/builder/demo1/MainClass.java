package com.alan.builder.demo1;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-27 22:45
 */
public class MainClass {


    public static void main(String[] a) {
        PingFangBuilder builder = new PingFangBuilder();
        builder.makeFloor();
//        House house = builder.getHouse();


        HouseDirector director = new HouseDirector(builder);
         House house1 = director.makeHouse();

        System.out.println(house1.getFloor());
    }
}
