package com.example.fwms.designmode.build;

/**
 * 创建 by 刘宇飞 on 2017/6/10.
 * 邮箱：3494576680@qq.com
 * 描述
 */

public abstract class CarBuilder {
    protected Car car=new Car();
    public abstract CarBuilder setColor(String color);
    public abstract CarBuilder setHeight(int height);
    public abstract CarBuilder setPower(String power);
    public abstract Car create();
}
