package com.wq.design.model.state.life;

import com.wq.design.model.state.entiy.CandyMachine;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/9
 * @Description:
 * @Resource:
 */
public class NoQuarterState implements IState {

    private CandyMachine candyMachine;

    public NoQuarterState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void throwQuarter(String name) {
        System.out.println(String.format("[用户][%s]投入了25美分硬币",name));
        this.candyMachine.setMachineState(candyMachine.getHasQuarter());
    }

    @Override
    public void turnHandler() {
        System.out.println("现在还没投币呢，别转，再转我报警了");
    }

    @Override
    public void soldCandy(int number) {//现在是处于没钱的状态，所以不能出售
        throw new RuntimeException("请先投入25美分硬币，糖果机才能给您糖果");
    }

    @Override
    public void backQuarter(String name) {
        System.out.println(String.format("[用户][%s]您还没给钱呢",name));
    }
}
