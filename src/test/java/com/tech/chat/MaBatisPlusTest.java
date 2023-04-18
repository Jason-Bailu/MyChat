package com.tech.chat;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tech.chat.mapper.ChatMapper;
import com.tech.chat.mapper.MessageMapper;
import com.tech.chat.pojo.Chat;
import com.tech.chat.pojo.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: JasonD
 * @date: 2023/4/5 15:16
 * @Description:
 */
@SpringBootTest
public class MaBatisPlusTest {
    @Autowired
    ChatMapper chatMapper;

    @Autowired
    MessageMapper messageMapper;

//    //CRUD
//    //增
//    @Test
//    public void insertTest() {
//        Chat chat = new Chat();
//        chat.setId(1);
//        chat.setTheme("test");
//        int i = chatMapper.insert(chat);
//        System.out.println(i);
//
//        Message message = new Message();
//        message.setId(1);
//        message.setContent("test message");
//        message.setFlag(1);
//        message.setChatId(chat.getId());
//        int j = messageMapper.insert(message);
//        System.out.println(j);
//    }
//
//    //删
//    @Test
//    public void deleteTest() {
//        //必须要先删除完chat的message
//        int j = messageMapper.deleteById(1);
//        System.out.println(j);
//        //才能删除chat
//        int i = chatMapper.deleteById(1);
//        System.out.println(i);
//    }
//
//    //改
//    @Test
//    public void updateTest() {
//        Chat chat = new Chat();
//        chat.setId(1);
//        chat.setTheme("test update");
//        int i = chatMapper.update(chat, null);
//        System.out.println(i);
//
//        Message message = new Message();
//        message.setId(1);
//        message.setContent("test message update");
//        message.setFlag(1);
//        message.setChatId(chat.getId());
//        int j = messageMapper.update(message, null);
//        System.out.println(j);
//    }
//
//    //查
//    @Test
//    public void selectTest() {
//        //单个查询
//        Chat chat = chatMapper.selectById(1);
//        System.out.println(chat);
//        Message message = messageMapper.selectById(1);
//        System.out.println(message);
//
//        //联表查询
//        QueryWrapper<Message> wrapper = new QueryWrapper<>();
//        wrapper.ge("chat_id", chat.getId());
//        List<Message> messages = messageMapper.selectList(wrapper);
//        messages.forEach(System.out::println);
//    }
//
//    //模拟数据构建
//    @Test
//    public void testData() {
//        //test chat
//        Chat chat = new Chat();
//        chat.setId(1);
//        chat.setTheme("test chat 1");
//        int chatInsert = chatMapper.insert(chat);
//        System.out.println(chatInsert);
//
//        //test message 1-20
//        int insert = 0;
//        for (int i = 1; i <= 20; i++) {
//            Message message = new Message();
//            message.setId(i);
//            message.setContent("test message " + i);
//            message.setFlag((i%2==0)?1:0);
//            message.setChatId(chat.getId());
//            insert += messageMapper.insert(message);
//        }
//        System.out.println(insert);
//    }
//
//    @Test
//    public void deleteDatas() {
//        QueryWrapper<Message> messageWrapper = new QueryWrapper<>();
//        messageWrapper.ge("chat_id", 1);
//        int deletes = messageMapper.delete(messageWrapper);
//        System.out.println(deletes);
//
//        QueryWrapper<Chat> chatWrapper = new QueryWrapper<>();
//        chatWrapper.ge("id", 1);
//        int delete = chatMapper.delete(chatWrapper);
//        System.out.println(delete);
//    }
}
