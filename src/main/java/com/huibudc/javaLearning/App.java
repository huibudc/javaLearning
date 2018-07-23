package com.huibudc.javaLearning;

import com.huibudc.javaLearning.dynamicProxy.TimeHandler;
import com.huibudc.javaLearning.interfaceImpls.Car;
import com.huibudc.javaLearning.interfaceImpls.CarLogProxy;
import com.huibudc.javaLearning.interfaceImpls.CarTimeProxy;
import com.huibudc.javaLearning.interfaces.MoveAble;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {
//        MoveAble car = new Car();
//        CarLogProxy carLogProxy = new CarLogProxy(car);
//        CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
//        carTimeProxy.move();
        MoveAble car = new Car();
        InvocationHandler timeHandler = new TimeHandler(car);
        ClassLoader classLoaderOfProxiedObject = car.getClass().getClassLoader();
        Class<?>[] interfaces = car.getClass().getInterfaces();
        MoveAble m = (MoveAble) Proxy.newProxyInstance(classLoaderOfProxiedObject, interfaces, timeHandler);
        m.move();
    }
}
