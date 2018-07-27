package com.leetcode.tree;

import com.leetcode.bean.TreeNode;

public class SrechTree {
    public boolean isValidBST(TreeNode root) {
        if(root.right==null&&root.left==null){
            return true;
        }

        if(root.right.val>=root.val&&root.left.val<=root.val){
            boolean lb=isValidBST( root.left);
            boolean rb=isValidBST( root.right);
            return lb&&rb;
        }else {
            return false;
        }

    }
}
