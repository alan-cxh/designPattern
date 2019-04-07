package com.alan.proxy.cglib;

import com.alan.proxy.jdk.Person;

/**
 * @description:
 * @author: alan chen
 * @create: 2019-04-07 21:02
 */
public class UserDao {

    public void save(Person a) {
        System.out.println("----cglib已经保存数据!----"+ a);
    }
}
