package com.leetcode.bean;

public class LRUNode<T,E> {
    public E val;
    public T key;
    public LRUNode pre;
    public LRUNode next;
    public LRUNode(T key,E value) {
        this.val = value;
        this.key=key;
    }



}
