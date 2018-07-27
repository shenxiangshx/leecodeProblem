package com.leetcode.tree;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;

public class TreeHight {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            System.out.println("left:"+left+"\t"+"right:"+right);
            return 1 + Math.max(left, right);
        }
    }
    public int maxDepthWhile(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode current=null;
        LinkedList<TreeNode> list=new LinkedList<TreeNode>();
        list.offer(root);
        int cur,last;
        int leve=0;
        while (!list.isEmpty()){
            cur=0;
            last=list.size();
            while (cur<last){
                current=list.poll();
                cur++;
                if(current.left!=null){
                    list.offer(current.left);
                }
                if (current.right!=null){
                    list.offer(current.right);
                }
            }
            leve++;
        }
        return leve;
    }
}
