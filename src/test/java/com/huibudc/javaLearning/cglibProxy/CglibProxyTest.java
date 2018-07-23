package com.huibudc.javaLearning.cglibProxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CglibProxyTest {

    @Test
    public void canProxyTargetObject() {
        CglibProxy proxy = new CglibProxy();
        Train t = (Train) proxy.getProxy(Train.class);
        t.move();
    }
}