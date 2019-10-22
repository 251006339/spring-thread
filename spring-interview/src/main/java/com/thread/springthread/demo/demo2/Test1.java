package com.thread.springthread.demo.demo2;

/**
 * @author XAIOHU
 * @date 2019/10/15 --23:12
 **/
public class Test1 {

    public static void main(String[] args) {
        String a = "abcdefghi";
        char[] chars = a.toCharArray();
        double t = chars.length / 2;
        for (int i = 0; i < chars.length / 2; i++) {

            //如果是
            char temp = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = chars[i];
            chars[i] = temp;


        }

        System.out.println(chars);
    }


}
