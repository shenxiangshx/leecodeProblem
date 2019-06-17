package com.leetcode.algorithms.merge;

import com.alibaba.fastjson.JSON;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=(m+n-2) -1;
        while (m>=0&&n>=0){
            nums1[p--]=nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        while (n>0){
            nums1[p--]=nums2[n--];
        }

    }

    public static void main(String[] args) {
        int[] a={1,4,6,0,0,0};
        int[] b=  {1,2,5};
        MergeArray.merge(a,3,b,2);
    }
}
