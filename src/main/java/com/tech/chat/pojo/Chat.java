package com.tech.chat.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: JasonD
 * @date: 2023/4/4 20:04
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    @TableId(type = IdType.AUTO)
    private Integer id;//会话id
    private String theme;//会话主题：默认为当前会话第一句话

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;//会话创建时间

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;//会话更新时间：会在每一次输入时进行更新

    @TableLogic
    private Integer deleted;//逻辑删除
}
