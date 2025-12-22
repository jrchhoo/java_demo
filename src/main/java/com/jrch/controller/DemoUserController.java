package com.jrch.controller;

import com.jrch.entity.DemoUser;
import com.jrch.service.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo/users")
public class DemoUserController {

    @Autowired
    private DemoUserService demoUserService;

    @GetMapping
    public List<DemoUser> list() {
        return demoUserService.list();
    }

    @PostMapping
    public boolean save(@RequestBody DemoUser user) {
        return demoUserService.save(user);
    }
}
