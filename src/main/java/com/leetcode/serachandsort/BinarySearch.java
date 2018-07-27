package com.leetcode.serachandsort;

public class BinarySearch {
    public int search(int[] arr,int item){
        int first=0;
        int len=arr.length-1;
        int intdex=-1;
        while (first<=len){
            int mid = (first + len) >>> 1;
            if(item==arr[mid]){
                return mid;
            }else if(item>arr[mid]){
                first=mid+1;
            }else {
                len=mid-1;
            }
        }
        return -1;
    }
    public int search2(int[] arr,int item,int first,int len){
        if (first>len){
            return -1;
        }
        int mid = (first + len) >>> 1;
        if(item==arr[mid]){
            return mid;
        }else if(item>arr[mid]){
            return search2(arr,item,mid+1,len);
        }else {
            return search2(arr,item,first,mid-1);
        }
    }
}