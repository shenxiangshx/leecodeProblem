package com.leetcode.algorithms.testmain;

import com.leetcode.algorithms.cache.LRUCacheLinkHashMap;

public class main1 {
    public static void main(String[] args) {
        LRUCacheLinkHashMap lruCacheLinkHashMap =new LRUCacheLinkHashMap(10);
        lruCacheLinkHashMap.put("1",1);
        lruCacheLinkHashMap.put("2",1);
        lruCacheLinkHashMap.put("3",1);
        lruCacheLinkHashMap.put("1",2);
        lruCacheLinkHashMap.put("1",3);
        lruCacheLinkHashMap.put("4",3);
        lruCacheLinkHashMap.put("5",3);
        lruCacheLinkHashMap.put("6",3);
        lruCacheLinkHashMap.put("7",3);
        lruCacheLinkHashMap.put("8",3);
        lruCacheLinkHashMap.put("9",3);
        lruCacheLinkHashMap.put("10",3);
        lruCacheLinkHashMap.put("1",4);

        lruCacheLinkHashMap.print();
    }
}
