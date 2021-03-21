package com.jzfq.seata.grade.vo;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @Author: jianmin.li
 * @Description: 成绩 实体
 * @Date: 2021/3/21 21:11
 * @Version: 1.0
 */
@Data
public class GradeVO {
    /**
     * 学号
     */
    private Integer studentId;
    /**
     * 学科
     */
    private Integer subject;
    /**
     * 分数
     */
    private Integer score;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
