package com.atmae.database.service;

import com.atmae.database.domain.vo.TScoreVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: Mae
 * @Date: 2022/7/1
 * @Time: 14:19
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class listCourseByTidTest {
    @Autowired
    private ICourseService courseService;

    @Test
    public void listCourseByTid() {
        List<TScoreVO> tScoreVOS = courseService.listCourseByTid(60001);
        System.out.println(tScoreVOS);
    }
}
