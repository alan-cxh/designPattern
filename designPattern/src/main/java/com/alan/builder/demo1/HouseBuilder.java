package com.alan.builder.demo1;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-03-27 22:48
 */
public interface HouseBuilder {
    // 修地板
    public void makeFloor();

    void makeWall();

    void makeHouseTop();

    public House getHouse();

}
