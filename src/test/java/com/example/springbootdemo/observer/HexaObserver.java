package com.example.springbootdemo.observer;

public class HexaObserver extends Observer {

    /**
     * 重写构造方法，注入需要观察的对象
     */
    public HexaObserver(Subject subject) {
        this.subject = subject;
        //添加观察者
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: "
                + Integer.toHexString(subject.getState()));
    }
}
