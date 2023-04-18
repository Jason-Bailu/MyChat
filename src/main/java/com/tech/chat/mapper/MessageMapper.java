package com.tech.chat.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tech.chat.pojo.Message;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper extends BaseMapper<Message> {
    //id主键顺序递增刷新操作
    @Update("alter table message auto_increment=1")
    public void alter();
}
