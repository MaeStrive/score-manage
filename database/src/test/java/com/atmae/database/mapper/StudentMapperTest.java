package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 19:57
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void insertStudent() {
        Student student = new Student();
        student.setSname("王浩");
        student.setSclass(3);
        student.setSgender("男");
        student.setSmajor("计算机");
        int insert = studentMapper.insert(student);
        System.out.println(insert);
    }

    @Test
    public void queryStudnet() {
        Student byId = studentMapper.findById(1);
        System.out.println(byId);
    }
}
