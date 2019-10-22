package com.thread.springthread.demo.demo3;

/**
 * @author XAIOHU
 * @date 2019/10/21 --22:40
 **/
public interface Map1<K,V> {


     interface   Node1<K,V>{
         K getkey();
         V getValue();
         static void test2(){

             System.out.println("test2");
         }
    }

    static void test1(){
        System.out.println("test");
    }

}
