package com.atmae.database.controller;

import com.atmae.database.controller.base.BaseController;
import com.atmae.database.domain.pojo.Course;
import com.atmae.database.domain.pojo.Teacher;
import com.atmae.database.domain.vo.CourseVO;
import com.atmae.database.domain.vo.TScoreVO;
import com.atmae.database.service.ICourseService;
import com.atmae.database.service.ITeacherService;
import com.atmae.database.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:05
 * @Description:
 */
@RestController
@RequestMapping("/courses")
public class CourseController extends BaseController {
    @Autowired
    private ICourseService courseService;
    @Autowired
    private ITeacherService teacherService;

    @GetMapping("/list")
    public JsonResult<List<CourseVO>> listCourse() {
        List<Course> courses = courseService.listCourses();
        List<CourseVO> courseVOS = new ArrayList<>();
        for (Course course : courses) {
            CourseVO courseVO = new CourseVO();
            courseVO.setCid(course.getCid());
            courseVO.setTid(course.getTid());
            courseVO.setCname(course.getCname());
            courseVO.setCreditPoints(course.getCreditPoints());
            Teacher byId = teacherService.findById(course.getTid());
            courseVO.setTname(byId.getTname());
            courseVO.setTschool(byId.getTschool());
            courseVOS.add(courseVO);
        }
        return new JsonResult<>(OK, courseVOS);
    }


    @GetMapping("/listByTeacher")
    public JsonResult<List<TScoreVO>> listTScoreVO(int tid) {
        return new JsonResult<>(OK, courseService.listCourseByTid(tid));
    }
}
