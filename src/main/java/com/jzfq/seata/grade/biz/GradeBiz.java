package com.jzfq.seata.grade.biz;

import com.jzfq.seata.grade.annotation.Biz;
import com.jzfq.seata.grade.model.Grade;
import com.jzfq.seata.grade.service.GradeService;
import com.jzfq.seata.grade.util.LogUtils;
import com.jzfq.seata.grade.vo.GradeVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jianmin.li
 * @Description: 成绩 业务层
 * @Date: 2021/3/21 21:05
 * @Version: 1.0
 */
@Biz
@Slf4j
public class GradeBiz {
    @Autowired
    private GradeService gradeService;

    /**
     * 添加学生成绩
     *
     * @param grades 成绩
     * @return 响应结果
     * @author jianmin.li
     * @date 2021/3/21 21:42
     */
    public boolean addGrades(List<GradeVO> grades) {
        LogUtils.info(log,"接收到的学生成绩:{}",grades);
        BeanCopier beanCopier = BeanCopier.create(GradeVO.class,Grade.class,false);
        List<Grade> list = new ArrayList<>(grades.size());
        for (GradeVO gradeVO : grades) {
            Grade grade = Grade.builder().build();
            beanCopier.copy(gradeVO,grade,null);
            list.add(grade);
        }
        return gradeService.saveBatch(list);
    }
}
