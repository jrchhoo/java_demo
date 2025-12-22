package com.jrch.design.prototype;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: bill-admin-server
 * @description: 原型模式应用：奖状生成器
 * @author: Mr.Hou
 * @create: 2020-12-04 10:13
 **/
public class ProtoTypeCitation {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation("张三","同学：在2020年第一学期成绩优异，被评为三好学生","古浪一中");
        c1.display();

        Citation c2 = (Citation) c1.clone();
        c2.setName("李四");
        c2.display();

        Citation c3 = (Citation) c1.clone();
        c3.setName("王五");
        c3.display();

    }
}


/**
 * 奖状类
 */
@Data
@Slf4j
class Citation implements Cloneable {
    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        log.info("奖状实例化成功");
    }

    public Object clone() throws CloneNotSupportedException {
        log.info("奖状拷贝成功");
        return (Citation) super.clone();
    }

    public void display(){
        log.info(name + info + college);
    }
}
