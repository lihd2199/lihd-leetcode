package com.lihd.java.lru;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-25 13:03
 **/
public class LRUCacheTest {


    @Test
    public void lruCacheTest() {


        final LRU<Integer, Integer> lru1 = new LRUCache<>(5);

        final LRU<Integer, Integer> lru2 = new LRULinkedHashMap<>(5);

        final LRU<Integer, Integer> lru3 = new LRUCacheBeta<>(5);

        test(lru1);

        test(lru2);

        test(lru3);


    }


    private void test(LRU<Integer,Integer> lru){

        lru.put(1, 1);

        lru.put(2, 2);

        lru.put(3, 3);

        lru.put(4, 4);

        lru.put(4, 0);

        lru.put(5, 5);

        lru.put(6, 6);

        final Integer a = lru.get(1);

        final Integer b = lru.get(6);

        final Integer c = lru.get(4);

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);


    }


}
