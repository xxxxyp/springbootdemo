package com.example.springbootdemo.proxy;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.FileInputStream;
import java.io.IOException;

public class ProxyTest {

    public static void main(String[] args) {

        try {
            String md5 = DigestUtils.md5Hex(new FileInputStream("d/file"));
            System.out.println(md5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image image = new ProxyImage("xxxxyp.avi");
        image.display();
        image.display();
    }
}
