package com.thread.springthread.demo.demo2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author XAIOHU
 * @date 2019/10/10 --22:05
 **/
public class Test
{
    public static int aMethod(int i) throws Exception {int i1=0
            ;
        try{
             i1 = 10 / i;//返回不会走异常, 会走finally修饰方法; finally
            System.out.println(i1);
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.println("finally");
        }
        return i1;
    }

    public static void main(String [] args)
    {
        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
            System.out.println(message);
            System.out.println("exception in main");
        }
        System.out.println("finished");
    }
}


