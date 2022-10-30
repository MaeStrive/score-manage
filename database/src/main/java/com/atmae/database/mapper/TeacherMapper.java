package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 19:21
 * @Description:
 */
public interface TeacherMapper {
    /**
     * 插入教师
     *
     * @param teacher
     * @return
     */
    int insert(Teacher teacher);

    /**
     * 根据id查询教师
     *
     * @param tid
     * @return
     */
    Teacher findById(int tid);

    /**
     * 查询所有老师
     *
     * @return
     */
    List<Teacher> findAll();
}
