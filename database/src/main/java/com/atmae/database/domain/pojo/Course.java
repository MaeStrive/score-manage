package com.atmae.database.domain.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 18:46
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int  cid;
    private int tid;
    private String cname;
    private int creditPoints;
}
