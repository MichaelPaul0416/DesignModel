package com.wq.design.model.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author: wangqiang20995
 * @datetime: 2017/11/12 22:07
 * @description:
 * @Reources:
 */
public class ComputerOS {

    private boolean readyWork;
    private String osName;

    private RegistryTable registryTable;

    public ComputerOS(){
        readyWork = true;
        osName = "Windows 10 专业版";
    }

    public void installSystem() throws InterruptedException {
        System.out.println("安装["+osName+"]系统开始");
        System.out.println("安装基本环境");
        System.out.println("安装基本软件和驱动");
        CountDownLatch countDownLatch = new CountDownLatch(5);//计数器，等所有线程都执行完毕之后，主线程从wait继续往下执行
        for(int i=0;i<5;i++){
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"获取注册表");
                    try {
                        registryTable = RegistryTable.obtainRegistry();
                        System.out.println(Thread.currentThread().getName() + "获取到的注册表["+registryTable+"]");
                        long time = System.currentTimeMillis();
                        registryTable.work("软件【"+time+"】","C:\\a\\b\\"+ time);
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
        countDownLatch.await();
        System.out.println("["+osName+"]安装完毕");
    }

    public static void main(String args[]) throws InterruptedException {
        ComputerOS computerOS = new ComputerOS();
        computerOS.installSystem();
    }

}
