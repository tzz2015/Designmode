package com.example.fwms.designmode.observer;

import android.util.Log;

/**
 * 创建 by 刘宇飞 on 2017/6/10.
 * 邮箱：3494576680@qq.com
 * 描述  男警察
 */

public class Policeman implements Observer {
    private final String TAG=this.getClass().getName();
    @Override
    public void grabThief() {
        Log.e(TAG,"我是男警察来抓你了");
    }
}
