package com.leetcode.algorithms.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheLinkHashMap<K,V> {

    private static final float hashLoadFactory = 0.75f;
    private LinkedHashMap<K,V> linkedHashMap;
    private int capacity;


    public LRUCacheLinkHashMap(int capacity){
        this.capacity=capacity;
        int size= (int) Math.ceil(capacity/hashLoadFactory);
        linkedHashMap=new LinkedHashMap<K,V>(size,hashLoadFactory,true){
            private static final long serialVersionUID = 1;
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > LRUCacheLinkHashMap.this.capacity;
            }
        };
    }

    public synchronized V get(K key){
        return linkedHashMap.get(key);
    }

    public synchronized  void put(K key,V value){
        linkedHashMap.put(key, value);
    }

    public synchronized void clear() {
        linkedHashMap.clear();
    }

    public synchronized int usedSize() {
        return linkedHashMap.size();
    }

    public void print() {
        for (Map.Entry<K, V> entry : linkedHashMap.entrySet()) {
            System.out.print(entry.getKey() + "--"+entry.getValue());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LRUCacheLinkHashMap<Integer,Integer> cacheLinkHashMap = new LRUCacheLinkHashMap(3);
        cacheLinkHashMap.put(1,1);
        cacheLinkHashMap.put(2,1);
        cacheLinkHashMap.put(1,3);
        cacheLinkHashMap.print();
    }
}
