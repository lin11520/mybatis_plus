package com.ivisionic.mybatisplus.server.Impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ivisionic.mybatisplus.mapper.UserMapper;
import com.ivisionic.mybatisplus.pojo.User;
import com.ivisionic.mybatisplus.server.UserServer;
import org.springframework.stereotype.Service;

@Service
public class IUserServerImpl extends ServiceImpl<UserMapper, User> implements UserServer {

}
