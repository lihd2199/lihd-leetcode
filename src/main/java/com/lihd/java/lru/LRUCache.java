package com.lihd.java.lru;


import java.util.HashMap;

/**
 * @program: lihd-leetcode
 * @description: LRU算法
 * @author: li_hd
 * @create: 2020-03-25 10:59
 **/
public class LRUCache<K,V> implements LRU<K,V>{

    private int capacity;

    private HashMap<K, Node> map = new HashMap<>();

    private Node head = null;

    private Node end = null;


    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public V get(K key) {

        if (map.containsKey(key)) {
            Node<K,V> n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return null;

    }

    private void setHead(Node n) {

        if (head == null) {
            head = n;
            end = n;
        } else {
            head.pre = n;
            n.next = head;
            n.pre = null;
            this.head = n;
        }

    }

    private void remove(Node n) {

        if (n.pre == null) {
            n.next.pre = null;
            head = n.next;
        } else if (n.next == null) {
            n.pre.next = null;
            end = n.pre;
        } else {
            Node pre = n.pre;
            Node next = n.next;
            pre.next = next;
            next.pre = pre;
        }

    }


    public V put(K key, V value) {

        final Node<K,V> node = new Node<>(key, value);
        if (map.size() == capacity) {
            //先干掉最后一个
            map.remove(end.key);
            remove(end);
        }
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
        }

        setHead(node);
        map.put(key, node);
        return value;
    }


}
