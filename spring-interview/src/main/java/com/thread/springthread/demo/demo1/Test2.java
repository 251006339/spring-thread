package com.thread.springthread.demo.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author XAIOHU
 * @date 2019/10/15 --15:42
 **/
public class Test2 {


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        String s = get(2, integers);

        System.out.println(s);


    }

    public static String get(int k, List<Integer> arr){



        for (Integer arr1:arr){
            if(arr1.equals(k)){
            return "yes";
            }

        }
        return "no";
    }
}
