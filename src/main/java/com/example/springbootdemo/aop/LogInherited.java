package com.example.springbootdemo.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * @author  wujieye
 * @param
 * @see
 * 自定义实现注解
 */
@Component
@Aspect
public class LogInherited implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
            public void doWith(Field field) throws IllegalArgumentException,
                    IllegalAccessException {
                // System.out.println("Logger Inject into :" + bean.getClass());
                // make the field accessible if defined private
                ReflectionUtils.makeAccessible(field);
                if (field.getAnnotation(TLog.class) != null) {
                    Logger log = Logger.getLogger(bean.getClass());
                    field.set(bean, log);
                }
            }
        });
        return bean;
    }


}
