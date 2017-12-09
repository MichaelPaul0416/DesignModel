package com.wq.design.model.state.life;

import com.wq.design.model.state.entiy.CandyMachine;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/9
 * @Description:糖果机中糖果售罄
 * @Resource:
 */
public class SoldOutCandyState implements IState {

    private CandyMachine candyMachine;

    private boolean pay;

    public SoldOutCandyState(CandyMachine candyMachine){
        this.candyMachine =  candyMachine;
        pay = false;
    }

    @Override
    public void throwQuarter(String name) {
        System.out.println(String.format("[用户][%s]投入了25分。[Message]很抱歉，糖果机中的糖果现在已经售罄了",name));
        try {
            Thread.sleep(1000);
            synchronized (this) {
                pay = true;
                if (pay) {
                    System.out.println(String.format("[用户][%s]您好，您可以通过发起退款，我们将会返回给您之前投入的25美分", name));
                }
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被吵醒了");
        }

    }

    @Override
    public void turnHandler() {
        System.out.println("大哥，现在糖果机中都没货了，你还叫我转个毛啊！");
    }

    @Override
    public void soldCandy(int number) {
        System.out.println(String.format("客户想要从糖果机中获取[%s]个糖果，但是现在已经售罄了",number));
    }

    @Override
    public void backQuarter(String name) {
        synchronized (this){
            String action = pay ? "投钱了" : "没有投币";
            System.out.println(String.format("[用户][%s]想要退钱，好吧，我看看，你是否投钱了[%s]，[%s]",name,pay,action));
        }

    }
}
