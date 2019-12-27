package com.example.springbootdemo.thread.test;

import com.example.springbootdemo.observer.Observer;

/**
 * 线程的几种状态
 * NEW   新建     new thread 后为新建状态
 * RUNNABLE    运行  调用start方法后为运行状态
 * BLOCKED    阻塞   没抢到锁时为阻塞状态
 * WAITING    等待   调用wait方法后为等待状态
 * TIMED_WAITING    限时等待    调用sleep方法后为此状态
 * TERMINATED    结束     线程跑完后为结束状态
 */
public class ThreadStatus {

    private static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (object){
                System.out.println("t1开始睡眠！");
                try {
                    Thread.sleep(1000);
                    System.out.println("t1开始等待！");
                    object.wait();
                    System.out.println("t1被唤醒！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            synchronized (object){
                object.notify();
            }
        }, "t2");
        System.out.println("t1线程的状态为："+t1.getState());
        t1.start();
        System.out.println("t1线程的状态为："+t1.getState());
        //让main线程休眠一秒，让t1线程跑
        Thread.sleep(1000);
        System.out.println("t1线程的状态为："+t1.getState());
        Thread.sleep(2000);
        System.out.println("t1线程的状态为："+t1.getState());
        t2.start();
        Thread.sleep(2000);
        System.out.println("t1线程的状态为："+t1.getState());
    }
}
