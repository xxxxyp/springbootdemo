package com.example.springbootdemo.reflex;

import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.Field;

/**
 * JAVA反射类之field[]
 */
public class ReflexField {


    public  static String getThisPackageName(Class<?> thisClass){
        String thisClassName=thisClass.getName();
        String thispackage=thisClassName.substring(0,thisClassName.lastIndexOf("."));
        return thispackage;
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException
    {
        //forName方式获取
        Class strClass=Class.forName(getThisPackageName(ReflexField.class)+".ReflexVo");
        //classLoader方式获取
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        Class<?> aClass = classLoader.loadClass(getThisPackageName(ReflexField.class) + ".ReflexVo");
        //获取类的所有声明的字段
        Field[] sField=strClass.getDeclaredFields();
        for (Field field : sField)
        {
            //获取字段的名字
            System.out.printf("Field：%-4s|",field.getName());
            //获取字段的类型的Class类，然后获取规范化的名字
            System.out.printf("Type：%-18s|",field.getType().getCanonicalName());
            //获取字段的类型的Type类对象，然后获取类的名字
            System.out.printf("GenericType:%-18s|",field.getGenericType().getTypeName());
            System.out.println();
        }
    }

}
