package com.thread.springthread;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringThreadApplicationTests {

    @Test
    public void contextLoads() {

        BigDecimal bigDecimal=new BigDecimal(44.444);

        //
        //一池5个线程池; 池子都要关闭 close(); close();


        ExecutorService threadpool = Executors.newFixedThreadPool(5);
        try {

            //无返回值:



        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }


    }
    @Test
    public void contextLoads1() {
        int a=10;
        int v=a>4?1:3; //if(a>3,4,3)
        System.out.println(v);


    }

}
