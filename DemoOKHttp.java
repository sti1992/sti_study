package com.sti.test_springboot.Test;


import com.sun.tools.javac.util.Log;
import jdk.nashorn.internal.runtime.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Author sti
 * @Date 2022/03/13 21:56
 */
@Logger
public class DemoOKHttp {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        Request.Builder reqBuilder = new Request.Builder().url("http://localhost:8801").get();

        Response response;

        {
            try {
                response = client.newCall(reqBuilder.build()).execute();
                String result = response.body().string();
                System.out.println("时间："+result);
            } catch (IOException e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }

    }

}
