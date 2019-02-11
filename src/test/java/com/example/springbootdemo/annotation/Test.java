package com.example.springbootdemo.annotation;

public class Test {

    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.setName("lency");
        persion.setId("1001");
        String query = AnnotationUtil.query(persion);
        System.out.println(query);

    }
}
