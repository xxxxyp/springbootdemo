package com.example.springbootdemo.single;

import java.lang.reflect.Constructor;

public class ShapeTest {

    public static void main(String[] args) throws Exception {
        ShapeLazy instance = ShapeLazy.getInstance();
        instance.setName("张三");
        System.out.println(instance.getName());
        ShapeLazy instance1 = ShapeLazy.getInstance();
        System.out.println(instance1.getName());
        Class shapeLazy = Class.forName("com.example.springbootdemo.single.ShapeLazy");
        Constructor c = shapeLazy.getDeclaredConstructor(null);
        c.setAccessible(true);
        instance = (ShapeLazy) c.newInstance();
        System.out.println(instance.getName());

    }
}
