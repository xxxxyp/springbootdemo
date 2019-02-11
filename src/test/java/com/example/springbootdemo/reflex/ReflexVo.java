package com.example.springbootdemo.reflex;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

public class ReflexVo {

    private String userId;
    private String name;
    private Integer age;
    private double tall;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}
