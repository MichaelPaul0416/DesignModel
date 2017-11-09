package com.wq.design.model.factory.abstracts;

import com.wq.design.model.factory.abstracts.car.Car;
import com.wq.design.model.factory.abstracts.saler.CarSaler;
import com.wq.design.model.factory.abstracts.saler.FamilyCarSaler;

/**
 * @author: Paul
 * @time:2017/11/9 23:57
 * @description:
 */
public class Demo {
    public static void main(String args[]){
        CarSaler saler = new FamilyCarSaler();
        Car car = saler.saleCar("Audi");
        System.out.println("用户拿到汽车-->" + car);
    }
}
