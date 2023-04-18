package com.tech.chat.controller;

import com.tech.chat.pojo.Chat;
import com.tech.chat.service.ChatService;
import com.tech.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: JasonD
 * @date: 2023/4/5 17:49
 * @Description:
 */
@Controller
public class ChatController {
    @Autowired
    ChatService chatService;

    @Autowired
    MessageService messageService;

    @RequestMapping("/chat/create/{chatId}")
    public String createChat(@PathVariable("chatId") Integer chatId, Model model) {
        chatService.alter();
        Chat chat = new Chat();
        chat.setId(chatId);
        chat.setTheme("会话" + chatId);
        chatService.insertChat(chat);
        model.addAttribute("chatId", chatId);
        return "forward:/index";
    }

    @RequestMapping("/chat/delete/{chatId}")
    public String deleteChat(@PathVariable("chatId") Integer chatId) {
        messageService.deleteAllByChatId(chatId);
        chatService.deleteById(chatId);
        return "forward:/index";
    }
}
