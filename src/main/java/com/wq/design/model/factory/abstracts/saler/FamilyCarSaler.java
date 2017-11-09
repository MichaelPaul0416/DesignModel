package com.wq.design.model.factory.abstracts.saler;

import com.wq.design.model.factory.abstracts.car.Audi;
import com.wq.design.model.factory.abstracts.car.Car;
import com.wq.design.model.factory.abstracts.car.Ferrari;
import com.wq.design.model.factory.abstracts.company.FamilyCarFactory;
import com.wq.design.model.factory.abstracts.company.MaterialFactory;

/**
 * @author: Paul
 * @time:2017/11/9 23:41
 * @description:
 */
public class FamilyCarSaler extends CarSaler{

    public FamilyCarSaler(){
        super.salerName = "私家车总经销商";
    }

    @Override
    protected Car reserveCar(String carName) {
        MaterialFactory factory = new FamilyCarFactory();
        Car car = null;
        if("Audi".equals(carName)){
            car = new Audi(factory);
        }
        return car;
    }
}
