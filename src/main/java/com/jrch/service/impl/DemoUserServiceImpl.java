package com.jrch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jrch.entity.DemoUser;
import com.jrch.mapper.DemoUserMapper;
import com.jrch.service.DemoUserService;
import org.springframework.stereotype.Service;

@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements DemoUserService {
}
