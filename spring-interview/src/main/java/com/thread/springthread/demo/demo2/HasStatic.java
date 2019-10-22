package com.thread.springthread.demo.demo2;

/**
 * @author XAIOHU
 * @date 2019/10/10 --22:29
 **/
public class HasStatic {
    private static int x=100;

    public static void main(String[] args) {
        HasStatic hs1 = new HasStatic();
        hs1.x++; //x==101
        HasStatic hs2=new HasStatic();
        hs2.x++;//101
        hs1=new HasStatic();
        hs1.x++;//101
        HasStatic.x--;//99
        System.out.println("x="+x);
    }


}
