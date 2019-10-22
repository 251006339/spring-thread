package com.thread.springthread.demo.demo2;

/**
 * @author XAIOHU
 * @date 2019/10/10 --22:24
 **/

    public class Square {
        long width;
        public Square(long l) {
            width = l;
        }
        public static void main(String arg[]) {
            Square a, b, c;
            a = new Square(42L);
            b = new Square(42L);
            c = b;
            long s = 42L;
        }
   public void  test()throws Exception{
            try {

            }catch (Exception e){
                //自定义页面异常抛出
                throw  new RuntimeException("msg");
            }finally {

            }

   }

    }

