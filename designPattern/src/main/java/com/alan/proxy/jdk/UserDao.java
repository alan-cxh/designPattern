package com.alan.proxy.jdk;

/**
 * @description: 目标对象
 * @author: alan chen
 * @create: 2019-04-07 20:22
 */
public class UserDao implements IUserDao {

    public void save(Object a) {
        System.out.println("----已经保存数据!----"+ a);
    }


}
