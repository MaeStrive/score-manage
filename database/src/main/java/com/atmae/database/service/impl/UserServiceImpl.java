package com.atmae.database.service.impl;

import com.atmae.database.domain.pojo.User;
import com.atmae.database.mapper.UserMapper;
import com.atmae.database.service.IUserService;
import com.atmae.database.service.ex.PasswordNotMatchException;
import com.atmae.database.service.ex.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:30
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        User u = userMapper.findById(user.getId());
        if (u == null) {
            System.out.println(45);
            throw new UserNotFoundException("用户名未找到");
        } else if (!user.getPassword().equals(u.getPassword())) {
            throw new PasswordNotMatchException("密码不匹配");
        }
        return u;
    }
}
