package com.atmae.database.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mae
 * @Date: 2022/6/23
 * @Time: 16:50
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseVO {

    private int cid;
    private int tid;
    private String cname;
    private String tname;
    private String tschool;
    private int creditPoints;
    private double score;
}
