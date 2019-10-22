package com.thread.springthread.demo.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XAIOHU
 * @date 2019/10/15 --15:57
 **/
public class Test21 {
    //奇数  1   3  5  7  9   19 之间的奇数
    // x>l  x<=r    x%2=1  4 ,
    public static void main(String[] args) {
        List<Integer> integers = get(1, 1111);//7-3=4  l. r  r-l<r
        System.out.println(integers);
    }

    public static List<Integer> get(int l, int r) {
        //1
        ArrayList arrayList = new ArrayList();

        for (int t = l; t <= r; t++) {
            if (t % 2 == 1) {
                arrayList.add(t);
            }


        }
        return arrayList;
    }

}
