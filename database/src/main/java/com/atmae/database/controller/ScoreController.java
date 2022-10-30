package com.atmae.database.controller;

import com.atmae.database.controller.base.BaseController;
import com.atmae.database.domain.pojo.Score;
import com.atmae.database.domain.vo.CourseVO;
import com.atmae.database.domain.vo.ScoreVO;
import com.atmae.database.service.IScoreService;
import com.atmae.database.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:13
 * @Description:
 */
@RestController
@RequestMapping("/scores")
public class ScoreController extends BaseController {
    @Autowired
    private IScoreService scoreService;


    @PostMapping("/eleCourse")
    public JsonResult<Void> eleCourse(@RequestBody Score score) {
        int i = scoreService.eleCourse(score.getSid(), score.getCid());
        return new JsonResult<>(OK);
    }


    @GetMapping("/queryScore")
    public JsonResult<List<ScoreVO>> listScore( int sid) {
        List<ScoreVO> scoreVOS = scoreService.listScore(sid);
        return new JsonResult<>(OK, scoreVOS);
    }


    @PostMapping("update")
    public JsonResult<Void> update(@RequestBody Score score) {
        int i = scoreService.updateScore(score);
        return new JsonResult<>(OK);
    }
}
