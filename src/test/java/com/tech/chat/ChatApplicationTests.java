package com.tech.chat;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.tech.chat.utils.OKHttpUtils;
import com.tech.chat.utils.OpenAIUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ChatApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Test
//    void OpenAIUtilsTest() {
//        String message = OpenAIUtils.chat("how to make a bug");
//        System.out.println(message);
//    }

//    @Test
//    void OKHttpUtilsTest() {
//        String url = "https://api.openai.com/v1/chat/completions";
//        String api = "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";
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("model", "gpt-3.5-turbo");
//        List<Map<String, String>> dataList = new ArrayList<>();
//        dataList.add(new HashMap<String, String>(){{
//            put("role", "user");
//            put("content", "introduce yourself");
//        }});
//        paramMap.put("messages", dataList);
//        String param = JSON.toJSONString(paramMap);
//        try {
//            JSONObject jsonObject = OKHttpUtils.dePost(url, param, api);
//            JSONArray choices = jsonObject.getJSONArray("choices");
//            JSONObject result = (JSONObject) choices.get(0);
//            System.out.println(result.getJSONObject("message").getString("content"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
