package com.jrch.design.single;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: bill-admin-server
 * @description: 单例模式应用demo
 * @author: Mr.Hou
 * @create: 2020-12-04 09:44
 * @create: 2020-12-04 09:44
 **/
@Slf4j
public class LazySingletonDemo {
    public static void main(String[] args) {
        President president1 = President.getInstance();
        president1.getName();

        President president2 = President.getInstance();
        president2.getName();

        if (president1 == president2) {
            log.info("这是同一个人");
        } else {
            log.info("不同的人");
        }
    }

}

@Slf4j
class President{

    private static volatile President instance = null;

    private President(){
        log.info("产生一个总统");
    }

    public static synchronized President getInstance(){
        if (instance == null) {
            instance = new President();
        } else {
            log.info("已经有一个总统，不能产生新总统");
        }
        return instance;
    }

    public void getName(){
        log.info("我是美国总统：川建国");
    }
}
