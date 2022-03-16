package com.ivisionic.mybatisplus;

import com.ivisionic.mybatisplus.pojo.User;
import com.ivisionic.mybatisplus.server.Impl.IUserServerImpl;
import com.ivisionic.mybatisplus.server.UserServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class MybatisPlusSelectUser {
    @Autowired
    private UserServer userServer;

    @Test
    public void selectList(){
        long count = userServer.count();
        System.out.println(count);
    }
    @Test
    public void  saveBatch(){
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("lin"+i);
            user.setAge(20+i);
            user.setEmail("lin@"+i+"@qq.com");
            list.add(user);
        }
        boolean b = userServer.saveBatch(list);
        System.out.println(b);
    }
}
