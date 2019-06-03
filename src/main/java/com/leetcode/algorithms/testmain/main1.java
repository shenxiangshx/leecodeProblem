package com.leetcode.algorithms.testmain;

import com.leetcode.algorithms.lru.LRUCache;

public class main1 {
    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(10);
        lruCache.put("1",1);
        lruCache.put("2",1);
        lruCache.put("3",1);
        lruCache.put("1",2);
        lruCache.put("1",3);
        lruCache.put("4",3);
        lruCache.put("5",3);
        lruCache.put("6",3);
        lruCache.put("7",3);
        lruCache.put("8",3);
        lruCache.put("9",3);
        lruCache.put("10",3);
        lruCache.put("1",4);

        lruCache.print();
    }
}
