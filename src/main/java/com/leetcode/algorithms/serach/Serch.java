package com.leetcode.algorithms.serach;


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

    public int BinarySearchRecursion(Comparable[] arr,Comparable key,int low,int high){
        if(arr.length==0||low>high||arr[low].compareTo(key)<0||arr[high].compareTo(key)>0){
            return -1;
        }
        int mid=(low+high)>>1;
        if (arr[mid].compareTo(key)<0){
            return BinarySearchRecursion(arr,key,low,mid-1);
        }else if(arr[mid].compareTo(key)>0){
            return BinarySearchRecursion(arr,key,mid+1,high);
        }else {
            return mid;
        }
    }
}
