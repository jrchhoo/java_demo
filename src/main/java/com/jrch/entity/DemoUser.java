package com.jrch.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("demo_user")
public class DemoUser {
    private Long id;
    private String name;
    private Integer age;
}
