package com.ivisionic.mybatisplus;

import com.ivisionic.mybatisplus.mapper.UserMapper;
import com.ivisionic.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public   void  testSelectList(){
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
    @Test
    public void testInsertUser(){
        User user = new User();
        user.setName("张三");
        user.setAge(15);
        user.setEmail("zhangsan@qq.com");
        //INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? )
        int result = userMapper.insert(user);
        System.out.println("result:"+result);
    }
    @Test
    public void testDeleteUerById(){
//        DELETE FROM user WHERE id=?
        int result = userMapper.deleteById(-1855238143L);
        System.out.println("result:"+result);
    }

    @Test
    public void testDeleteUserMap() {
//        DELETE FROM user WHERE name = ? AND age = ?
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name","Tom");
        hashMap.put("age","18");
        int result = userMapper.deleteByMap(hashMap);
        System.out.println("result:"+result);
    }
    @Test
    public void testDeleteUserList(){
//        DELETE FROM user WHERE id IN ( ? , ? )
        List<Long> list = Arrays.asList(1l, 2l);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result:"+result);
    }
}
