package com.lihd.java.lru;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-25 16:04
 **/
public interface LRU<K, V> {

    V get(K key);

    V put(K key, V value);


}
