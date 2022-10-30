package com.atmae.database.service;

import com.atmae.database.domain.pojo.User;
import com.atmae.database.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:28
 * @Description:
 */
public interface IUserService {

    public User userLogin(User user);
}
