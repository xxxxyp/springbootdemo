package com.example.springbootdemo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
class AopMethod {


    @Pointcut("execution(* com.example.springbootdemo.TestService.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void dobefore(JoinPoint joinPoint){
        System.out.println("谁给你的勇气，梁静茹吗？");
    }

    @After("pointCut()")
    public void doafter(JoinPoint joinPoint){
        System.out.println("王宝强！");
    }


}
