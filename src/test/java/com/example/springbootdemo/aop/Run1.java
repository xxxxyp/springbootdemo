package com.example.springbootdemo.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Run1 {

    @Test
   public void run1(){
        AopService AopService = new AopService();
        AopService.test1();
    }
}
