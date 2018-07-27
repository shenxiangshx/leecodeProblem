package com.leetcode.tree;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForEachTree {

    public List<List<Integer>> levelOrder(TreeNode root) {
        return levelIterator(root);
    }
    public List<List<Integer>> levelIterator(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList();
        List<List<Integer>> lists=new ArrayList();
        List<Integer> liste=new ArrayList();
        if(root == null)
        {
            return lists;
        }
        TreeNode current = null;
        queue.offer(root);//将根节点入队
        while(!queue.isEmpty())
        {
            current = queue.poll();//出队队头元素并访问
            //System.out.print(current.val +"-->");
            liste.add(current.val);
            if(current.left != null)//如果当前节点的左节点不为空入队
            {
                queue.offer(current.left);
            }
            if(current.right != null)//如果当前节点的右节点不为空，把右节点入队
            {
                queue.offer(current.right);
            }
        }
        List<Integer> x=new ArrayList(1);
        lists.add(liste);
        return lists;
    }


}
