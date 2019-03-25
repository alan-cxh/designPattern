package com.alan.proxy.DynamicProxy;

import org.omg.CORBA.OBJ_ADAPTER;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: LeetCode
 * @description:
 * @author: alan chen
 * @create: 2019-03-17 14:46
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }



}

