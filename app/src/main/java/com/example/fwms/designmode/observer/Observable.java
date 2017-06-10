package com.example.fwms.designmode.observer;

/**
 * 创建 by 刘宇飞 on 2017/6/10.
 * 邮箱：3494576680@qq.com
 * 描述 被观察者接口
 */

public interface Observable {
    // 添加观察者
     void addObserver(Observer observer);
    // 删除观察者
     void removeObserver(Observer observer);
    // 通知观察者
     void notifyObservers();
}
