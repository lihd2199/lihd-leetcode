package com.lihd.java.lru;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-25 13:17
 **/
public class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> implements LRU<K,V> {


    private int capacity;


    public LRULinkedHashMap(int capacity) {
        super(capacity, 0.75f, true);
        //传入指定的缓存最大容量
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }


}
