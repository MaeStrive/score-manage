package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:25
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void intsertUser() {
        User user = new User();
        user.setPassword("123456");
        user.setRole(2);
        int insert = userMapper.insert(user);
    }
}
