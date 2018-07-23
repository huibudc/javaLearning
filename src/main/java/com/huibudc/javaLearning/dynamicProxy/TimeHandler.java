package com.huibudc.javaLearning.dynamicProxy;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
jdk dynamic proxy
1 only proxy object that implements specify interface
 */

public class TimeHandler implements InvocationHandler {
    private Object object;

    public TimeHandler(Object object) {
        this.object = object;
    }

    /*
        proxy : the object proxied
        method: methods of the object proxied
        args : args of the object proxied
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        System.out.println("TimeHandler car moving " + time);
        method.invoke(object);
        System.out.println("TimeHandler car stop " + (System.currentTimeMillis() - time));
        return null;
    }
}
