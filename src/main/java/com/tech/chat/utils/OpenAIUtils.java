package com.tech.chat.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: JasonD
 * @date: 2023/4/4 19:58
 * @Description:
 * 这是openai的工具类，主要是配置一些api接口的参数数据
 */
public class OpenAIUtils {
    //请求api
    public static String url = "https://api.openai.com/v1/chat/completions";

    //这是我自己申请的api设置
    public static String api = "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";

    //返回gpt信息
    public static String chat(String message) {
        //设置相关请求参数
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("model", "gpt-3.5-turbo");
        paramMap.put("max_tokens", 1000);
        List<Map<String, String>> dataList = new ArrayList<>();
        dataList.add(new HashMap<String, String>(){{
            put("role", "user");
            put("content", message);
        }});
        paramMap.put("messages", dataList);
        String params = JSON.toJSONString(paramMap);

        String answer = null;
        try {
            JSONObject responseBody = OKHttpUtils.dePost(url, params, api);
            JSONArray choices = responseBody.getJSONArray("choices");
            JSONObject result = (JSONObject) choices.get(0);
            answer = result.getJSONObject("message").getString("content");
        } catch (Exception e) {
            e.printStackTrace();
            return "出现了异常";
        }
        return answer;
    }
}
