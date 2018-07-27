package com.leetcode.linkedlist;

import com.leetcode.bean.ListNode;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        if(node==null){
            return;
        }
        node.val=node.next.val;
        node.next= node.next.next;
    }
}
