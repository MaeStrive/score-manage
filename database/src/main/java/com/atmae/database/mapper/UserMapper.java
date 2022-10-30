package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:21
 * @Description:
 */
public interface UserMapper {
    int insert(User user);

    User findById(@Param("id") int id);
}
