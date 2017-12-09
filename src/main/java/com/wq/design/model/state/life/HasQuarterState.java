package com.wq.design.model.state.life;

import com.wq.design.model.state.entiy.CandyMachine;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/9
 * @Description:
 * @Resource:
 */
public class HasQuarterState implements IState {

    private CandyMachine candyMachine;

    public HasQuarterState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void throwQuarter(String name) {
        System.out.println(String.format("[用户][%s]您好，您已经投入了25美分了，不需要再次投入",name));
    }

    @Override
    public void turnHandler() {
        System.out.println("您现在转动了手柄");
        candyMachine.setMachineState(candyMachine.getSoldCandy());
    }

    @Override
    public void soldCandy(int number) {
        System.out.println(String.format("您想要获取[%s]颗糖果,但是之前请您先转动手柄",number));
    }

    @Override
    public void backQuarter(String name) {
        System.out.println(String.format("[用户][%s]请求退回之前给的25美分",name));
        candyMachine.setMachineState(candyMachine.getNoQuarter());
    }
}
