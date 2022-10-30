package com.atmae.database.controller;

import com.atmae.database.controller.base.BaseController;
import com.atmae.database.domain.pojo.Teacher;
import com.atmae.database.service.ITeacherService;
import com.atmae.database.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/22
 * @Time: 9:07
 * @Description:
 */
@RestController
@RequestMapping("/teachers")
public class TeacherController extends BaseController {
    @Autowired
    private ITeacherService teacherService;

    public JsonResult<List<Teacher>> list() {
        List<Teacher> teachers = teacherService.listAll();
        return new JsonResult<List<Teacher>>(OK, teachers);
    }
}
