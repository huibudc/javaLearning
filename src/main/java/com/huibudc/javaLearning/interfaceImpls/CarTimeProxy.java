package com.huibudc.javaLearning.interfaceImpls;

import com.huibudc.javaLearning.interfaces.MoveAble;

import java.util.Random;

public class CarTimeProxy implements MoveAble {
    private MoveAble car;

    public CarTimeProxy(MoveAble car) {
        this.car = car;
    }

    @Override
    public void move() {
        long time = System.currentTimeMillis();
        System.out.println("CarTimeProxy car moving "+ time);
        try {
            car.move();
            Thread.sleep(999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("CarTimeProxy car stop "+(System.currentTimeMillis() - time));
    }
}
