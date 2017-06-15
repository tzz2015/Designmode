package com.example.fwms.designmode.tenet;

import android.util.Log;

/**
 * 创建 by 刘宇飞 on 2017/6/15.
 * 邮箱：3494576680@qq.com
 * 描述
 */

public class Girl implements EatOption {
    @Override
    public void likeEat(){
        Log.e(this.getClass().getName(),"今天想吃鱼");
    }
}
