package com.leetcode.bean;

public class DoubleLink<T> {
    private DoubleLinkNode headNode;
    private DoubleLinkNode lastNode;
    private int capacity;

    public DoubleLink(){
        this.headNode=new DoubleLinkNode<T>(null);
        this.lastNode=headNode;
    }

    public void add(DoubleLinkNode p){
        DoubleLinkNode<T> last=lastNode;
        lastNode=p;
        if (last==null){
            headNode=p;
        }else {
            p.setPre(last);
            last.setNext(p);
        }

        this.capacity++;
    }

    public void afterNodeRemoval(DoubleLinkNode e){
        DoubleLinkNode<T> p=e,b=e.getPre(),a=p.getNext();
        p.setNext(null);
        p.setPre(null);
        if (b==null){
            headNode=a;
        }else {
            b.setNext(a);
        }
        if (a==null){
            lastNode=b;
        }else {
            a.setPre(b);
        }
    }
}
