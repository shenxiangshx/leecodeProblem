package com.leetcode.bean;

public class DoubleLinkNode<T> {
    private T val;
    private DoubleLinkNode<T> next;
    private DoubleLinkNode<T> pre;

    public DoubleLinkNode(T val){
        this(val,null,null);
    }

    public DoubleLinkNode(T val, DoubleLinkNode<T> next, DoubleLinkNode<T> pre){
        this.val=val;
        this.next=next;
        this.pre=pre;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public DoubleLinkNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleLinkNode<T> next) {
        this.next = next;
    }

    public DoubleLinkNode<T> getPre() {
        return pre;
    }

    public void setPre(DoubleLinkNode<T> pre) {
        this.pre = pre;
    }
}
