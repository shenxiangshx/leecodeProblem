package com.leetcode.algorithms.serch;


public class Serch {
    public int BinarySearch(int[] arr,int key){
        int l=0;
        int h=arr.length-1;
        while (l<h){
            int mid=l+(l+h)>>1;
            if (key>arr[mid]){
                l=mid+1;
            }else if (key<arr[mid]){
                h=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
