package com.atmae.database.service.impl;

import com.atmae.database.domain.pojo.Student;
import com.atmae.database.mapper.StudentMapper;
import com.atmae.database.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:16
 * @Description:
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student showInfo(int sid) {
        Student byId = studentMapper.findById(sid);
        return byId;
    }
}
