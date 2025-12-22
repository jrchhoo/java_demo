package com.wmh.utils.design.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: bill-admin-server
 * @description: 适配器模式
 * @author: Mr.Hou
 * @create: 2021-01-07 15:05
 **/
public interface Motor {
    void drive();
}

/**
 * 适配者1：电能驱动
 */
@Slf4j
class ElectricMotor{
    public  void electricDrive(){
        log.info("电能---驱动汽车");
    }
}

/**
 * 适配者1：光能驱动
 */
@Slf4j
class OpticalMotor{
    public  void electricDrive(){
        log.info("光能---驱动汽车");
    }
}

/**
 * 电能适配器
 */
class ElectricAdapter implements Motor{

    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        electricMotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}


/**
 * 光能适配器
 */
class OpticalAdapter implements Motor{

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.electricDrive();
    }
}

class MoterAdapterMoterTest{

    public static void main(String[] args) {
        Motor motor = new ElectricAdapter();
        motor.drive();
    }
}

