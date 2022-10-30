package com.atmae.database.service.impl;

import com.atmae.database.domain.pojo.Teacher;
import com.atmae.database.mapper.TeacherMapper;
import com.atmae.database.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/22
 * @Time: 9:04
 * @Description:
 */
@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher findById(int tid) {
        return teacherMapper.findById(tid);
    }

    @Override
    public List<Teacher> listAll() {
        return teacherMapper.findAll();
    }
}
