package com.tech.chat.controller;

import com.tech.chat.pojo.Message;
import com.tech.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @Author: JasonD
 * @date: 2023/4/4 19:56
 * @Description:
 */
@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("/message/show/{id}")
    public String showMessages(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        messageService.alter();
        List<Message> msgs = messageService.queryByChatId(id);
        if (msgs.size() == 0) {
            redirectAttributes.addFlashAttribute("msgs", null);
        } else {
            redirectAttributes.addFlashAttribute("msgs", msgs);
        }
        redirectAttributes.addFlashAttribute("chatId", id);
        return "redirect:/index";
    }
}
