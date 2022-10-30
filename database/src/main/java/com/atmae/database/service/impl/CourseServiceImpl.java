package com.atmae.database.service.impl;

import com.atmae.database.domain.pojo.Course;
import com.atmae.database.domain.pojo.Score;
import com.atmae.database.domain.pojo.Student;
import com.atmae.database.domain.vo.TScoreVO;
import com.atmae.database.mapper.CourseMapper;
import com.atmae.database.mapper.ScoreMapper;
import com.atmae.database.mapper.StudentMapper;
import com.atmae.database.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:04
 * @Description:
 */
@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Course> listCourses() {
        return courseMapper.findAll();
    }

    @Override
    public List<Course> listCourseBySid(int sid) {
        return courseMapper.listCourseBySid(sid);
    }

    @Override
    public List<TScoreVO> listCourseByTid(int tid) {
        //根据教师id查询课程
        List<Course> byTid = courseMapper.findByTid(tid);
        //根据课程id查询成绩
        List<TScoreVO> tScoreVOS = new ArrayList<>();
        for (Course course : byTid) {
            List<Score> byCid = scoreMapper.findByCid(course.getCid());
            for (Score score : byCid) {
                TScoreVO tScoreVO = new TScoreVO();
                tScoreVO.setScore(score.getScore());
                tScoreVO.setCid(score.getCid());
                tScoreVO.setCname(course.getCname());
                tScoreVO.setSid(score.getSid());
                Student byId = studentMapper.findById(score.getSid());
                tScoreVO.setSname(studentMapper.findById(score.getSid()).getSname());
                tScoreVO.setCreditPoints(course.getCreditPoints());
                tScoreVOS.add(tScoreVO);
            }
        }
        return tScoreVOS;
    }
}
