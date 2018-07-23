package com.huibudc.javaLearning.interfaceImpls;

import com.huibudc.javaLearning.interfaces.MoveAble;

import java.util.Random;

public class CarLogProxy implements MoveAble {

    private MoveAble car;

    public CarLogProxy(MoveAble car) {
        this.car = car;
    }
    @Override
    public void move() {
        System.out.println("CarLogProxy car moving");
        car.move();
        System.out.println("CarLogProxy car stop ");
    }
}
