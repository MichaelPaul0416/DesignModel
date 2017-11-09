package com.wq.design.model.factory.abstracts.saler;

import com.wq.design.model.factory.abstracts.car.Car;

/**
 * @author: Paul
 * @time:2017/11/9 23:42
 * @description:
 */
public abstract class CarSaler {
    protected String salerName;

    public Car saleCar(String carName){
        System.out.println("销售商【"+salerName+"】收到订单了，需要车子【"+carName+"】");
        Car car = reserveCar(carName);
        System.out.println("从工厂提到车了");
        System.out.println("销售商【"+salerName+"】进行销售记录登记");
        System.out.println("把车【"+carName+"】给用户");
        return car;

    }

    protected abstract Car reserveCar(String carName);//从工厂订货

}
