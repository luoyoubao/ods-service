package com.xunmeng.ods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;
import com.xunmeng.ods.entity.User;
import com.xunmeng.ods.service.IUserService;
import com.xunmeng.ods.util.JsonUtil;

/**
 * <p>
 * zeus用户中心，用户表 前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2017-06-17
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/ods/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/add")
    public String add(@RequestBody User user) {
        System.err.println(JsonUtil.beanToString(user));
        boolean result = userService.insert(user);
        System.err.println("result ===>" + result);
        return "success";
    }

    @GetMapping("/list")
    public Page<User> test() {
        return userService.selectPage(new Page<User>());
    }
}
