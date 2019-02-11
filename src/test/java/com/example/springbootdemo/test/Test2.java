package com.example.springbootdemo.test;

public class Test2 {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        String forw = test2.forw();
        System.out.println(forw);
    }

    public String forw(){
        for (int i = 0; i <10; i++) {
            if(i == 5){
                return "hello world";
            }
            System.out.println(i);
        }
        return null;
    }
}
