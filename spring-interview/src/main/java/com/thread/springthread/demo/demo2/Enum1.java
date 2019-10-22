package com.thread.springthread.demo.demo2;

/**
 * @author XAIOHU
 * @date 2019/10/9 --8:38
 **/
public enum Enum1 {
    ONE(1,"1"),TWO(2,"2");
    private Integer i;
    private String name;


    Enum1(Integer i, String name) {
        this.i = i;
        this.name = name;
    }

 //根据1 获得值;

}
