package com.thread.springthread.demo.demo3;

import java.util.HashMap;

/**
 * @author XAIOHU
 * @date 2019/10/21 --21:31
 **/
//泛型传递;
public class Test1<K,V>  implements Map1.Node1<K,V>{


    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Map1.test1();
        Map1.Node1.test2();
        test();




    }
    public static void  test(){
        int b = (2 << 32)-1; //90 *2^32 Int 2^32
        int b1 = 90 >>>1;
        int a=2^3;
        int c=    80>>1;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(b1);
        System.out.println(b);
        System.out.println(maxValue);
        System.out.println(a);
        System.out.println(c);

    }


    @Override
    public K getkey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }
}
