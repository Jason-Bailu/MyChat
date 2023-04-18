package com.tech.chat.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: JasonD
 * @date: 2023/4/4 19:57
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @TableId(type = IdType.AUTO)
    private Integer id;//信息id：主键
    private String content;//信息内容
    private Integer flag;//信息来源：1 user 0 AI
    private Integer chatId;//当前会话Id

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;//创造时间

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;//更新时间

    @TableLogic
    private Integer deleted;//逻辑删除
}
