package com.wq.design.model.template;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Paul
 * @time:2017/11/19 10:26
 * @description:
 */
public class LemonDrink extends AbstractDrinkTemplate<LemonAdditions> {

    public LemonDrink(){
        super();
        System.out.println("需要做一杯柠檬水");
    }

    @Override
    protected void put() {
        System.out.println("把优选的柠檬片放入沸水中冲泡");
    }

    @Override
    protected void addAddition(List<LemonAdditions> list) {
        list.add(new LemonAdditions());
    }

    @Override
    protected boolean consume() {
        boolean needNow= false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("需要打包吗(y/n)?");
        if(scanner.hasNext()){
            String response = scanner.next();
            if("y".equals(response)){
                needNow = true;
            }
        }
        scanner.close();
        return needNow;
    }
}

class LemonAdditions{
    private String[] additions;

    public LemonAdditions(){
        additions = new String[]{"sugar", "ice"};
    }

    @Override
    public String toString() {
        return "LemonAdditions{" +
                "additions=" + Arrays.toString(additions) +
                '}';
    }
}
