package com.leetcode.algorithms.serach;

import com.alibaba.fastjson.JSON;

public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newNums=new int[nums1.length+nums2.length];
        int m=0,i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            newNums[m++]=nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
        }
        while(i<nums1.length){
            newNums[m++]=nums1[i++];
        }
        while(j<nums2.length){
            newNums[m++]=nums2[j++];
        }
        if(newNums.length%2==0){
            return (newNums[(newNums.length-1)/2]+newNums[(newNums.length+1)/2])/2;
        }else{
            return newNums[newNums.length/2];
        }
    }

    public static void main(String[] args) {
        int[] a=new int[0];
        int[] b={1};
        System.out.println(JSON.toJSONString(FindMedianSortedArrays.findMedianSortedArrays(a,b)));
    }
}
