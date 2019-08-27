package com.leetcode.bean;


import java.util.HashMap;
import java.util.Hashtable;

public class BLtree<Key extends Comparable<Key>, Value> {
    private static final int M = 4;
    private Node root;
    int data;
    int bf;
    BLtree lChild,rChild;

    private void insertAVL(BLtree bLtree,int e,int taller){
    }

    private static final class Node{
        //值的数量
        private int m;
        private Entry[] children = new Entry[M];
        private Node(int k){
            m = k;
        }
    }

    //节点内部每个数据项定义
    private static class Entry{
        private Comparable key;
        private final Object val;
        //下一个节点
        private Node next;
        public Entry(Comparable key, Object val, Node next){
            this.key = key;
            this.val = val;
            this.next = next;
        }
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Entry [key=");
            builder.append(key);
            builder.append("]");
            return builder.toString();
        }

    }

}
