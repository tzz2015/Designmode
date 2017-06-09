package com.example.fwms.designmode;

/**
 * Created by FWMS on 2017/6/9.
 */

public class Singleton {
    private volatile static Singleton singleton;

    /**
     * 必须私有化构造方法
     */
    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {//同步锁 保证线程安全
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public String getText(){
        return "我是双重校验锁单例模式";
    }
}
