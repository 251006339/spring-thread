package com.thread.springthread.demo.demo2;

import org.omg.CORBA.INTERNAL;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author XAIOHU
 * @date 2019/10/15 --16:24
 * 请考虑如何实现将数据较均匀的分散到固定数目的节点中,并且在加减节点时能使受影响的数据最少":
 * 请思考如何实现一个本地内存 能满足下列两个方法,并能够及时清理掉过期的数据?
 * get(String key)
 * put(String key.Object value,Long expired_time)
 **/
public class Tesy3 {
//  Londoners are under starter's orders as the city gets,ready for the Olympic Game


    public static void main(String[] args) throws Exception {
        String file = "D:\\java基础复习\\spring-thread\\spring-interview\\article.txt";

        Map<Object, Object> objectObjectMap = outputFile(file);
        Iterator<Map.Entry<Object, Object>> iterator = objectObjectMap.entrySet().iterator();

            System.out.println(objectObjectMap);
 while (iterator.hasNext()){
     Object key = iterator.next().getKey();
     Object value =objectObjectMap.get(key) ;
     System.out.println(key+  "   " +value);


 }


    }

    static Map<Object, Object>  outputFile(String inputFile ) throws Exception {
        Map<Object, Object> outputFile=new HashMap<>();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(inputFile)));
        BufferedReader in = new BufferedReader(new InputStreamReader(bis, "utf-8"), 10 * 1024 * 1024);//10M缓存

        while (in.ready()) {
            String line = in.readLine();//读出一行
            line.trim();
            String[] s = line.split(" ");
            //

            for (int i = 0; i < s.length; i++) {

                //key value
                Set<Object> objects = outputFile.keySet();
                if (objects.contains(s[i])) {

                    int k = (Integer) outputFile.get(s[i]);
                       outputFile.put(s[i],k+1);//
                }else {
                    outputFile.put(s[i], 1);
                }


            }


        }
        in.close();

  return outputFile;
    }
}