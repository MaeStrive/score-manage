package com.atmae.database.controller;

import com.atmae.database.controller.base.BaseController;
import com.atmae.database.domain.pojo.User;
import com.atmae.database.service.IUserService;
import com.atmae.database.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:41
 * @Description:
 */
@RestController
@RequestMapping("/users")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public JsonResult<User> login(@RequestBody User user, HttpSession session) {
        User user1 = userService.userLogin(user);
        session.setAttribute("user", user1);
        return new JsonResult<User>(OK, user1);
    }
}
