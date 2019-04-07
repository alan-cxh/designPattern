package com.alan.proxy.jdk;

/**
 * @description: 动态代理测试类
 * @author: alan chen
 * @create: 2019-04-07 20:21
 */
public class Test {

    public static void main(String[] a) {
        IUserDao target = new UserDao();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save(new Person("alan", "28"));
    }
}
