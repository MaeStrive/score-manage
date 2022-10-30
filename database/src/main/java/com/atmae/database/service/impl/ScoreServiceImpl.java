package com.atmae.database.service.impl;

import com.atmae.database.domain.pojo.Course;
import com.atmae.database.domain.pojo.Score;
import com.atmae.database.domain.pojo.Teacher;
import com.atmae.database.domain.vo.CourseVO;
import com.atmae.database.domain.vo.ScoreVO;
import com.atmae.database.mapper.CourseMapper;
import com.atmae.database.mapper.ScoreMapper;
import com.atmae.database.mapper.TeacherMapper;
import com.atmae.database.service.ICourseService;
import com.atmae.database.service.IScoreService;
import com.atmae.database.service.ex.CourseWasEleException;
import com.atmae.database.service.ex.ScoreNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:09
 * @Description:
 */
@Service
public class ScoreServiceImpl implements IScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Score eleScore(int sid, int cid) {
        Score bySidAndCid = scoreMapper.findBySidAndCid(sid, cid);
        if (bySidAndCid == null) {
            throw new ScoreNotFountException("成绩暂时未录入");
        }
        return bySidAndCid;
    }

    @Override
    public List<ScoreVO> listScore(int sid) {
        List<Score> scores = scoreMapper.findBySid(sid);
        List<ScoreVO> scoreVOS = new ArrayList<>();
        for (Score score : scores) {
            ScoreVO scoreVO = new ScoreVO();
            Course byCid = courseMapper.findByCid(score.getCid());
            scoreVO.setCid(score.getCid());
            scoreVO.setScore(score.getScore());
            scoreVO.setCname(byCid.getCname());
            scoreVO.setCreditPoints(byCid.getCreditPoints());
            scoreVOS.add(scoreVO);
        }
        return scoreVOS;
    }


    @Override
    public int eleCourse(int sid, int cid) {
        Score score = new Score();
        score.setSid(sid);
        score.setCid(cid);
        //查询是否已经选过这个课程
        Score bySidAndCid = scoreMapper.findBySidAndCid(sid, cid);
        if (bySidAndCid != null) {
            throw new CourseWasEleException("课程已经被选择过了");
        } else {
            return scoreMapper.insert(score);
        }
    }

    @Override
    public int updateScore(Score score) {
        int update = scoreMapper.update(score);
        return update;
    }
}
