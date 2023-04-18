package com.tech.chat.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tech.chat.pojo.Chat;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMapper extends BaseMapper<Chat> {
    //id主键顺序递增刷新操作
    @Update("alter table chat auto_increment=1")
    public void alter();
}
