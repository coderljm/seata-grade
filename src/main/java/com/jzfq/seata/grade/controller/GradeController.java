package com.jzfq.seata.grade.controller;


import com.jzfq.seata.grade.biz.GradeBiz;
import com.jzfq.seata.grade.vo.GradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 学生成绩表 前端控制器
 * </p>
 *
 * @author jianmin.li
 * @since 2021-03-21
 */
@RestController
@RequestMapping("/grade")
@CrossOrigin
public class GradeController {
    @Autowired
    private GradeBiz gradeBiz;

    /**
     * 添加学生成绩
     *
     * @param grades 成绩
     * @return 响应结果
     * @author jianmin.li
     * @date 2021/3/21 21:42
     */
    @PostMapping("/addGrades")
    public boolean addGrades(@RequestBody List<GradeVO> grades) {
        return gradeBiz.addGrades(grades);
    }
}

