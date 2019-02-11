package com.example.springbootdemo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 生成sql工具类
 */
public class AnnotationUtil {

    public static String query(Persion persion){

        StringBuilder sb = new StringBuilder();
        //通过反射获取class对象
        Class<? extends Persion> p = persion.getClass();
        //判断class是不是注解类
        boolean flag = p.isAnnotationPresent(Table.class);
        if(!flag){
            return "";
        }
        //获取到注解类对象
        Table table = p.getAnnotation(Table.class);
        String tableName = table.value();
        //拼接sql
        sb.append("select * from ").append(tableName).append(" where 1=1");
        //获取类的属性
        Field[] declaredFields = p.getDeclaredFields();
        //重复上面的过程获取column
        for (Field field:declaredFields) {
            boolean flag1 = field.isAnnotationPresent(Column.class);
            if(!flag1){
                return "";
            }
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();
            String fieldName = field.getName();
            Object fieldValue = null;
            String getMethodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
            try {
                Method method = p.getMethod(getMethodName);
                fieldValue = method.invoke(persion);
            }catch (Exception e){
                e.printStackTrace();
            }
            sb.append(" and ").append(columnName).append(" = ").append(fieldValue);
        }

        return sb.toString();
    }
}
