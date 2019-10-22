package com.thread.springthread.demo.demo3;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author XAIOHU
 * @date 2019/10/16 --18:35
 **/
public class Test {

    public static void main(String[] args) {
        //33796
      char [] value=new char []{1,4,5,6};
       //开始为0;
        int hash=0;
        int h = 0;
        //4;
        if (h == 0 && value.length > 0) {
            //
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                //1-->31*0+1=1
                //2--->31*1+4=93
                //3--->31*93+5=
                //4--->31*
                h = 31 * h + val[i];
            }
            hash = h;
        }
        System.out.println(h);
    }

    }
