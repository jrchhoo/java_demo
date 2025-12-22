package com.jrch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jrch.entity.DemoUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoUserMapper extends BaseMapper<DemoUser> {
}
