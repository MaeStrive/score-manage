package com.atmae.database.service;

import com.atmae.database.domain.pojo.Score;
import com.atmae.database.domain.vo.CourseVO;
import com.atmae.database.domain.vo.ScoreVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:09
 * @Description:
 */
public interface IScoreService {

    Score eleScore(int sid, int cid);

    List<ScoreVO> listScore(int cid);

    int eleCourse(int sid, int cid);

    int updateScore(Score score);
}
