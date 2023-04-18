package com.tech.chat.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tech.chat.mapper.MessageMapper;
import com.tech.chat.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JasonD
 * @date: 2023/4/4 20:33
 * @Description:
 */
@Service
public class MessageService {
    @Autowired
    MessageMapper messageMapper;

    //id顺序递增
    public void alter() {
        messageMapper.alter();
    }

    //根据chat_id查找所有message
    public List<Message> queryByChatId(int chatId) {
        QueryWrapper<Message> messageQueryWrapper = new QueryWrapper<>();
        messageQueryWrapper.eq("chat_id", chatId);
        return messageMapper.selectList(messageQueryWrapper);
    }

    //根据chat_id删除所有message
    public int deleteAllByChatId(int chatId) {
        QueryWrapper<Message> messageQueryWrapper = new QueryWrapper<>();
        messageQueryWrapper.eq("chat_id", chatId);
        return messageMapper.delete(messageQueryWrapper);
    }

    //根据id查找message
    public Message queryById(int id) {
        return messageMapper.selectById(id);
    }

    //增加一个message
    public int insertMessage(Message message) {
        return messageMapper.insert(message);
    }

    //根据id删除message
    public int deleteById(int id) {
        return messageMapper.deleteById(id);
    }

    //更新message
    public int updateMessage(Message message) {
        return messageMapper.update(message, null);
    }
}
