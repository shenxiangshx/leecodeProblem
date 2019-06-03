package com.leetcode.algorithms.cache;


import com.leetcode.bean.LRUNode;

import java.util.HashMap;

public class LRUCache<T,E> {
    private LRUNode<T,E> head;
    private LRUNode<T,E> end;
    private int capacity;

    private HashMap<T, LRUNode<T,E>> cacheMap;

    public LRUCache(int capacity){
        this.capacity=capacity;
        cacheMap=new HashMap<>();
    }

    public E get(T key){
        LRUNode<T,E> node=cacheMap.get(key);
        if (node==null){
            return null;
        }
        refreshNode(node);
        return node.val;
    }

    public void put(T key, E value){
        LRUNode<T,E> node=cacheMap.get(key);
        if (node==null){
            if (cacheMap.size()>=capacity){
                T oldKey = (T) removeNode(head);
                cacheMap.remove(oldKey);
            }
            node=new LRUNode<T,E>(key,value);
            addNode(node);
            cacheMap.put(key, node);
        }else {
            node.val=value;
            refreshNode(node);
        }
    }

    public void remove(T key){
        LRUNode<T,E> node=cacheMap.get(key);
        removeNode(node);
        cacheMap.remove(key);
    }

    private void refreshNode(LRUNode<T,E> node){
        if (node==end){
            return;
        }
        removeNode(node);
        addNode(node);
    }

    private T removeNode(LRUNode<T,E> node){
        if (node==head&&node==end){
            head=null;
            end=null;
        }else if (node==end){
            end=end.pre;
            end.next=null;
        }else if (node==head){
            head=head.next;
            head.pre=null;
        }else {
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }
        return node.key;
    }

    private void addNode(LRUNode<T,E> node){
        if (end!=null){
            end.next=node;
            node.pre=end;
            node.next=null;
        }
        end=node;
        if (head==null){
            head=node;
        }
    }
}
