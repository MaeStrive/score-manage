package com.atmae.database.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mae
 * @Date: 2022/6/23
 * @Time: 22:12
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreVO {
    private Integer cid;
    private String cname;
    private Integer creditPoints;
    private Double score;
}
