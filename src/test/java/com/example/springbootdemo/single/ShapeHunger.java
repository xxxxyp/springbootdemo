package com.example.springbootdemo.single;

public class ShapeHunger {
    private ShapeHunger(){}
    private static final ShapeHunger INSTANCE = new ShapeHunger();

    public static ShapeHunger getInstance(){
        if(INSTANCE != null){
            throw new RuntimeException();
        }
        return INSTANCE;
    }

    public static String shapeInfo(){
        return "this is a 饿汉式";
    }
}
