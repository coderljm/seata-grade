package com.jzfq.seata.grade.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jzfq.seata.grade.mapper.GradeMapper;
import com.jzfq.seata.grade.model.Grade;
import com.jzfq.seata.grade.service.GradeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生成绩表 服务实现类
 * </p>
 *
 * @author jianmin.li
 * @since 2021-03-21
 */
@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {

}
