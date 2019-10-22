package com.thread.springthread.demo.demo2;

/**
 * @author XAIOHU
 * @date 2019/10/11 --13:28
 **/
public class StaticTest {
    //编译时,就
    private static int staticInt = 2;//静态变量
    private int random = 2;//实例变量

    public StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();

        StaticTest test2 = new StaticTest();


    }
}

