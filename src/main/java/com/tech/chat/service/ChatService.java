package com.tech.chat.service;

import com.tech.chat.mapper.ChatMapper;
import com.tech.chat.pojo.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JasonD
 * @date: 2023/4/4 20:33
 * @Description:
 */
@Service
public class ChatService {
    @Autowired
    ChatMapper chatMapper;

    //id顺序递增
    public void alter() {
        chatMapper.alter();
    }

    //查找所有存在chat
    public List<Chat> queryAll() {
        return chatMapper.selectList(null);
    }

    //根据id查找chat
    public Chat queryById(int id) {
        return chatMapper.selectById(id);
    }

    //增加一个chat
    public int insertChat(Chat chat) {
        return chatMapper.insert(chat);
    }

    //根据id删除chat
    public int deleteById(int id) {
        return chatMapper.deleteById(id);
    }

    //更新chat
    public int updateChat(Chat chat) {
        return chatMapper.update(chat, null);
    }
}
