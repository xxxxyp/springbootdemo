package com.example.springbootdemo.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        subject.emit();
        System.out.println("Second state change: 10");
        subject.setState(10);
        subject.emit();
    }
}
