package com.example.springbootdemo.thread.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * ReentrantLock方式
 */
public class LoopPring21 {
    Lock x = new ReentrantLock();
    int index = 0;

    LoopPring21() {
        new Thread(() -> {
            boolean over = false;
            while (!over) {
                if (index % 2 == 0) {
                    x.lock();
                    if (index % 2 == 0) {
                        System.out.print("A");
                        index++;
                    }
                    over = index > 100;
                    x.unlock();
                }
            }
        }).start();
        new Thread(() -> {
            boolean over = false;
            while (!over) {
                if (index % 2 == 1) {
                    x.lock();
                    if (index % 2 == 1) {
                        System.out.print("B");
                        index++;
                    }
                    over = index > 100;
                    x.unlock();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new LoopPring21();
    }
}
