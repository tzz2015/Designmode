package com.example.fwms.designmode.tenet;

/**
 * 创建 by 刘宇飞 on 2017/6/15.
 * 邮箱：3494576680@qq.com
 * 描述
 */

public class Mama implements CookOption {

    @Override
    public void cook(EatOption option) {
        option.likeEat();
    }
}
