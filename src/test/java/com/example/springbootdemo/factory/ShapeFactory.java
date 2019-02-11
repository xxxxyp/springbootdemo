package com.example.springbootdemo.factory;

import com.example.springbootdemo.exception.MyException;

import javax.lang.model.type.UnknownTypeException;

public class ShapeFactory {

    public static Shape getShape(ShapeTypeEnum type) throws MyException {
        if(type==null){
            return null;
        }
        switch (type){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                break;
            case SQUARE:
                break;
            default:
                throw new MyException("找不到对应的类型");

        }

        return null;

    }
}
