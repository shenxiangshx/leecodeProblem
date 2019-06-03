package com.leetcode.bean;

public class ListNode {
    private ListNode head;
    public int val;
    public ListNode next;
    public ListNode(){
        new ListNode(0);
    }
    public ListNode(int val){
        this.val=val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void deleteNode(int val){
        while (this.next!=null){
            if (this.getVal()==val){
                this.setNext(this.next.getNext());
                this.setVal(this.next.getVal());
                break;
            }
        }
    }

    public ListNode searchNode(int val){
        ListNode node=this;
       while (node.next!=null){
           if (node.getVal()!=val){
               node.setNext(node.next.getNext());
           }
       }
        return node;
    }

}