package com.example.springbootdemo.single;

import jdk.nashorn.internal.ir.RuntimeNode;

public class ShapeLazy {
    //私有
    private static ShapeLazy instance;
    private ShapeLazy(){}

    public static ShapeLazy getInstance(){
        if(instance == null){
            instance = new ShapeLazy();
        }else if (instance!=null){
            throw new RuntimeException("当前实力已经创建");
        }
        return instance;
    }
    public static String shapeInfo(){
        return "this is a 懒汉式";
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
