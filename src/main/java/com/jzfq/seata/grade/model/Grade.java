package com.jzfq.seata.grade.model;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 学生成绩表
 * </p>
 *
 * @author jianmin.li
 * @since 2021-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("grade")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，雪花算法生成
     */
    @TableId("id")
    private Long id;

    /**
     * 学号
     */
    @TableField("student_id")
    private Integer studentId;

    /**
     * 0 语文 1 数学 2 英语
     */
    @TableField("subject")
    private Integer subject;

    /**
     * 分数
     */
    @TableField("score")
    private Integer score;

    /**
     * 创建时间
     */
    @TableField("create_at")
    private LocalDateTime createAt;


    public static final String ID = "id";

    public static final String STUDENT_ID = "student_id";

    public static final String SUBJECT = "subject";

    public static final String SCORE = "score";

    public static final String CREATE_AT = "create_at";

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
