package com.wq.design.model.state.life;

import com.wq.design.model.state.entiy.CandyMachine;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/9
 * @Description:
 * @Resource:
 */
public class SoldCandyState implements IState {

    private CandyMachine candyMachine;

    public SoldCandyState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    @Override
    public void throwQuarter(String name) {
        System.out.println(String.format("[用户][%s]您好，您已经投币过了，马上给您糖果",name));
    }

    @Override
    public void turnHandler() {
        System.out.println("已经转动过一次杆子，在未出售糖果之前，禁止再次转动手杆");
        throw new RuntimeException("现在准备给您出手糖果，请不要再次转动手杆");
    }

    @Override
    public void soldCandy(int number) {
        candyMachine.releaseCandy(number);
        if(candyMachine.getCount() > 0){
            candyMachine.setMachineState(candyMachine.getSoldCandy());
        }else {
            candyMachine.setMachineState(candyMachine.getSoldOutCandy());
        }
    }

    @Override
    public void backQuarter(String name) {
        System.out.println(String.format("用户[%s]您好，糖果已经售出，不能退款了噢",name));
    }
}
