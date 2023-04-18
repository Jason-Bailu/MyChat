package com.tech.chat.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import okhttp3.*;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 * @Author: JasonD
 * @date: 2023/4/4 23:09
 * @Description:
 */
public class OKHttpUtils {
    //构造客户端的连接
    public static OkHttpClient client  = new OkHttpClient.Builder()
            .protocols(Collections.singletonList(Protocol.HTTP_1_1))
            .connectTimeout(100, TimeUnit.SECONDS)
            .readTimeout(100, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build();

    //修改请求内容类型
    public static final MediaType MT = MediaType.get("application/json");

    //Post请求：url请求连接、reqParams请求参数，token请求apikey
    public static JSONObject dePost(String url, String reqParams, String token) throws Exception {
        RequestBody requestBody = RequestBody.create(reqParams, MT);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer " + token)
                .post(requestBody)
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();
        JSONObject body = JSON.parseObject(response.body().string());
        return body;
    }

    //Get请求
    public static JSONObject doGet(String url, String token) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer " + token)
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();
        JSONObject body = JSON.parseObject(response.body().string());
        return body;
    }
}
