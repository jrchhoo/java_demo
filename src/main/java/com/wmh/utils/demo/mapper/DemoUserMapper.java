package com.wmh.utils.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wmh.utils.demo.entity.DemoUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoUserMapper extends BaseMapper<DemoUser> {
}
