package com.jrch.design.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: bill-admin-server
 * @description: 简单工厂模式实例
 * @author: Mr.Hou
 * @create: 2020-12-04 10:25
 **/
public interface Factory {

    /**
     * 工厂有生产方法
     */
    void product();
}

@Slf4j
class DrinkFactory implements Factory{

    @Override
    public void product() {
        log.info("饮料工厂生产饮料");
    }
}

@Slf4j
class ClothFactory implements Factory{

    @Override
    public void product() {
        log.info("服装工厂生产服装");
    }
}

@Slf4j
class CarFactory implements Factory{

    @Override
    public void product() {
        log.info("车厂生产车");
    }
}

final class Const{
    static final int DRINK_FRODUCT = 1;
    static final int CLOTH_FRODUCT = 2;
    static final int CAR_FRODUCT = 3;
}

class SimpleFactory{

    public static Factory getFactory(int category) {
        switch (category) {
            case Const.DRINK_FRODUCT:
                return new DrinkFactory();
            case Const.CLOTH_FRODUCT:
                return new ClothFactory();
            case Const.CAR_FRODUCT:
                return new CarFactory();
            default:
                return null;
        }
    }
}

class TestDemo{
    public static void main(String[] args) {
        SimpleFactory.getFactory(2).product();
        SimpleFactory.getFactory(1).product();
    }
}
