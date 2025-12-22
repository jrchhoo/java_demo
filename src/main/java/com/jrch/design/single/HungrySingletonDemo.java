package com.jrch.design.single;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: bill-admin-server
 * @description: 饿汉式单例应用
 * @author: Mr.Hou
 * @create: 2020-12-04 09:52
 * @create: 2020-12-04 09:52
 **/
@Slf4j
public class HungrySingletonDemo {

    public static void main(String[] args) {
        Bajie bajie1 = Bajie.getInstance();
        bajie1.getName();

        Bajie bajie2 = Bajie.getInstance();
        bajie2.getName();

        if (bajie1 == bajie2) {
            log.info("八戒还是那个八戒");
        } else {
            log.info("另一个八戒");
        }
    }

}

@Slf4j
class Bajie {

    private static Bajie bajie = new Bajie();

    private Bajie(){
        log.info("我是八戒");
    }

    public static Bajie getInstance(){
        return bajie;
    }

    public void getName(){
        log.info("我是八戒：猴哥是我大师兄");
    }
}
