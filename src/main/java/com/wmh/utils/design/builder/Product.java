package com.wmh.utils.design.builder;

import lombok.Data;

/**
 * @program: bill-admin-server
 * @description: 产品，一个产品多个部件组成
 * @author: Mr.Hou
 * @create: 2020-12-15 14:44
 **/

import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void show(){
        log.info("产品生产出来了");
    }
}
