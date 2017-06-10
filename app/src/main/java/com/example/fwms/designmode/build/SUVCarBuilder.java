package com.example.fwms.designmode.build;

/**
 * 创建 by 刘宇飞 on 2017/6/10.
 * 邮箱：3494576680@qq.com
 * 描述
 */

public class SUVCarBuilder extends CarBuilder {
    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setHeight(int height) {
        car.setHeight(height);
        return this;
    }

    @Override
    public CarBuilder setPower(String power) {
        car.setPower(power);
        return this;
    }

    @Override
    public Car create() {
        return car;
    }
}
