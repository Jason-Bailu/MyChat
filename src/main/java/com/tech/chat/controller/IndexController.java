package com.tech.chat.controller;

import com.tech.chat.pojo.Chat;
import com.tech.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @Author: JasonD
 * @date: 2023/4/3 23:04
 * @Description:
 */
@Controller
public class IndexController {
    @Autowired
    ChatService chatService;

    @RequestMapping({"/", "/index", "/index.html"})
    public String index(Model model) {
        //这里是提前查询了这个有多少个历史会话
        Collection<Chat> chats = chatService.queryAll();
        model.addAttribute("chats", chats);
        return "index";
    }
}
