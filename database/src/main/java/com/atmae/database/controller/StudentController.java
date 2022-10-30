package com.atmae.database.controller;

import com.atmae.database.controller.base.BaseController;
import com.atmae.database.domain.pojo.Student;
import com.atmae.database.service.IStudentService;
import com.atmae.database.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:57
 * @Description:
 */
@RestController
@RequestMapping("/students")
public class StudentController extends BaseController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/showInfo")
    public JsonResult<Student> showInfo(int sid) {
        Student student = studentService.showInfo(sid);
        return new JsonResult<>(OK, student);
    }
}
