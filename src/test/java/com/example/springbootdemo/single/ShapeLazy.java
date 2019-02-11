package com.example.springbootdemo.single;

public class ShapeLazy {
    //私有
    private static ShapeLazy instance;
    private ShapeLazy(){}

    public static ShapeLazy getInstance(){
        if(instance == null){
            instance = new ShapeLazy();
        }
        return instance;
    }
    public static String shapeInfo(){
        return "this is a 懒汉式";
    }


}
