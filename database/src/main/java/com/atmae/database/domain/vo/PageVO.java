package com.atmae.database.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/23
 * @Time: 17:17
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageVO {
    private List<?> rows;
    private Long total;
}
