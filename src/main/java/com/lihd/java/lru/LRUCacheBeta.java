package com.lihd.java.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-25 13:29
 **/
public class LRUCacheBeta<K, V> implements LRU<K,V>{

    private int capacity;
    private Map<K, V> map;
    private LinkedList<K> list;

    public LRUCacheBeta(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
    }


    public V put(K k, V v) {

        if (list.size() == capacity) {
            //先干掉
            final K k1 = list.removeLast();
            map.remove(k1);
        }

        //如果已经有了 先干掉  在加到头部
        if(map.containsKey(k)){
            list.remove(k);
        }

        list.addFirst(k);
        map.put(k, v);

        return v;

    }


    public V get(K k){

        if(map.containsKey(k)){

            list.remove(k);

            list.addFirst(k);

            return map.get(k);

        }else{

            return null;

        }


    }




}
