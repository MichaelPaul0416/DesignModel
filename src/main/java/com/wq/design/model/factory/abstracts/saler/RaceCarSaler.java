package com.wq.design.model.factory.abstracts.saler;

import com.wq.design.model.factory.abstracts.car.Car;
import com.wq.design.model.factory.abstracts.car.Ferrari;
import com.wq.design.model.factory.abstracts.company.F1CarFactory;
import com.wq.design.model.factory.abstracts.company.MaterialFactory;

/**
 * @author: Paul
 * @time:2017/11/9 23:55
 * @description:
 */
public class RaceCarSaler extends CarSaler {

    public RaceCarSaler(){
        super.salerName = "赛车用车总经销商";
    }
    @Override
    protected Car reserveCar(String carName) {
        MaterialFactory factory = new F1CarFactory();
        Car car = null;
        if("Ferrari".equals(carName)){
            car = new Ferrari(factory);
        }
        return car;
    }
}
