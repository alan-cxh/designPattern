package com.alan.builder.demo1;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-28 22:53
 */
public class HouseDirector {

    private HouseBuilder builder;

    public  HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House makeHouse() {
        builder.makeFloor();
        builder.makeHouseTop();
        builder.makeWall();
        return builder.getHouse();

    }


}
