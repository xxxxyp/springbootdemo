package com.example.springbootdemo.observer;

public class OctalObserver extends Observer {

    /**
     * 重写构造方法，注入需要观察的对象
     */
    public OctalObserver(Subject subject) {
        this.subject = subject;
        //添加观察者
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
