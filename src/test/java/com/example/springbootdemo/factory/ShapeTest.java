package com.example.springbootdemo.factory;

import com.example.springbootdemo.exception.MyException;

public class ShapeTest {

    public static void main(String[] args) throws MyException {
        Shape shape = ShapeFactory.getShape(ShapeTypeEnum.CIRCLE);
        shape.draw();
    }
}
