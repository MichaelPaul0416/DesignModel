package com.wq.design.model.state.life;

/**
 * @Author: wangqiang20995
 * @Date:2017/12/8
 * @Description:糖果机在出售过程中的抽象接口，新增状态的话实现该接口即可
 * @Resource:
 */
public interface IState {
    void throwQuarter(String name);//投入25分钱

    void turnHandler();//转动开关

    void soldCandy(int number);//售出糖果

    void backQuarter(String name);//退出25分钱
}
