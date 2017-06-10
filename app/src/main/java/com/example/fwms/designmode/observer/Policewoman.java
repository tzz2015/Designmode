package com.example.fwms.designmode.observer;

import android.util.Log;

/**
 * 创建 by 刘宇飞 on 2017/6/10.
 * 邮箱：3494576680@qq.com
 * 描述 女警察
 */

public class Policewoman implements Observer{
    private final String TAG=this.getClass().getName();
    @Override
    public void grabThief() {
        Log.e(TAG,"我是女警察来抓你了");
    }
}
