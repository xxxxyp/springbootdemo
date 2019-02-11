package com.example.springbootdemo.TestVo;

import java.io.Serializable;

public class Dog implements Serializable {

    private String kind;
    private int age;
    private String voice;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}

