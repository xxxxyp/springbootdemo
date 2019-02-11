package com.example.springbootdemo.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

public class JDKLRUCache<k,v> extends LinkedHashMap<k,v> {

    private final int CACHE_SIZE;


    public JDKLRUCache(int cacheSize) {
        // 这块就是设置一个hashmap的初始大小，同时最后一个true指的是让
        // linkedhashmap按照访问顺序来进行排序，最近访问的放在头，最老访问的就在尾
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size()>CACHE_SIZE;
    }
}
