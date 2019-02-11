package com.example.springbootdemo.observer;

public class BinaryObserver extends Observer {

    /**
     * 重写构造方法，注入需要观察的对象
     */
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        //添加观察者
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
