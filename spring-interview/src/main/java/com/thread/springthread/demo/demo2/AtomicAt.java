package com.thread.springthread.demo.demo2;



import ch.qos.logback.core.pattern.FormatInfo;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author XAIOHU
 * @date 2019/10/9 --9:48
 **/
public class AtomicAt {


    //订单减扣
    //
    public static void main(String[] args) {
        //时间 30秒存活时间; 判断这个是否在;设置时间;
        //redis
        int i=1 << 4;//向左遍移 4位数;
        Object o = new Object();
        int i1 = o.hashCode();
        System.out.println(i1);
        int i2 = Runtime.getRuntime().availableProcessors();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
      //  Object put = objectObjectConcurrentHashMap.put(null, "");
        objectObjectConcurrentHashMap.put("String","ssa");
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
        stringStringHashMap.get("");
        stringStringHashMap.put("1","1");
        StringBuilder StringBuild=new StringBuilder();
        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();
        objects.add("");
        HashSet<Object> objects1 = new HashSet<>();
        test();


    }

    public  static void test(){
        String  a="abcdefg";
        StringBuilder stringBuild=new StringBuilder(a);
        stringBuild.reverse();
      StringBuffer stringbuffer=new StringBuffer(a);
      StringBuffer reverse = stringbuffer.reverse();
        System.out.println(reverse);

        char[] chars = a.toCharArray();
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.println(chars[i]);


        }
        //数组
         //容器一样;
        Stack<Character> sting=new Stack();
        sting.size();
        //遍历进入
        for (int i = 0; i <chars.length ; i++) {
            sting.push(chars[i]); //进
        }
        Iterator<Character> iterator = sting.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int size = sting.size();
        System.out.println(size);
        //遍历的输出  输出的同时,栈在减少;
        for (int i = 0; i <size ; i++) {
            Character pop = sting.pop();
            System.out.println(pop);
                chars[i]=pop;

        }
        System.out.println(chars);









    }






}
