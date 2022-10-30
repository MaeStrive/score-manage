package com.atmae.database.service;

import com.atmae.database.domain.pojo.Course;
import com.atmae.database.domain.vo.TScoreVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:03
 * @Description:
 */

public interface ICourseService {
    List<Course> listCourses();

    List<Course> listCourseBySid(int sid);

    List<TScoreVO> listCourseByTid(int tid);
}
