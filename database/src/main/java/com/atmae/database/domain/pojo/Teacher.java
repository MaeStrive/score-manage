package com.atmae.database.domain.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 18:45
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int tid;
    private String tname;
    private String tschool;
}
