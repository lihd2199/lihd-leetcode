package com.lihd.java.lru;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-25 11:04
 **/
class Node<K,V> {

    K key;
    V value;
    Node pre, next;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }


}
