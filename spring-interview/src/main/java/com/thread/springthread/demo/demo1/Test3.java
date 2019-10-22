package com.thread.springthread.demo.demo1;

import java.io.FileNotFoundException;
import java.util.UUID;

/**
 * @author XAIOHU
 * @date 2019/10/15 --19:02
 **/
public class Test3 {

    public static void main(String[] args) {

        int i = Integer.parseInt("1");

        try {
            httpPostWithJSON("1","1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void httpPostWithJSON(String url, String json) throws Exception {
        // 将JSON进行UTF-8编码,以便传输中文
        //String entity =
      /*  String encoderJson = URLEncoder.encode(json, HTTP.UTF_8);

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);

        StringEntity se = new StringEntity(encoderJson);
        se.setContentType(CONTENT_TYPE_TEXT_JSON);
        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
        httpPost.setEntity(se);
        httpClient.execute(httpPost);*/

        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println(s);
        String data = String.format("DATAdad");
        System.out.println(data);


    }
}
