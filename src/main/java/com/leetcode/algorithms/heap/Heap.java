package com.leetcode.algorithms.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    private List<T> mHeap;
    public Heap(){
        this.mHeap = new ArrayList<>();
    }

    private void filterup(int start){
        int c=start;
        int p=(c-1)/2;
        T TmpEml=mHeap.get(c);
        while (c>0){
            int cmp = mHeap.get(p).compareTo(TmpEml);
            if (cmp>0){
                break;
            }else {
                mHeap.set(c, mHeap.get(p));
                c=p;
                p=(c-1)/2;
            }

        }
        mHeap.set(c, TmpEml);
    }

    protected void filterdown(int start, int end) {

        int c = start; // 被下调节点的初始位置
        int l = 2 * c + 1; // 左孩子节点的位置
        T tmp = mHeap.get(c); // 当前节点的值(大小)

        while (l <= end) {
            // 当前节点的左右节点进行比较
            int cmp = mHeap.get(l).compareTo(mHeap.get(l + 1));
            // 取大的
            if (l < end && cmp < 0) {
                l++;
            }
            // 当前节点和大的那个再比较一下
            cmp = tmp.compareTo(mHeap.get(l));
            if (cmp >= 0) {
                // 当前节点大,不用动
                break;
            } else {
                // 当前节点小,交换
                mHeap.set(c, mHeap.get(l));
                c = l; // 更新当前节点的位置
                l = 2 * c + 1; // 更新当前节点的左孩子位置
            }
        }
        mHeap.set(c, tmp);
    }

    private void insert(T data){
        int insertIndex=mHeap.size();
        mHeap.add(data);
        filterup(insertIndex);
    }

    private int remove(T data){
        if (mHeap.isEmpty()){
            return -1;
        }
        int index = mHeap.indexOf(data);
        if (index == -1) {
            return -1;
        }
        int size = mHeap.size();
        mHeap.set(index, mHeap.get(size - 1)); // 用最后一个元素填补
        mHeap.remove(size - 1); // 删除最后一个元素
        if (mHeap.size() > 1 && index < mHeap.size()) {
            // 调整成大顶堆
            filterdown(index, mHeap.size() - 1);
        }
        return 0;
    }
}
