package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 18:50
 * @Description:
 */
public interface StudentMapper {
    /**
     * 插入一条学生信息
     *
     * @param student
     * @return
     */
    int insert(Student student);

    /**
     * 根据id查询学生信息
     *
     * @return
     */
    Student findById(int sid);


    /**
     * 更新学生学分
     *
     * @param credit
     * @param sid
     * @return
     */
    int updateCredit(@Param("credit") double credit, @Param("sid") int sid);

}
