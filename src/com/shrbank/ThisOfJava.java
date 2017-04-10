package com.shrbank;

/**
 * Created by user on 2017/4/8.
 */

class People{
    private String name = "张三";
    private int age = 30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void tell(){
        System.out.println("姓名："+name+" "+"年龄："+age);
    }

}


public class ThisOfJava {

    public static void main(String[] args) {

        People per = new People();
        per.tell();


    }


}
