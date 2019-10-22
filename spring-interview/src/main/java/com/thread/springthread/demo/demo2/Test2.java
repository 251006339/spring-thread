package com.thread.springthread.demo.demo2;

import java.io.*;

/**
 * @author XAIOHU
 * @date 2019/10/11 --13:50
 **/
public class Test2 {

    public static void main(String[] args) throws IOException {
       /* Person person = new Person();
        FileOutputStream sdada = new FileOutputStream(new File("/sdada"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(sdada);
        objectOutputStream.writeObject(person);*/
        reverse();
    }
       public static void reverse() throws FileNotFoundException {
           FileInputStream fileInputStream = new FileInputStream(new File("/sdada"));
           try {
               ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
               Object o = objectInputStream.readObject();
               System.out.println(o);

           } catch (Exception e) {
               e.printStackTrace();
           }


       }

}
