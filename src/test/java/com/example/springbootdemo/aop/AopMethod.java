package com.example.springbootdemo.aop;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@Aspect
@Component
class AopMethod {

    @Pointcut("execution(com.example.springbootdemo.aop...*.*(..))")
    public void pointCut(){}


    @Before("pointCut()")
    public void dobefore(JoinPoint joinPoint){
        System.out.println("谁给你的勇气，梁静茹吗？");
    }

    @After("pointCut()")
    public void doafter(JoinPoint joinPoint){
        System.out.println("谁给你的勇气，迪丽热巴吗15216265283？");
    }


}
