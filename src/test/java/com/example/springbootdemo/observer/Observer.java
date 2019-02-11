package com.example.springbootdemo.observer;

public abstract class Observer {

    /**
     * 定义触发事件，所有观察者子类需重写
     */
    public abstract void update();

    /**
     * 需要观察的对象
     */
    protected Subject subject;
}
