package com.leetcode;

import com.leetcode.bean.ListNode;
import com.leetcode.bean.TreeNode;
import com.leetcode.tree.ForEachTree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        ListNode ln=new ListNode(3
// );
//        ln.next=new ListNode(4);
//        ln.next.next=new ListNode(6);
//        ln.next.next.next=new ListNode(7);
//
//        //DeleteNode dn=new DeleteNode();
//        //dn.deleteNode(ln.next.next);
//        RemoveNthFromEnd rne=new RemoveNthFromEnd();
//        rne.removeNthFromEnd(ln,2);
//        while (ln!=null){
//        System.out.println(ln.val);
//        ln=ln.next;
//        }
        TreeNode tn=new TreeNode(5);
        tn.left=new TreeNode(1);
        tn.right=new TreeNode(6);
        tn.right.left=new TreeNode(3);
        tn.right.right=new TreeNode(7);
        //System.out.println(tn.left);
        //TreeHight th=new TreeHight();
        //System.out.println(th.maxDepth(tn));
        //SrechTree st=new SrechTree();
        //System.out.println(st.isValidBST(tn));
        ForEachTree fet=new ForEachTree();
        System.out.println(fet.levelOrder(tn));
        System.out.println(1^2);
        Stack<ListNode> s=new Stack();
        s.peek();
    }
}
