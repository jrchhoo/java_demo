package com.jrch.design.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: bill-admin-server
 * @description: 具体建造者
 * @author: Mr.Hou
 * @create: 2020-12-15 14:47
 * @create: 2020-12-15 14:47
 **/
@Slf4j
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        log.info("建造:partA");
    }

    @Override
    public void buildPartB() {
        log.info("建造:partB");
    }

    @Override
    public void buildPartC() {
        log.info("建造:partC");
    }
}
