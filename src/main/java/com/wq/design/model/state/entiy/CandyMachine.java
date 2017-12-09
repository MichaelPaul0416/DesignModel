package com.wq.design.model.state.entiy;

import com.wq.design.model.state.life.*;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/9
 * @Description:
 * @Resource:
 */
public class CandyMachine {
    IState soldCandy;//可出售

    IState soldOutCandy;//售罄

    IState noQuarter;//需要投币

    IState hasQuarter;//已经投币了，不需要再次投币

    IState machineState;

    private int count;


    public CandyMachine(int count){
        soldCandy = new SoldCandyState(this);
        soldOutCandy = new SoldOutCandyState(this);
        noQuarter = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);

        this.count = count;
        machineState = noQuarter;
    }

    public void releaseCandy(int number){
        if(count >= number){
            System.out.println(String.format("糖果机出售[%s]颗糖果，还有[%s]颗",number,count-number));
            count -= number;
        }else{
            System.out.println(String.format("糖果机出售所有剩下的糖果[%s]，现在卖完了",count));
            count = -1;
        }
    }

    public void soldOnce(String name,int need){
        insertQuarter(name);
        turnHandler();
        soldCandy(need);
    }

    public void insertQuarter(String name){
        machineState.throwQuarter(name);
    }

    public void backQuarter(String name){
        machineState.backQuarter(name);
    }

    public void turnHandler(){
        machineState.turnHandler();
    }

    public void soldCandy(int number){
        machineState.soldCandy(number);
    }
    public int getCount() {
        return count;
    }

    public void setMachineState(IState iState){
        this.machineState = iState;
    }

    public IState getSoldCandy() {
        return soldCandy;
    }

    public IState getSoldOutCandy() {
        return soldOutCandy;
    }

    public IState getNoQuarter() {
        return noQuarter;
    }

    public IState getHasQuarter() {
        return hasQuarter;
    }
}
