package com.leetcode.linkedlist;

import com.leetcode.bean.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        ListNode q=head;
        int i=0;
        while (p!=null){
            i++;
            if (i<n){
                p=p.next;
            }else {
                p=p.next;
                q=q.next;
            }
        }
        q.next=q.next.next;

        return q;
    }
}
