package com.ivisionic.mybatisplus.controller;

import com.ivisionic.mybatisplus.mapper.UserMapper;
import com.ivisionic.mybatisplus.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("用户信息")
@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/user")
    public User user() {
        return new User();
    }

    @ApiOperation("hello控制类")
    @PostMapping("/hello2")
    public User getUserByName(@ApiParam("用户名") User user) {
        int insert = userMapper.insert(user);
        return user;
    }
    @ApiOperation(value = "查找user对象",httpMethod = "GET")
//    @ApiImplicitParam(name = "id",value = "用户id",required = true,paramType = "path",dataType = "Long")
    @GetMapping("/hello/{id}")
    public User getUserById(Long id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
