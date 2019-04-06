package com.alan.builder.demo1;

/**
 * @description:  平房工程队
 * @author: alan chen
 * @create: 2019-03-27 22:50
 */
public class PingFangBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房 -- 地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房 -- 墙");
    }

    @Override
    public void makeHouseTop() {
        house.setHouseTop("平房 -- 屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
