package com.atmae.database.controller.base;

import com.atmae.database.service.ex.CourseWasEleException;
import com.atmae.database.service.ex.PasswordNotMatchException;
import com.atmae.database.service.ex.ScoreNotFountException;
import com.atmae.database.service.ex.UserNotFoundException;
import com.atmae.database.utils.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:47
 * @Description:
 */
public class BaseController {
    /**
     * 操作成功的状态码
     */
    public static final int OK = 200;

    @ExceptionHandler(value = {RuntimeException.class})
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<>();
        if (e instanceof UserNotFoundException) {
            result.setMessage("用户名没有发现");
        } else if (e instanceof PasswordNotMatchException) {
            result.setCode(502);
            result.setMessage("密码错误");
        } else if (e instanceof ScoreNotFountException) {
            result.setCode(503);
            result.setMessage("成绩暂时未录入");
        } else if (e instanceof CourseWasEleException) {
            result.setCode(504);
            result.setMessage("课程已经被选择过了");
        }
        return result;
    }
}
