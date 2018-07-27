package com.leetcode.tree;

import com.leetcode.bean.TreeNode;

public class Array2Tree {
    public TreeNode getTree(int []nums,int l,int r){
        if(l <= r){
            int mid = (l+r)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getTree(nums,l,mid-1);
            node.right = getTree(nums,mid+1,r);
            return node;
        }else{
            return null;
        }
    }


    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};
        Array2Tree a2t=new Array2Tree();
        TreeNode root=a2t.getTree(nums,0,nums.length-1);
        System.out.println(root.left.val);
    }
}
