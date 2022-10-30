package com.atmae.database.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mae
 * @Date: 2022/6/30
 * @Time: 21:23
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TScoreVO {
    private Integer sid;
    private Integer cid;
    private String sname;
    private String cname;
    private Integer creditPoints;
    private Double score;
}
