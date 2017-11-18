package com.wq.design.model.adapter;

/**
 * @Author: wangqiang20995
 * @Date:2017/11/18
 * @DEscription:
 * @Resource:
 */
public class Client {
    public static void main(String args[]){
        System.out.println("现在手头只有三角插头，但是想给使用两脚插头充电的手机充电");
        DoublePlug mobile = new MobilePlug("Iphone7");
        ThreePlug adapter = new ThreePlugAdapter(mobile);
        adapter.work();
    }
}
