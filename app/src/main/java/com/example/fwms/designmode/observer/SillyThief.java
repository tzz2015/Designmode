package com.example.fwms.designmode.observer;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建 by 刘宇飞 on 2017/6/10.
 * 邮箱：3494576680@qq.com
 * 描述  小偷
 */

public class SillyThief implements Observable {
    private final String TAG=this.getClass().getName();
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList != null && observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Log.e(TAG,"我开始作案了，先告诉警察一声");
        for (Observer observer : observerList) {
            observer.grabThief();
        }
    }
}
