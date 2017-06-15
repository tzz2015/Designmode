package com.example.fwms.designmode.tenet;

/**
 * 创建 by 刘宇飞 on 2017/6/15.
 * 邮箱：3494576680@qq.com
 * 描述
 */

public interface MocaelPresenter {
    //属性
    void setAge(int age);
    void setHeight(int height);
    void setSex(int sex);

    //行为
    boolean canSwimming();
    boolean canPlayBasketball();
}
