package com.atmae.database.service;

import com.atmae.database.domain.pojo.Student;
import org.springframework.stereotype.Service;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:16
 * @Description:
 */
public interface IStudentService {
    Student showInfo(int sid);
}
