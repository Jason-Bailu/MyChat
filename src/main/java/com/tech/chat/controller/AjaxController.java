package com.tech.chat.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.tech.chat.pojo.Message;
import com.tech.chat.service.MessageService;
import com.tech.chat.utils.OpenAIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @Author: JasonD
 * @date: 2023/4/11 19:02
 * @Description:
 */
@Controller
public class AjaxController {
    @Autowired
    MessageService messageService;

    @PostMapping("/ajax")
    @ResponseBody
    public JSONObject ajax(@RequestParam("chatId") Integer chatId, @RequestParam("content") String content) {
        Collection<Message> msgs = messageService.queryByChatId(chatId);
        Message message = new Message();
        message.setContent(content);
        message.setFlag(0);
        message.setChatId(chatId);
        messageService.insertMessage(message);
        msgs.add(message);

        Message messageGPT = new Message();
        messageGPT.setContent(OpenAIUtils.chat(content));
        messageGPT.setFlag(1);
        messageGPT.setChatId(chatId);
        messageService.insertMessage(messageGPT);
        msgs.add(messageGPT);

        JSONObject messageAI = (JSONObject) JSON.toJSON(messageGPT);
        return messageAI;
    }
}
