package com.wq.design.model.state;

import com.wq.design.model.state.entiy.CandyMachine;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/9
 * @Description:
 * @Resource:
 */
public class StateDemo {
    public static void main(String args[]){
        CandyMachine candyMachine = new CandyMachine(10);
        candyMachine.soldOnce("Paul",12);
        candyMachine.soldOnce("George",1);
    }
}
