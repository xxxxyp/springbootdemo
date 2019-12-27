package com.example.springbootdemo.thread.test;

/**
 * 两个线程循环打印
 * 采用synchronized关键字特性，在一个被synchronized关键字锁住的方法里，所有的成员变量会在
 * 读取到锁的时候同步共享内存中的值，确保值统一。
 */
public class LoopPrint2 {

    private static Object lock = new Object();

    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (i < 10) {
                    System.out.println("t1:" + i);
                    i++;
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                while (i < 10) {
                    System.out.println("t2:" + i);
                    i++;
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
