package com.wq.design.model.singleton;

/**
 * @author: wangqiang20995
 * @datetime: 2017/11/12 21:55
 * @description:注册表，在系统中是单例
 * @Reources:
 */
public class RegistryTable {
    private boolean isInit;
    private boolean isActive;

    private static RegistryTable registryTable;

    private RegistryTable(){
        this.isActive = false;
        this.isInit = false;
        init();
        active();
        System.out.println("注册表可以被注册，并且开始工作了");
    }

    public static RegistryTable obtainRegistry() throws InterruptedException {
        synchronized (RegistryTable.class) {
            if (registryTable == null) {
                System.out.println("初始化注册表需要一点时间，等一小会");
                Thread.sleep(1000);
                registryTable = new RegistryTable();
            }
        }
        return registryTable;
    }

    private void init(){
        if(!isInit && !isActive){
            isInit = true;
            System.out.println("初始化注册表完成");
        }
    }

    private void active(){
        if(isInit && !isActive){
            isActive = true;
            System.out.println("注册表已经激活");
        }
    }

    public void work(String softName,String location){
        if(isInit && isActive){
            System.out.println("被注册的软件["+softName+"],磁盘位置["+location+"]");
        }
    }
}
