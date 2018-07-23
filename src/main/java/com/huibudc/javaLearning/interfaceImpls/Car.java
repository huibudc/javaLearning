package com.huibudc.javaLearning.interfaceImpls;

import com.huibudc.javaLearning.interfaces.MoveAble;

import java.util.Random;

public class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("car moving");
    }
}
