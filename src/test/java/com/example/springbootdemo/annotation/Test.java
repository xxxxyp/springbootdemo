package com.example.springbootdemo.annotation;

import com.example.springbootdemo.annotation.bean.Persion;
import com.example.springbootdemo.annotation.util.AnnotationUtil;

public class Test {

    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.setName("lency");
        persion.setId("1001");
        String query = AnnotationUtil.query(persion);
        System.out.println(query);

    }
}
