package com.atmae.database.service;

import com.atmae.database.domain.pojo.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/22
 * @Time: 9:03
 * @Description:
 */
public interface ITeacherService {

    Teacher findById(int tid);

    List<Teacher> listAll();
}
