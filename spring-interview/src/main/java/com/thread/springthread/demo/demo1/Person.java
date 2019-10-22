package com.thread.springthread.demo.demo1;

/**
 * @author XAIOHU
 * @date 2019/10/11 --14:17
 **/
public class Person {
    private String name="5";
    private static String n;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    {
        System.out.println("1");
    }
    static{
        System.out.println("2");
    }
    static void test(){
        System.out.println("3");

    }

    public static void main(String[] args) {
        System.out.println("4");
       final Person person = new Person();

        person.setName("1");
        System.out.println(person);

    }

}
