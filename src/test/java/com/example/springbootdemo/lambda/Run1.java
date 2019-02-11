package com.example.springbootdemo.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run1 {

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");

        Run1.SortJava7(names1);
        System.out.println(names1);

    }

    static void SortJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    static void SortJava8(List<String> names){
        Collections.sort(names,(s1,s2) -> s1.compareTo(s2));
    }
}
