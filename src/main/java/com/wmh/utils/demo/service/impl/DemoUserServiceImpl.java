package com.wmh.utils.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wmh.utils.demo.entity.DemoUser;
import com.wmh.utils.demo.mapper.DemoUserMapper;
import com.wmh.utils.demo.service.DemoUserService;
import org.springframework.stereotype.Service;

@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements DemoUserService {
}
