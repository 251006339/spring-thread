package com.thread.springthread.demo.demo1;

/**
 * @author XAIOHU
 * @date 2019/10/11 --19:25
 **/
public class Singleton {
    private  volatile  static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null)
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        return singleton;
    }


    public static void main(String[] args) {
        Singleton instance = null;
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);
        new  Thread(()->
        {
            System.out.println(Singleton.getInstance());
        }

                ).start();
        new  Thread(()->
        {  System.out.println(Singleton.getInstance()); }

        ).start();
        new  Thread(()->
        { System.out.println(Singleton.getInstance()); }

        ).start();
    }
}