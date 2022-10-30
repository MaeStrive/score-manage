package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.Course;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 19:29
 * @Description:
 */
public interface CourseMapper {
    int insert(Course course);

    Course findByCid(int cid);

    List<Course> findByTid(int tid);

    List<Course> findAll();

    List<Course> listCourseBySid(int sid);
}
