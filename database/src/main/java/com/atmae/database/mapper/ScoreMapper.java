package com.atmae.database.mapper;

import com.atmae.database.domain.pojo.Score;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 19:39
 * @Description:
 */
public interface ScoreMapper {
    int insert(Score score);

    int update(Score score);

    Score findBySidAndCid(int sid, int cid);

    List<Score> findBySid(int sid);

    List<Score> findByCid(int cid);
}
